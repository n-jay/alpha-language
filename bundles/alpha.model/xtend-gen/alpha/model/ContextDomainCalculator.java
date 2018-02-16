package alpha.model;

import alpha.model.AlphaExpression;
import alpha.model.AlphaNode;
import alpha.model.AlphaVisitable;
import alpha.model.ArgReduceExpression;
import alpha.model.CalculatorExpression;
import alpha.model.DependenceExpression;
import alpha.model.POLY_OBJECT_TYPE;
import alpha.model.ReduceExpression;
import alpha.model.SelectExpression;
import alpha.model.StandardEquation;
import alpha.model.UseEquation;
import alpha.model.issue.AlphaIssue;
import alpha.model.issue.ContextDomainIssue;
import alpha.model.util.AbstractAlphaExpressionVisitor;
import alpha.model.util.AbstractAlphaVisitor;
import alpha.model.util.AlphaUtil;
import com.google.common.base.Objects;
import fr.irisa.cairn.jnimap.isl.jni.JNIISLSet;
import fr.irisa.cairn.jnimap.runtime.JNIObject;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

@SuppressWarnings("all")
public class ContextDomainCalculator extends AbstractAlphaExpressionVisitor {
  private List<AlphaIssue> issues = new LinkedList<AlphaIssue>();
  
  public static List<AlphaIssue> calculate(final AlphaVisitable node) {
    final ContextDomainCalculator calc = new ContextDomainCalculator();
    node.accept(new AbstractAlphaVisitor() {
      @Override
      public void visitStandardEquation(final StandardEquation se) {
        se.getExpr().accept(calc);
      }
      
      @Override
      public void visitUseEquation(final UseEquation ue) {
        final Consumer<AlphaExpression> _function = (AlphaExpression a) -> {
          a.accept(calc);
        };
        ue.getInputExprs().forEach(_function);
        final Consumer<AlphaExpression> _function_1 = (AlphaExpression a) -> {
          a.accept(calc);
        };
        ue.getOutputExprs().forEach(_function_1);
      }
    });
    return calc.issues;
  }
  
  public static List<AlphaIssue> calculate(final AlphaExpression expr) {
    final ContextDomainCalculator calc = new ContextDomainCalculator();
    expr.accept(calc);
    return calc.issues;
  }
  
  private void registerIssue(final String errMsg, final AlphaNode node) {
    EObject _eContainer = node.eContainer();
    EStructuralFeature _eContainingFeature = node.eContainingFeature();
    ContextDomainIssue _contextDomainIssue = new ContextDomainIssue(AlphaIssue.TYPE.ERROR, errMsg, _eContainer, _eContainingFeature);
    this.issues.add(_contextDomainIssue);
  }
  
