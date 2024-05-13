package alpha.codegen.tests;

import alpha.codegen.CommentStmt;
import alpha.codegen.Factory;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class ModelTest {
  /**
   * Tests that strings added to a comment will be split
   * correctly if they contain a newline character.
   */
  @Test
  public void addToCommentStmt_01() {
    final CommentStmt comment = Factory.commentStmt();
    comment.addAll(
      Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("This comment has\na newline in it.", "And so does\nthis one.")));
    final List<String> expectedComment = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("This comment has", "a newline in it.", "And so does", "this one."));
    Assert.assertTrue(IterableExtensions.elementsEqual(expectedComment, comment.getCommentLines()));
  }
}
