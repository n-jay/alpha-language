package alpha.codegen.isl;

import alpha.codegen.Statement;
import alpha.model.util.CommonExtensions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Holds the results of converting an isl AST to the simplified C AST.
 * This separates any variables which need to be declared for use in loop statements
 * and the statements themselves.
 */
@Data
@SuppressWarnings("all")
public class ASTConversionResult {
  /**
   * The variables to declare because they are used in loop statements.
   */
  private final ArrayList<String> declarations;

  /**
   * The top-level statements that the isl AST represents.
   */
  private final ArrayList<Statement> statements;

  /**
   * Constructs a new result which doesn't declare any loop variables.
   */
  public ASTConversionResult(final Statement... statements) {
    this(CollectionLiterals.<String>newArrayList(), statements);
  }

  /**
   * Constructs a new result which declares a single loop variable.
   */
  public ASTConversionResult(final String declaration, final Statement... statements) {
    this(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(declaration)), statements);
  }

  /**
   * Constructs a new result from scratch.
   */
  public ASTConversionResult(final Iterable<String> declarations, final Statement... statements) {
    this.declarations = CommonExtensions.<String>toArrayList(declarations);
    this.statements = CommonExtensions.<Statement>toArrayList(((Collection<Statement>)Conversions.doWrapArray(statements)));
  }

  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.declarations== null) ? 0 : this.declarations.hashCode());
    return prime * result + ((this.statements== null) ? 0 : this.statements.hashCode());
  }

  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ASTConversionResult other = (ASTConversionResult) obj;
    if (this.declarations == null) {
      if (other.declarations != null)
        return false;
    } else if (!this.declarations.equals(other.declarations))
      return false;
    if (this.statements == null) {
      if (other.statements != null)
        return false;
    } else if (!this.statements.equals(other.statements))
      return false;
    return true;
  }

  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("declarations", this.declarations);
    b.add("statements", this.statements);
    return b.toString();
  }

  @Pure
  public ArrayList<String> getDeclarations() {
    return this.declarations;
  }

  @Pure
  public ArrayList<Statement> getStatements() {
    return this.statements;
  }
}
