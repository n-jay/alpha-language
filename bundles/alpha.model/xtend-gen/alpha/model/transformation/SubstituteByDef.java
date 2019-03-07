package alpha.model.transformation;

import alpha.model.AlphaExpression;
import alpha.model.AlphaInternalStateConstructor;
import alpha.model.AlphaSystem;
import alpha.model.RestrictExpression;
import alpha.model.StandardEquation;
import alpha.model.SystemBody;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.VariableExpression;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Replaces a VariableExpression with the definition of the corresponding StandardEquation.
 * Variables defined through UseEquations cannot be substituted.
 * 
 * When the target equation is specified, the substitution only happens in the definition
 * of the target. Otherwise, all occurrences in an AlphaSystem (or SystemBody) are substituted.
 * 
 * Given
 *  X = Y;
 *  Y = E;
 * substituting Y in X gives:
 *  X = D : E
 * where D is the domain of Y.
 */
@SuppressWarnings("all")
public class SubstituteByDef extends AbstractAlphaCompleteVisitor {
  protected SystemBody systemBody;
  
  protected StandardEquation targetEquation;
  
  protected StandardEquation substituteEquation;
  
  private SubstituteByDef(final SystemBody systemBody, final StandardEquation targetEquation, final StandardEquation substituteEquation) {
    this.systemBody = systemBody;
    this.targetEquation = targetEquation;
    this.substituteEquation = substituteEquation;
  }
  
  public static void apply(final AlphaSystem system, final Variable substituteVar) {
    final Consumer<SystemBody> _function = (SystemBody body) -> {
      SubstituteByDef.apply(body, substituteVar);
    };
    system.getSystemBodies().forEach(_function);
  }
  
  public static void apply(final AlphaSystem system, final StandardEquation targetEq, final Variable substituteVar) {
    final Consumer<SystemBody> _function = (SystemBody body) -> {
      SubstituteByDef.apply(body, targetEq, substituteVar);
    };
    system.getSystemBodies().forEach(_function);
  }
  
  public static void apply(final SystemBody body, final Variable substituteVar) {
    SubstituteByDef.apply(body, null, substituteVar);
  }
  
  public static void apply(final SystemBody body, final StandardEquation targetEq, final Variable substituteVar) {
    final StandardEquation subEq = body.getStandardEquation(substituteVar);
    final SubstituteByDef visitor = new SubstituteByDef(body, targetEq, subEq);
    visitor.accept(body);
  }
  
  @Override
  public void visitUseEquation(final UseEquation ue) {
    return;
  }
  
  @Override
  public void visitStandardEquation(final StandardEquation se) {
    if (((this.targetEquation == null) || Objects.equal(se, this.targetEquation))) {
      super.visitStandardEquation(se);
    }
    return;
  }
  
  @Override
  public void outVariableExpression(final VariableExpression ve) {
    Variable _variable = ve.getVariable();
    Variable _variable_1 = this.substituteEquation.getVariable();
    boolean _equals = Objects.equal(_variable, _variable_1);
    if (_equals) {
      final RestrictExpression substituteExpr = AlphaUserFactory.createRestrictExpression(this.substituteEquation.getVariable().getDomain(), EcoreUtil.<AlphaExpression>copy(this.substituteEquation.getExpr()));
      EcoreUtil.replace(ve, substituteExpr);
      AlphaInternalStateConstructor.recomputeContextDomain(substituteExpr);
    }
  }
}
