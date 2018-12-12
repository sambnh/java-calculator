package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * The JUnit test case for the {@link ReversePolishCalculator} class.
 */

public class ReversePolishCalculatorTest {

  Calculator calc;

  /**
   * Sets up a <code>ReversePolishCalculator</code> to be used for testing.
   */

  @Before
  public void setup() {
    calc = new ReversePolishCalculator();
  }
  
  /**
   * Tests if <code>evaluate</code> returns a <code>float</code>.
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */

  @Test
  public void evaluateReturnsOne() throws InvalidExpressionException {
    assertEquals("evaluate() did not return 1.0", 1.0f, calc.evaluate("1"),
        0);
  } // Solution: Added evaluate which returns 1.0f
  
  /**
   * Tests if <code>evaluate</code> returns a <code>float</code>, which is
   * different to the <code>float</code> in the previous test.
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */
  
  @Test
  public void evaluateReturnsZero() throws InvalidExpressionException {
    assertEquals("evaluate() did not return 0.0", 0.0f, calc.evaluate("0"),
        0);
  } // Solution: Changed evaluate to return the value of the expression.
  
  
  /**
   * Tests if <code>evaluate</code> returns the correct answer to a simple
   * addition expression.
   * @throws InvalidExpressionException if the expression cannot be calculated
   */
  
  @Test
  public void evaluateReturnsAnswerPlus() throws InvalidExpressionException {
    assertEquals("evaluate() did not return the answer 6.0", 6.0f,
        calc.evaluate("2 4 +"), 0);
  } // Solution: Changed evaluate scan through expression string, add
  //             the first two numbers and return the answer2.

  /**
   * Tests if <code>evaluate</code> returns the correct answer to a simple
   * subtraction expression.
   * @throws InvalidExpressionException if the expression cannot be calculated
   */
  
  @Test
  public void evaluateReturnsAnswerMinus() throws InvalidExpressionException {
    assertEquals("evaluate() did not return the answer 2.0", 2.0f,
        calc.evaluate("4 2 -"), 0);
  } // Solution: Added a switch case that checks the operator and
  //             deals with the numbers accordingly.
  
  /**
   * Tests if <code>evaluate</code> throws
   * <code>InvalidExpressionException</code> when an invalid expression is
   * passed.
   * 
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */

  @Test
  public void evaluateInvalidThrowsException()
      throws InvalidExpressionException {
    try {
      calc.evaluate(null);
      fail("evaluate() did not throw InvalidExpressionException");
    } catch (InvalidExpressionException e) {
    ; // Here to pass CheckStyle
    }
    try {
      calc.evaluate("");
      fail("evaluate() did not throw InvalidExpressionException");
    } catch (InvalidExpressionException e) {
    ; // Here to pass CheckStyle
    }
    try {
      calc.evaluate("1 0");
      fail("evaluate() did not throw InvalidExpressionException");
    } catch (InvalidExpressionException e) {
    ; // Here to pass CheckStyle
    }
    try {
      calc.evaluate("1 0 !");
      fail("evaluate() did not throw InvalidExpressionException");
    } catch (InvalidExpressionException e) {
    ; // Here to pass CheckStyle
    }
    try {
      calc.evaluate("Invalid");
      fail("evaluate() did not throw InvalidExpressionException");
    } catch (InvalidExpressionException e) {
    ; // Here to pass CheckStyle
    }
  } // Solution: Added guards that throw InvalidExpressionException
  
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
  } // Solution: Added two constructors to InvalidExpressionException, one
  //             without parameters and another that accepts a string.
  //             Messages were added to throws.
  
  /**
   * Tests if <code>evaluate</code> returns the correct answer to multiple
   * expressions with multiple operators.
   * 
   * @throws InvalidExpressionException if the expression cannot be calculated
   */
  
  @Test
  public void evaluateReturnsAnswerComplex() 
      throws InvalidExpressionException {
    assertEquals("evaluate() did not return the correct answer", 12.0f,
        calc.evaluate("4 2 + 3 1 - *"), 0);
    assertEquals("evaluate() did not return the correct answer", -2.0f,
        calc.evaluate("12 3 * 3 / 5 + 19 -"), 0);
    assertEquals("evaluate() did not return the correct answer", 49.8208955224f,
        calc.evaluate("50 12 24 43 + / -"), 0);
  }
}
