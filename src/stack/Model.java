package stack;

/**
 * The bridge to the model of the calculator that switches between between
 * calculators as required.
 */

public class Model {

  Calculator reversePolish = new ReversePolishCalculator();
  Calculator infix = new InfixCalculator();
  Calculator current = reversePolish;
  
  /**
   * Evaluates an expression and returns the answer.
   * 
   * @param expression - the expression to be evaluated
   * @return the evaluated expression.
   */

  public String evaluate(String expression) {
    try {
      return String.valueOf(current.evaluate(expression));
    } catch (InvalidExpressionException e) {
      return e.getMessage();
    }
  }

  /**
   * Changes the model state between infix and reverse polish.
   * 
   * @param infix true if infix, false if reverse polish.
   */
  
  public void changeType(boolean infix) {
    if (infix) {
      current = this.infix;
    } else {
      current = reversePolish;
    }
  }

}
