package alpha.codegen;

import alpha.model.util.CommonExtensions;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Used for checking if a variable declaration exists in a list
 * and adding it to that list if it doesn't.
 */
@SuppressWarnings("all")
public class NameChecker {
  /**
   * Adds a new variable declaration to an existing list of declarations
   * only if the new variable hasn't been declared yet.
   * If there is an existing declaration with the same name but a different type,
   * an IllegalArgumentException will be thrown.
   * Otherwise, if there is an existing declaration with both the same name
   * and same type, nothing will happen.
   * 
   * Returns true if the variable was added (i.e., it's a new variable),
   * false if the variable was not added (i.e., it's an exact duplicate),
   * or throws an IllegalArgumentException if it's a duplicate name with
   * a differing type.
   */
  public static boolean checkAdd(final List<VariableDecl> existing, final VariableDecl toAdd) throws IllegalArgumentException {
    final Function1<VariableDecl, Boolean> _function = (VariableDecl it) -> {
      return Boolean.valueOf(NameChecker.hasSameName(it, toAdd));
    };
    final ArrayList<VariableDecl> sameName = CommonExtensions.<VariableDecl>toArrayList(IterableExtensions.<VariableDecl>filter(existing, _function));
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(sameName);
    if (_isNullOrEmpty) {
      existing.add(toAdd);
      return true;
    }
    final Function1<VariableDecl, Boolean> _function_1 = (VariableDecl it) -> {
      return Boolean.valueOf(NameChecker.hasDifferentType(it, toAdd));
    };
    boolean _exists = IterableExtensions.<VariableDecl>exists(sameName, _function_1);
    if (_exists) {
      String _name = toAdd.getName();
      String _plus = ("Duplicate declarations for variable \'" + _name);
      String _plus_1 = (_plus + "\' with different types.");
      throw new IllegalArgumentException(_plus_1);
    }
    return false;
  }

  /**
   * Returns true if the two variables have the same name, and false otherwise.
   */
  protected static boolean hasSameName(final VariableDecl first, final VariableDecl second) {
    String _name = first.getName();
    String _name_1 = second.getName();
    return Objects.equal(_name, _name_1);
  }

  /**
   * Returns true if the two variables have different types, and false otherwise.
   */
  protected static boolean hasDifferentType(final VariableDecl first, final VariableDecl second) {
    return ((!Objects.equal(first.getDataType().getBaseType(), second.getDataType().getBaseType())) || (first.getDataType().getIndirectionLevel() != second.getDataType().getIndirectionLevel()));
  }
}
