package stack;

/**
 * Thrown when an application attempts to call either {@link Stack#pop()} or
 * {@link Stack#top()} when the stack is empty.
 */
@SuppressWarnings("serial")
public class EmptyStackException extends Exception {
  /**
   * Constructs a <code>EmptyStackException</code> with no detail message.
   */
  public EmptyStackException() {

  }

  /**
   * Constructs a <code>EmptyStackException</code> with the specified detail
   * message.
   * 
   * @param message - the detail message.
   */

  public EmptyStackException(String message) {
    super(message);
  }
}
