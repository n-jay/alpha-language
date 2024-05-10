package alpha.codegen;

import alpha.model.util.CommonExtensions;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Used for checking if a variable declaration exists in a list
 * and adding it to that list if it doesn't.
 */
@SuppressWarnings("all")
public class NameChecker {
  /**
   * The set of all names declared at the global scope.
   */
  protected final HashSet<String> globalNames;

  /**
   * If true, a local variable is not allowed to have the same name as a global variable.
   */
  protected final boolean preventShadowing;

  /**
   * Creates a new name checker that prevents shadowing global variables.
   */
  public NameChecker() {
    this(true);
  }

  /**
   * Creates a new name checker.
   */
  public NameChecker(final boolean preventShadowing) {
    this.globalNames = CollectionLiterals.<String>newHashSet();
    this.preventShadowing = preventShadowing;
  }

  /**
   * Checks if all the given global variables are unique and records them if so.
   * If any have already been declared, a NameConflictException is thrown.
   */
  public boolean checkAddGlobal(final String... names) {
    try {
      boolean _xblockexpression = false;
      {
        final Function1<String, Boolean> _function = (String it) -> {
          return Boolean.valueOf(this.globalNames.contains(it));
        };
        final ArrayList<String> conflictingNames = CommonExtensions.<String>toArrayList(IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(names)), _function));
        boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(conflictingNames);
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          throw new NameConflictException(((String[])Conversions.unwrapArray(conflictingNames, String.class)));
        }
        _xblockexpression = CollectionExtensions.<String>addAll(this.globalNames, names);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Checks if a local variable declaration is unique,
   * and adds it to the given list of declarations if so.
   * 
   * If the name already exists in the global scope and shadowing is disallowed,
   * or if the name exists in the local scope with a different data type,
   * a NameConflictException is thrown.
   * 
   * If the variable already exists at the local scope with the same data type,
   * the duplicate declaration is silently ignored.
   */
  public boolean checkAddLocal(final VariableDecl variable, final List<VariableDecl> existingLocals) {
    try {
      if ((this.preventShadowing && this.globalNames.contains(variable.getName()))) {
        String _name = variable.getName();
        throw new NameConflictException(_name);
      }
      final Function1<VariableDecl, Boolean> _function = (VariableDecl it) -> {
        return Boolean.valueOf(NameChecker.hasSameNameAs(it, variable));
      };
      final ArrayList<VariableDecl> sameName = CommonExtensions.<VariableDecl>toArrayList(IterableExtensions.<VariableDecl>filter(existingLocals, _function));
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(sameName);
      if (_isNullOrEmpty) {
        existingLocals.add(variable);
        return true;
      }
      final Function1<VariableDecl, Boolean> _function_1 = (VariableDecl it) -> {
        return Boolean.valueOf(NameChecker.hasDifferentTypeThan(it, variable));
      };
      boolean _exists = IterableExtensions.<VariableDecl>exists(sameName, _function_1);
      if (_exists) {
        String _name_1 = variable.getName();
        throw new NameConflictException(_name_1);
      }
      return false;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Returns true if the two variables have the same name, and false otherwise.
   */
  protected static boolean hasSameNameAs(final VariableDecl first, final VariableDecl second) {
    String _name = first.getName();
    String _name_1 = second.getName();
    return Objects.equal(_name, _name_1);
  }

  /**
   * Returns true if the two variables have different types, and false otherwise.
   */
  protected static boolean hasDifferentTypeThan(final VariableDecl first, final VariableDecl second) {
    return ((!Objects.equal(first.getDataType().getBaseType(), second.getDataType().getBaseType())) || (first.getDataType().getIndirectionLevel() != second.getDataType().getIndirectionLevel()));
  }
}
