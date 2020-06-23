/**
 */
package alpha.targetmapping.util;

import alpha.model.AlphaScheduleTarget;

import alpha.targetmapping.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see alpha.targetmapping.TargetmappingPackage
 * @generated
 */
public class TargetmappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetmappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetmappingSwitch() {
		if (modelPackage == null) {
			modelPackage = TargetmappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TargetmappingPackage.TARGET_MAPPING_NODE: {
				TargetMappingNode targetMappingNode = (TargetMappingNode)theEObject;
				T result = caseTargetMappingNode(targetMappingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.TARGET_MAPPING_VISITABLE: {
				TargetMappingVisitable targetMappingVisitable = (TargetMappingVisitable)theEObject;
				T result = caseTargetMappingVisitable(targetMappingVisitable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.TARGET_MAPPING_VISITOR: {
				TargetMappingVisitor targetMappingVisitor = (TargetMappingVisitor)theEObject;
				T result = caseTargetMappingVisitor(targetMappingVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.SCOPING_ENTITY: {
				ScopingEntity scopingEntity = (ScopingEntity)theEObject;
				T result = caseScopingEntity(scopingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.TARGET_MAPPING: {
				TargetMapping targetMapping = (TargetMapping)theEObject;
				T result = caseTargetMapping(targetMapping);
				if (result == null) result = caseTargetMappingNode(targetMapping);
				if (result == null) result = caseTargetMappingVisitable(targetMapping);
				if (result == null) result = caseScopingEntity(targetMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.ABSTRACT_MAPPING: {
				AbstractMapping abstractMapping = (AbstractMapping)theEObject;
				T result = caseAbstractMapping(abstractMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.SPACE_TIME_MAPPING: {
				SpaceTimeMapping spaceTimeMapping = (SpaceTimeMapping)theEObject;
				T result = caseSpaceTimeMapping(spaceTimeMapping);
				if (result == null) result = caseAbstractMapping(spaceTimeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.MEMORY_MAPPING: {
				MemoryMapping memoryMapping = (MemoryMapping)theEObject;
				T result = caseMemoryMapping(memoryMapping);
				if (result == null) result = caseAbstractMapping(memoryMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.MEMORY_SPACE: {
				MemorySpace memorySpace = (MemorySpace)theEObject;
				T result = caseMemorySpace(memorySpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.SCHEDULE_TREE_EXPRESSION: {
				ScheduleTreeExpression scheduleTreeExpression = (ScheduleTreeExpression)theEObject;
				T result = caseScheduleTreeExpression(scheduleTreeExpression);
				if (result == null) result = caseTargetMappingNode(scheduleTreeExpression);
				if (result == null) result = caseTargetMappingVisitable(scheduleTreeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.CONTEXT_EXPRESSION: {
				ContextExpression contextExpression = (ContextExpression)theEObject;
				T result = caseContextExpression(contextExpression);
				if (result == null) result = caseScheduleTreeExpression(contextExpression);
				if (result == null) result = caseTargetMappingNode(contextExpression);
				if (result == null) result = caseTargetMappingVisitable(contextExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.SET_EXPRESSION: {
				SetExpression setExpression = (SetExpression)theEObject;
				T result = caseSetExpression(setExpression);
				if (result == null) result = caseScheduleTreeExpression(setExpression);
				if (result == null) result = caseTargetMappingNode(setExpression);
				if (result == null) result = caseTargetMappingVisitable(setExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.SEQUENCE_EXPRESSION: {
				SequenceExpression sequenceExpression = (SequenceExpression)theEObject;
				T result = caseSequenceExpression(sequenceExpression);
				if (result == null) result = caseScheduleTreeExpression(sequenceExpression);
				if (result == null) result = caseTargetMappingNode(sequenceExpression);
				if (result == null) result = caseTargetMappingVisitable(sequenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.FILTER_EXPRESSION: {
				FilterExpression filterExpression = (FilterExpression)theEObject;
				T result = caseFilterExpression(filterExpression);
				if (result == null) result = caseScheduleTreeExpression(filterExpression);
				if (result == null) result = caseScopingEntity(filterExpression);
				if (result == null) result = caseTargetMappingNode(filterExpression);
				if (result == null) result = caseTargetMappingVisitable(filterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.SCHEDULE_TARGET_RESTRICT_DOMAIN: {
				ScheduleTargetRestrictDomain scheduleTargetRestrictDomain = (ScheduleTargetRestrictDomain)theEObject;
				T result = caseScheduleTargetRestrictDomain(scheduleTargetRestrictDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.GUARD_EXPRESSION: {
				GuardExpression guardExpression = (GuardExpression)theEObject;
				T result = caseGuardExpression(guardExpression);
				if (result == null) result = caseScheduleTreeExpression(guardExpression);
				if (result == null) result = caseTargetMappingNode(guardExpression);
				if (result == null) result = caseTargetMappingVisitable(guardExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.MARK_EXPRESSION: {
				MarkExpression markExpression = (MarkExpression)theEObject;
				T result = caseMarkExpression(markExpression);
				if (result == null) result = caseScheduleTreeExpression(markExpression);
				if (result == null) result = caseTargetMappingNode(markExpression);
				if (result == null) result = caseTargetMappingVisitable(markExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.BAND_EXPRESSION: {
				BandExpression bandExpression = (BandExpression)theEObject;
				T result = caseBandExpression(bandExpression);
				if (result == null) result = caseScheduleTreeExpression(bandExpression);
				if (result == null) result = caseTargetMappingNode(bandExpression);
				if (result == null) result = caseTargetMappingVisitable(bandExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.BAND_PIECE: {
				BandPiece bandPiece = (BandPiece)theEObject;
				T result = caseBandPiece(bandPiece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.LOOP_TYPE_SPECIFICATION: {
				LoopTypeSpecification loopTypeSpecification = (LoopTypeSpecification)theEObject;
				T result = caseLoopTypeSpecification(loopTypeSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.ISOLATE_SPECIFICATION: {
				IsolateSpecification isolateSpecification = (IsolateSpecification)theEObject;
				T result = caseIsolateSpecification(isolateSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.BAND_PIECE_FOR_REDUCTION_BODY: {
				BandPieceForReductionBody bandPieceForReductionBody = (BandPieceForReductionBody)theEObject;
				T result = caseBandPieceForReductionBody(bandPieceForReductionBody);
				if (result == null) result = caseBandPiece(bandPieceForReductionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.EXTENSION_EXPRESSION: {
				ExtensionExpression extensionExpression = (ExtensionExpression)theEObject;
				T result = caseExtensionExpression(extensionExpression);
				if (result == null) result = caseScheduleTreeExpression(extensionExpression);
				if (result == null) result = caseScopingEntity(extensionExpression);
				if (result == null) result = caseTargetMappingNode(extensionExpression);
				if (result == null) result = caseTargetMappingVisitable(extensionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetmappingPackage.EXTENSION_TARGET: {
				ExtensionTarget extensionTarget = (ExtensionTarget)theEObject;
				T result = caseExtensionTarget(extensionTarget);
				if (result == null) result = caseAlphaScheduleTarget(extensionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Mapping Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Mapping Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMappingNode(TargetMappingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Mapping Visitable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Mapping Visitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMappingVisitable(TargetMappingVisitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Mapping Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Mapping Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMappingVisitor(TargetMappingVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoping Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoping Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopingEntity(ScopingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetMapping(TargetMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMapping(AbstractMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Time Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Time Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpaceTimeMapping(SpaceTimeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryMapping(MemoryMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemorySpace(MemorySpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Tree Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Tree Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleTreeExpression(ScheduleTreeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextExpression(ContextExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExpression(SetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceExpression(SequenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterExpression(FilterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Target Restrict Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Target Restrict Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleTargetRestrictDomain(ScheduleTargetRestrictDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardExpression(GuardExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkExpression(MarkExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Band Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Band Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandExpression(BandExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Band Piece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Band Piece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandPiece(BandPiece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Type Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopTypeSpecification(LoopTypeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isolate Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isolate Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsolateSpecification(IsolateSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Band Piece For Reduction Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Band Piece For Reduction Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandPieceForReductionBody(BandPieceForReductionBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionExpression(ExtensionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionTarget(ExtensionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha Schedule Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha Schedule Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphaScheduleTarget(AlphaScheduleTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TargetmappingSwitch
