/**
 */
package alpha.codegen.impl;

import alpha.codegen.CodegenPackage;
import alpha.codegen.CommentStmt;

import com.google.common.collect.Iterables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alpha.codegen.impl.CommentStmtImpl#getCommentLines <em>Comment Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentStmtImpl extends MinimalEObjectImpl.Container implements CommentStmt {
	/**
	 * The cached value of the '{@link #getCommentLines() <em>Comment Lines</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentLines()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commentLines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentStmtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.COMMENT_STMT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCommentLines() {
		if (commentLines == null) {
			commentLines = new EDataTypeEList<String>(String.class, this, CodegenPackage.COMMENT_STMT__COMMENT_LINES);
		}
		return commentLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAll(final Iterable<String> lines) {
		final Function1<String, List<String>> _function = new Function1<String, List<String>>() {
			public List<String> apply(final String it) {
				return IterableExtensions.<String>toList(((Iterable<String>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(it.split("\n"))));
			}
		};
		final Iterable<String> separated = IterableExtensions.<String, String>flatMap(lines, _function);
		Iterables.<String>addAll(this.getCommentLines(), separated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.COMMENT_STMT__COMMENT_LINES:
				return getCommentLines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.COMMENT_STMT__COMMENT_LINES:
				getCommentLines().clear();
				getCommentLines().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegenPackage.COMMENT_STMT__COMMENT_LINES:
				getCommentLines().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegenPackage.COMMENT_STMT__COMMENT_LINES:
				return commentLines != null && !commentLines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CodegenPackage.COMMENT_STMT___ADD_ALL__ITERABLE:
				addAll((Iterable<String>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (commentLines: ");
		result.append(commentLines);
		result.append(')');
		return result.toString();
	}

} //CommentStmtImpl
