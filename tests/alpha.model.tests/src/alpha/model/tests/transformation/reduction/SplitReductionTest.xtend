package alpha.model.tests.transformation.reduction

import alpha.model.ReduceExpression
import org.junit.Test

import static alpha.commands.UtilityBase.GetEquation
import static alpha.commands.UtilityBase.GetSystem
import static alpha.model.tests.util.AlphaTestUtil.loadValidFile
import static org.junit.Assert.*

import static extension alpha.model.transformation.reduction.SplitReduction.construct1DBasis
import static extension alpha.model.transformation.reduction.SplitReduction.constructSplit
import static extension alpha.model.transformation.reduction.SplitReduction.enumerateCandidateSplits
import static extension alpha.model.transformation.reduction.SplitReduction.isUseful
import static extension alpha.model.util.ISLUtil.toISLBasicSet
import static extension alpha.model.util.ISLUtil.toISLConstraint
import static extension alpha.model.util.ISLUtil.toISLMultiAff

class SplitReductionTest {
	
	/*
	 * construct1DBasis tests
	 * 
	 * Given a reduce expression of the form:
	 *   reduce(op, fp, fd@(E))
	 * 
	 * where:
	 *   fp is the projection function (characterizing accumulation)
	 *   fd is the dependence function (characterizing reuse)
	 * 
	 * When the null space of fp or fd is 1D, the construct1DBasis function  
	 * constructs a new ISLMultiAff that points "along" this 1D null space.
	 * The vector of the constant terms in each output dimension can be 
	 * viewed as a basis vector that spans the 1D null space.
	 * 
	 * For example: 
	 * 
	 * If fp (or fd) is (i,j->i) then construct1DBasis should return
	 * the following ISLMultiAff:
	 *   {[i,j]->[i,j+1]}
	 * because the vector of output dim's constants is <0,1> which spans
	 * the null space of (i,j->i).
	 * 
	 * If fp (or fd) is (i,j->i+j) then it should return:
	 *   {[i,j]->[i+1,j-1]}
	 * and <1,-1> spans the null space of (i,j->i+j)
	 * 
	 * If fp (or fd) is (i,j,k->i+j) then it should return:
	 *   null
	 * becuase the null space of (i,j,k->i+j) is 2D and can't be represented
	 * by a 1D basis.
	 * 
	 */ 
	
	@Test
	def void construct1DBasis_01() {
		val maff = '[N]->{[i,j,k]->[i,j]}'.toISLMultiAff
		val basis = maff.construct1DBasis.affs.map[getConstant]
		assertEquals(basis.toString, '[0, 0, 1]')
	}
	
	@Test
	def void construct1DBasis_02() {
		val maff = '[N]->{[i,j,k]->[i,7j-k]}'.toISLMultiAff
		val basis = maff.construct1DBasis.affs.map[getConstant]
		assertEquals(basis.toString, '[0, 1, 7]')
	}
	
	@Test
	def void construct1DBasis_03() {
		val maff = '[N]->{[i,j,k]->[i]}'.toISLMultiAff
		val basis = maff.construct1DBasis
		assertNull(basis)
	}
	
	/*
	 * constructSplit tests
	 * 
	 * Given an ISLMaff and an ISLBasicSet, constructSplit "extends" the
	 * basic set infinitely along the direction encoded by the maff. The 
	 * extension is performed by applying the transitive closure of maff 
	 * to the basicSet. This has the effect of increasing the dimensionality
	 * of the basicSet by one, assuming that the space spanned by the 
	 * transitive closure is not already saturated by the set. If the set 
	 * saturates the transitive closure then "null" is returned.
	 * 
	 * Examples:
	 * 
	 * 1) Given the following:
	 *    basicSet: [N]->{[i,j] : i=N and j=0}
	 *    maff: [N]->{[i,j]->[i,j+1]}
	 * 
	 * Here the transitive closure of maff is {[i,j]->[i,o1]} (i.e., j is 
	 * unbounded). The following basicSet is returned:
	 *    [N]->{[i,j] : i=N}
	 * Notice the input set is 0D and the output is 1D.
	 * 
	 * 2) Given the following:
	 *    basicSet: [N]->{[i,j,k] : i=0 and j=0}
	 *    maff: [N]->{[i,j,k]->[i+1,j+1,k]}
	 * 
	 * Geometrically, basicSet represents the k-axis and we are extending this
	 * by the vector <1,1,0>, which gives the 2D plane parallel to the k-axis
	 * intesecting the line i=j in the ij-plane. The following set is returned:
	 *    [N]->{[i,j,k] : i=j}
	 * 
	 * 3) Given the following:
	 *    basicSet: [N]->{[i,j,k] : i=0 and j=0}
	 *    maff: [N]->{[i,j,k]->[i,j,k+1]}
	 * 
	 * Here, the set saturates the transitive closure. The basicSet is same as
	 * example 2. Extending this set by the vector <0,0,1> leaves the same set
	 * because here we try to extend the k-axis along the k direction. The
	 * following is returned:
	 *    null
	 */
	 
