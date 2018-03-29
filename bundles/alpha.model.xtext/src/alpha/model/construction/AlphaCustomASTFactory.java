package alpha.model.construction;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;

import alpha.model.ExternalMultiArgExpression;
import alpha.model.ExternalReduceExpression;
import alpha.model.JNIDomain;
import alpha.model.REDUCTION_OP;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.impl.ModelFactoryImpl;
import alpha.model.util.ModelSwitch;

/**
 * This class can be injected at AlphaRuntimeModule to replace the default factory
 * when the Xtext parser creates Alpha objects. 
 * 
 * The PostProcessor can be used to modify created model instances.
 * It is useful to supply default values.
 * 
 * 
 * MEMO of older usage
 * It was originally used to add code for computing the domains using the context. 
 * There were a couple of issues that made this custom factory difficult to do its 
 * intended task:
 *  1. With partial parsing, the constructor does not have any context information.
 *  This issue had a workaround to listen for set/add instead of create, and run
 *  the domain calculator when a system was added to root. In this case, the entire
 *  system has been built. 
 *  2. At the time of AST creation, EReferences are not resolved yet. You cannot 
 *  get the full view of the model until after the linking phase.
 * and thus it is no longer used.   
 * 
 * @author tyuki
 *
 */
public class AlphaCustomASTFactory extends DefaultEcoreElementFactory {
	
	protected PostProcessor ppInstance = new PostProcessor();
	
	@Override
	public EObject create(EClassifier classifier) {
		EObject obj = super.create(classifier);
		
		ppInstance.doSwitch(obj);
		
		return obj;
	}

	
	protected class PostProcessor extends ModelSwitch<EObject> {
	
		@Override
		public EObject caseVariable(Variable object) {
			if (object.getDomainExpr() == null) {
				JNIDomain scalarDom = ModelFactoryImpl.eINSTANCE.createJNIDomain();
				scalarDom.setIslString("{ [] : }");
				object.setDomainExpr(scalarDom);
			}
			return super.caseVariable(object);
		}
		
		@Override
		public EObject caseExternalMultiArgExpression(ExternalMultiArgExpression object) {
			object.setOperator(REDUCTION_OP.EX);
			return super.caseExternalMultiArgExpression(object);
		}
		
		@Override
		public EObject caseExternalReduceExpression(ExternalReduceExpression object) {
			object.setOperator(REDUCTION_OP.EX);
			return super.caseExternalReduceExpression(object);
		}
		
		@Override
		public EObject caseUseEquation(UseEquation object) {
			if (object.getInstantiationDomainExpr() == null) {
				JNIDomain scalarDom = ModelFactoryImpl.eINSTANCE.createJNIDomain();
				scalarDom.setIslString("{ [] : }");
				object.setInstantiationDomainExpr(scalarDom);
			}
				
			return super.caseUseEquation(object);
		}
	}
}
