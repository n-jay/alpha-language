package alpha.model.tests.util

import org.junit.Test

import static org.junit.Assert.*
import fr.irisa.cairn.jnimap.isl.ISLBasicSet
import fr.irisa.cairn.jnimap.isl.ISLContext
import alpha.model.util.Face

class FaceTest {
	////////////////////////////////////////////////////////////
	// Face Creation
	////////////////////////////////////////////////////////////
	
	/** Creates a face from the desired set. */
	private static def makeFace(String setDescriptor) {
		val set = ISLBasicSet.buildFromString(ISLContext.instance, setDescriptor).removeRedundancies
		return new Face(set)
	}
	
	/** The empty set. */
	static def emptySet() { makeFace("{[i,j]: 0<i<j and j<0}") }
	
	/** A set containing a single point. */
	static def vertex() { makeFace("{[i,j]: i=0 and j=1}")}
	
	/** A line which is infinite in both directions. */
	static def infiniteLine() { makeFace("{[i]:}")}
	
	/** A ray, or a line which has one point and extends infinitely in one direction. */
	static def ray() { makeFace("{[i]: 0<=i}")}
	
	/** A line segment which is defined between two constants. */
	static def constantLineSegment() { makeFace("{[i]: 0<=i<=10}")}
	
	/** A line segment from 0 to N. */
	static def parameterizedLineSegment() { makeFace("[N]->{[i]: 0<=i<N}")}
	
	
	////////////////////////////////////////////////////////////
	// Unit Tests
	////////////////////////////////////////////////////////////
	
	/** Checks that the number of children of a face is correct. */
	static def assertChildCount(Face face, int expectedChildren) {
		assertEquals(expectedChildren, face.generateChildren.size)
	}

	@Test def testChildCount_01() { emptySet.assertChildCount(0) }
	@Test def testChildCount_02() { vertex.assertChildCount(0) }
	@Test def testChildCount_03() { infiniteLine.assertChildCount(0) }
	@Test def testChildCount_04() { ray.assertChildCount(1) }
	@Test def testChildCount_05() { constantLineSegment.assertChildCount(0) }
	@Test def testChildCount_06() { parameterizedLineSegment.assertChildCount(2) }
	
	/** Checks that the dimensionality of a face is correct. */
	static def assertDimensionality(Face face, int expectedDimensionality) {
		assertEquals(expectedDimensionality, face.dimensionality)
	}
	
	@Test def testDimensionality_01() { emptySet.assertDimensionality(0) }
	@Test def testDimensionality_02() { vertex.assertDimensionality(0) }
	@Test def testDimensionality_03() { infiniteLine.assertDimensionality(1) }
	@Test def testDimensionality_04() { ray.assertDimensionality(1) }
	@Test def testDimensionality_05() { parameterizedLineSegment.assertDimensionality(1) }
	
	/**
	 * If a line segment is bounded by two constants, the constraints are effectively saturated,
	 * resulting in the face being reported as being effectively the same as a vertex.
	 */
	@Test def testDimensionality_06() { constantLineSegment.assertDimensionality(0) }
}