	@Test
	def void constructSplit_00() {
		val bset = '[N]->{[i,j] : i=N and j=0}'.toISLBasicSet
		val maff = '[N]->{[i,j]->[i,j+1]}'.toISLMultiAff
		assertEquals(bset.constructSplit(maff).toString, '[N] -> { [i, j] : -N + i = 0 }')
	}
	
	@Test
	def void constructSplit_01() {
		val bset = '[N]->{[i,j] : i=N and j=0}'.toISLBasicSet
		val maff = '[N]->{[i,j]->[i+1,j]}'.toISLMultiAff
		assertEquals(bset.constructSplit(maff).toString, '[N] -> { [i, j] : j = 0 }')
	}
	
	@Test
	def void constructSplit_02() {
		val bset = '[N]->{[i,j,k] : i=0 and j=0}'.toISLBasicSet
		val maff = '[N]->{[i,j,k]->[i+1,j+1,k]}'.toISLMultiAff
		assertEquals(bset.constructSplit(maff).toString, '[N] -> { [i, j, k] : -i + j = 0 }')
	}
	
	@Test
	def void constructSplit_03() {
		val bset = '[N]->{[i,j,k] : i=0 and j=0}'.toISLBasicSet
		val maff = '[N]->{[i,j,k]->[i,j,k+1]}'.toISLMultiAff
		assertNull(bset.constructSplit(maff))
	}
	
	/*
	 * isUseful tests
	 * 
	 * Given an ISLConstraint and an ISLBasicSet this function should return
	 * true if there are points in the set on both sides of the constraint 
	 * (i.e., the constraint actually splits the set into two non-empty pieces)
	 */
	 
	 @Test
	 def void isUseful_00() {
	 	val split1 = '[N]->{[i,j] : i=0}'.toISLConstraint
	 	val split2 = '[N]->{[i,j] : i=N}'.toISLConstraint
	 	val split3 = '[N]->{[i,j] : j=0}'.toISLConstraint
	 	val split4 = '[N]->{[i,j] : j=N}'.toISLConstraint
	 	val split5 = '[N]->{[i,j] : j=N-i}'.toISLConstraint
	 	val bset = '[N]->{[i,j] : 0<=j<=i<N}'.toISLBasicSet
	 	
	 	assertFalse(split1.isUseful(bset))
	 	assertFalse(split2.isUseful(bset))
	 	assertFalse(split3.isUseful(bset))
	 	assertFalse(split4.isUseful(bset))
	 	assertTrue(split5.isUseful(bset)) 
	 }
	
	/*
	 * enumerateCandidateSplits tests
	 * 
	 * Given a reduceExpression, this function reports all of the useful splits
	 * that can be constructed. Each split must saturate either the null space of
	 * the projection function or the dependence function (charaterizing the 
	 * reuse space). These tests simply assert that the number of splits matches
	 * what is expected.
	 */
	
	@Test
	def void enumerateCandidateSplits_00() {
		val root = loadValidFile('transformation-reduction-tests/split-reduction/splitReduction.alpha')
		val systemBody = GetSystem(root, 'ex_2d').systemBodies.get(0)
		val reduceExpr = GetEquation(systemBody, 'Y').expr as ReduceExpression
		val splits = reduceExpr.enumerateCandidateSplits
		
		assertEquals(splits.size, 1)
	}
	
	@Test
	def void enumerateCandidateSplits_01() {
		val root = loadValidFile('transformation-reduction-tests/split-reduction/splitReduction.alpha')
		val systemBody = GetSystem(root, 'ex_3d').systemBodies.get(0)
		val reduceExpr = GetEquation(systemBody, 'Y').expr as ReduceExpression
		val splits = reduceExpr.enumerateCandidateSplits
		
		assertEquals(splits.size, 3)
	}
	
}