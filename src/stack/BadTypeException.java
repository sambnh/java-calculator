package stack;

/**
 * Thrown when an application attempts to call either {@link Entry#getString()},
 * {@link Entry#getSymbol()} or {@link Entry#getValue()} on a non compatible
 * type.
 */
@SuppressWarnings("serial")
public class BadTypeException extends Exception {

  /**
   * Constructs a <code>BadTypeException</code> with the specified detail
   * message.
   * 
   * @param message - the detail message.
   */
  public BadTypeException(String message) {
    super(message);
  }

}
