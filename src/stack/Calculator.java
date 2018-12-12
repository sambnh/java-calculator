package stack;

/**
 * The interface that outlines the functionality for a <code>Calculator</code>.
 */

public interface Calculator {

  /**
   * Evaluates an expression and returns the answer.
   * 
   * @param expression - the expression to be evaluated
   * @return the evaluated expression.
   * @throws InvalidExpressionException if the expression cannot be calculated.
   */

  float evaluate(String expression) throws InvalidExpressionException;

}
