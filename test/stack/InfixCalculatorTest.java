package stack;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * The JUnit test case for the {@link InfixCalculator} class.
 */

public class InfixCalculatorTest {

  Calculator calc;

  /**
   * Sets up a <code>InfixCalculator</code> to be used for testing.
   */

  @Before
  public void setup() {
    calc = new InfixCalculator();
  }
  
  /**
   * Tests if <code>evaluate</code> throws
   * <code>InvalidExpressionException</code> when an invalid expression is
   * passed.
   * 
   * @throws InvalidExpressionException if the expression cannot be calculated
   */

  @Test(expected = InvalidExpressionException.class)
  public void evaluateInvalidThrowsException()
      throws InvalidExpressionException {
    calc.evaluate(null);
    fail("evaluate() did not throw InvalidExpressionException");
  }
  
  /**
   * Tests if when <code>evaluate</code> throws
   * <code>InvalidExpressionException</code>, <code>getMessage</code> can be
   * called on the caught exception.
   * 
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */

  @Test
  public void evaluateInvalidThrowsExceptionMessage()
      throws InvalidExpressionException {
    try {
      calc.evaluate(null);
    } catch (InvalidExpressionException e) {
      assertNotNull("getMessage() did not return a message",
          e.getMessage());
    }
  } 
}
