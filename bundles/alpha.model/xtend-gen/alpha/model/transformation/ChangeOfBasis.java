package alpha.model.transformation;

import alpha.model.AlphaSystem;
import alpha.model.DependenceExpression;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.Variable;
import alpha.model.VariableExpression;
import alpha.model.factory.AlphaUserFactory;
import alpha.model.util.AbstractAlphaCompleteVisitor;
import alpha.model.util.AffineFuntionOperations;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLDimType;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLMultiAff;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ChangeOfBasis extends AbstractAlphaCompleteVisitor {
  private ChangeOfBasis(final AlphaSystem system, final Variable variable, final JNIISLMultiAff f) {
    this.CoBfunction = f;
    this.target = variable;
    this.CoBfunctionInverse = AffineFuntionOperations.inverseInContext(this.CoBfunction, null, f.getSpace().getNameList(JNIISLDimType.isl_dim_in));
  }
  
  private JNIISLMultiAff CoBfunction;
  
  private JNIISLMultiAff CoBfunctionInverse;
  
  private Variable target;
  
  public static void apply(final AlphaSystem system, final String varName, final JNIISLMultiAff f) {
    final Function1<Variable, Boolean> _function = (Variable v) -> {
      return Boolean.valueOf(v.getName().contentEquals(varName));
    };
    final Variable variable = IterableExtensions.<Variable>findFirst(system.getVariables(), _function);
    if ((variable == null)) {
      String _format = String.format("Variable %s not found.", varName);
      throw new RuntimeException(_format);
    }
    final ChangeOfBasis CoB = new ChangeOfBasis(system, variable, f);
    system.accept(CoB);
  }
  
  @Override
  public void inVariable(final Variable variable) {
    boolean _equals = Objects.equal(variable, this.target);
    if (_equals) {
      final JNIISLSet newDom = variable.getDomain().apply(this.CoBfunction.copy().toMap());
      variable.setDomainExpr(AlphaUserFactory.createJNIDomain(newDom));
    }
  }
  
  @Override
  public void inStandardEquation(final StandardEquation se) {
    Variable _variable = se.getVariable();
    boolean _equals = Objects.equal(_variable, this.target);
    if (_equals) {
      final DependenceExpression newExpr = AlphaUserFactory.createDependenceExpression(this.CoBfunctionInverse.copy(), se.getExpr());
      se.setExpr(newExpr);
    }
  }
  
  @Override
  public void outVariableExpression(final VariableExpression ve) {
    Variable _variable = ve.getVariable();
    boolean _equals = Objects.equal(_variable, this.target);
    if (_equals) {
      final DependenceExpression newExpr = AlphaUserFactory.createDependenceExpression(this.CoBfunction.copy());
      EcoreUtil.replace(ve, newExpr);
      newExpr.setExpr(ve);
    }
  }
  
  @Override
  public void inUseEquation(final UseEquation ue) {
    super.inUseEquation(ue);
  }
}
