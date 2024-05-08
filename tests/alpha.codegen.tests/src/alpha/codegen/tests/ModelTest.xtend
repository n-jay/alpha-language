package alpha.codegen.tests

import alpha.codegen.Factory
import org.junit.Test

import static org.junit.Assert.*

class ModelTest {
	/**
	 * Tests that strings added to a comment will be split
	 * correctly if they contain a newline character.
	 */
	@Test def void addToCommentStmt_01() {
		val comment = Factory.commentStmt()
		comment.addAll(#[
			"This comment has\na newline in it.",
			"And so does\nthis one."
		])
		
		val expectedComment = #[
			"This comment has",
			"a newline in it.",
			"And so does",
			"this one."
		]
		assertTrue(expectedComment.elementsEqual(comment.commentLines))
	}
}