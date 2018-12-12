package stack;

/**
 * Thrown when an a calculator attempts to call either
 * {@link Calculator#evaluate()} with an expression that cannot be calculated.
 */

@SuppressWarnings("serial")
public class InvalidExpressionException extends Exception {

  /**
   * Constructs a <code>InvalidExpressionException</code> with no detail
   * message.
   */
  
  public InvalidExpressionException() {

  }

  /**
   * Constructs a <code>InvalidExpressionException</code> with the specified
   * detail message.
   * 
   * @param message - the detail message.
   */

  public InvalidExpressionException(String message) {
    super(message);
  }
}
