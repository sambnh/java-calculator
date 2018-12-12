package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The JUnit test case for the {@link Model} class.
 */

public class ModelTest {

  Model model;

  /**
   * Sets up a <code>Model</code> to be used for testing.
   */

  @Before
  public void setup() {
    model = new Model();
  }

  /**
   * Tests if <code>evaluate</code> returns the correct answer to multiple
   * expressions with multiple operators in reverse polish mode.
   * 
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */

  @Test
  public void evaluateReturnsAnswerReversePolish()
      throws InvalidExpressionException {
    assertEquals("evaluate() did not return the correct answer", "12.0",
        model.evaluate("4 2 + 3 1 - *"));
    assertEquals("evaluate() did not return the correct answer", "-2.0",
        model.evaluate("12 3 * 3 / 5 + 19 -"));
    assertEquals("evaluate() did not return the correct answer",
        "49.820896", model.evaluate("50 12 24 43 + / -"));
  }
 
  /**
   * Tests if <code>evaluate</code> changes to when in infix mode.
   * 
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */

  @Test
  public void evaluateReturnsAnswerInfixAfterChangeTypeTrue()
      throws InvalidExpressionException {
    model.changeType(true);
    assertEquals("evaluate() did not return the correct answer",
        "Infix Mode - Coming Soon!", model.evaluate("2 + 4"));
  }
  
  /**
   * Tests if <code>evaluate</code> changes to when in infix mode.
   * 
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */

  @Test
  public void evaluateReturnsAnswerReversePolishAfterChangeTypeFalse()
      throws InvalidExpressionException {
    model.changeType(false);
    assertEquals("evaluate() did not return the correct answer", "6.0",
        model.evaluate("2 4 +"));
  }
}