  @Override
  public void inAlphaExpression(final AlphaExpression ae) {
    EObject _eContainer = ae.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      throw new RuntimeException("Uncontained AlphaExpression");
    }
    JNIISLSet _expressionDomain = ae.getExpressionDomain();
    boolean _tripleEquals_1 = (_expressionDomain == null);
    if (_tripleEquals_1) {
      return;
    }
    EObject _eContainer_1 = ae.eContainer();
    final JNIISLSet parentContext = this.parentContext(((AlphaNode) _eContainer_1));
    if ((parentContext == null)) {
      return;
    }
    final JNIISLSet processedContext = this.processContext(ae.eContainer(), parentContext);
    if ((processedContext == null)) {
      return;
    }
    final Supplier<JNIISLSet> _function = () -> {
      return processedContext.intersect(ae.getExpressionDomain());
    };
    final JNIISLSet context = this.<JNIISLSet>runISLoperations(ae, _function);
    ae.setContextDomain(context);
  }
  
  private JNIISLSet _parentContext(final StandardEquation eq) {
    return eq.getVariable().getDomain();
  }
  
  private JNIISLSet _parentContext(final UseEquation ueq) {
    JNIISLSet _xifexpression = null;
    boolean _checkCalcExprType = this.checkCalcExprType(ueq.getInstantiationDomain(), POLY_OBJECT_TYPE.SET);
    if (_checkCalcExprType) {
      JNIObject _iSLObject = ueq.getInstantiationDomain().getISLObject();
      _xifexpression = ((JNIISLSet) _iSLObject);
    } else {
      return null;
    }
    return _xifexpression;
  }
  
  private JNIISLSet _parentContext(final AlphaExpression expr) {
    return expr.getContextDomain();
  }
  
  private JNIISLSet _processContext(final DependenceExpression expr, final JNIISLSet context) {
    final Supplier<JNIISLSet> _function = () -> {
      return context.apply(expr.getFunction().getISLMultiAff().toMap());
    };
    return this.<JNIISLSet>runISLoperations(expr, _function);
  }
  
  private JNIISLSet _processContext(final SelectExpression expr, final JNIISLSet context) {
    final Supplier<JNIISLSet> _function = () -> {
      return context.apply(expr.getSelectRelation());
    };
    return this.<JNIISLSet>runISLoperations(expr, _function);
  }
  
  private JNIISLSet _processContext(final ReduceExpression expr, final JNIISLSet context) {
    final Supplier<JNIISLSet> _function = () -> {
      return context.preimage(expr.getProjection().getISLMultiAff());
    };
    return this.<JNIISLSet>runISLoperations(expr, _function);
  }
  
  private JNIISLSet _processContext(final ArgReduceExpression expr, final JNIISLSet context) {
    final Supplier<JNIISLSet> _function = () -> {
      return context.preimage(expr.getProjection().getISLMultiAff());
    };
    return this.<JNIISLSet>runISLoperations(expr, _function);
  }
  
  private JNIISLSet _processContext(final AlphaNode expr, final JNIISLSet context) {
    return context;
  }
  
  private JNIISLSet _processContext(final EObject expr, final JNIISLSet context) {
    return null;
  }
  
  private <T extends Object> T runISLoperations(final AlphaExpression expr, final Supplier<T> r) {
    boolean _testNonNullExpressionDomain = AlphaUtil.testNonNullExpressionDomain(AlphaUtil.<AlphaExpression>getChildrenOfType(expr, AlphaExpression.class));
    if (_testNonNullExpressionDomain) {
      final Consumer<String> _function = (String err) -> {
        this.registerIssue(err, expr);
      };
      return AlphaUtil.<T>callISLwithErrorHandling(r, _function);
    }
    return null;
  }
  
  private boolean checkCalcExprType(final CalculatorExpression cexpr, final POLY_OBJECT_TYPE expected) {
    POLY_OBJECT_TYPE _type = cexpr.getType();
    boolean _notEquals = (!Objects.equal(_type, expected));
    if (_notEquals) {
      final String name = cexpr.eContainer().eClass().getName();
      String _name = expected.getName();
      String _plus = ((("Calculator Expression for a " + name) + " must evaluate to ") + _name);
      String _plus_1 = (_plus + ".");
      EObject _eContainer = cexpr.eContainer();
      EStructuralFeature _eContainingFeature = cexpr.eContainingFeature();
      ContextDomainIssue _contextDomainIssue = new ContextDomainIssue(
        AlphaIssue.TYPE.ERROR, _plus_1, _eContainer, _eContainingFeature);
      this.issues.add(_contextDomainIssue);
      return false;
    }
    return true;
  }
  
  private JNIISLSet parentContext(final AlphaNode expr) {
    if (expr instanceof AlphaExpression) {
      return _parentContext((AlphaExpression)expr);
    } else if (expr instanceof StandardEquation) {
      return _parentContext((StandardEquation)expr);
    } else if (expr instanceof UseEquation) {
      return _parentContext((UseEquation)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
  
  private JNIISLSet processContext(final EObject expr, final JNIISLSet context) {
    if (expr instanceof ArgReduceExpression) {
      return _processContext((ArgReduceExpression)expr, context);
    } else if (expr instanceof ReduceExpression) {
      return _processContext((ReduceExpression)expr, context);
    } else if (expr instanceof DependenceExpression) {
      return _processContext((DependenceExpression)expr, context);
    } else if (expr instanceof SelectExpression) {
      return _processContext((SelectExpression)expr, context);
    } else if (expr instanceof AlphaNode) {
      return _processContext((AlphaNode)expr, context);
    } else if (expr != null) {
      return _processContext(expr, context);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, context).toString());
    }
  }
}
