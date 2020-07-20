package alpha.targetmapping.construction;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;

import alpha.model.JNIDomainInArrayNotation;
import alpha.model.impl.ModelFactoryImpl;
import alpha.targetmapping.JNIIdentityFunction;
import alpha.targetmapping.PointLoopSpecification;
import alpha.targetmapping.ScheduleTargetRestrictDomain;
import alpha.targetmapping.TileLoopSpecification;
import alpha.targetmapping.impl.TargetmappingFactoryImpl;
import alpha.targetmapping.util.TargetmappingSwitch;

/**
 * Post-processor of parsed TargetMapping objects.
 * For TargetMapping, it is responsible for creating universe sets when ScheduleTargetRestrictDomain
 * only restricts the domain to a schedule target.
 * 
 * See alpha.model.construction.AlphaCustomASTFactory in alpha.model.xtext for more details about how this works.
 * 
 * Note that container relationship is not complete at this stage of parsing. Only
 * children nodes may be referred when supplying default values.
 * 
 * @author tyuki
 *
 */
public class TargetMappingCustomASTFactory extends DefaultEcoreElementFactory {
	
	protected PostProcessor ppInstance = new PostProcessor();
	
	@Override
	public EObject create(EClassifier classifier) {
		EObject obj = super.create(classifier);
		
		ppInstance.doSwitch(obj);
		
		return obj;
	}

	
	protected class PostProcessor extends TargetmappingSwitch<EObject> {
		
		@Override
		public EObject caseScheduleTargetRestrictDomain(ScheduleTargetRestrictDomain object) {
			if (object.getRestrictDomainExpr() == null) {
				JNIDomainInArrayNotation universeDom = ModelFactoryImpl.eINSTANCE.createJNIDomainInArrayNotation();
				universeDom.setIslString("");
				object.setRestrictDomainExpr(universeDom);
			}

			return super.caseScheduleTargetRestrictDomain(object);
		}
		
		@Override
		public EObject caseTileLoopSpecification(TileLoopSpecification object) {
			if (object.getLoopScheduleExpr() == null) {
				JNIIdentityFunction identity = TargetmappingFactoryImpl.eINSTANCE.createJNIIdentityFunction();
				object.setLoopScheduleExpr(identity);
			}
			return super.caseTileLoopSpecification(object);
		}
		
		@Override
		public EObject casePointLoopSpecification(PointLoopSpecification object) {
			if (object.getLoopScheduleExpr() == null) {
				JNIIdentityFunction identity = TargetmappingFactoryImpl.eINSTANCE.createJNIIdentityFunction();
				object.setLoopScheduleExpr(identity);
			}
			
			return super.casePointLoopSpecification(object);
		}
	}

}
