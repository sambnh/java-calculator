package stack;

/**
 * Provides a facade for the Stack class to be used by the reverse Polish
 * evaluation.
 */

public class NumStack {

  private Stack numbers;

  /**
   * Constructs a new <code>NumStack</code> and initialises the {@link Stack} to
   * operate on.
   */

  public NumStack() {
    numbers = new Stack();
  }

  /**
   * Returns <code>true</code> if the stack is empty.
   * 
   * @return <code>true</code> if the stack is empty; otherwise
   *         <code>false</code>.
   */

  public boolean isEmpty() {
    return numbers.isEmpty();
  }

  /**
   * Adds a <code>float</code> onto the top of the stack.
   * 
   * @param number - the float to be pushed onto the stack.
   */

  public void push(float number) {
    numbers.push(new Entry(number));
  }

  /**
   * Returns the <code>float</code> at top of the stack.
   * 
   * @return the top <code>float</code> of the stack.
   * @throws BadTypeException    the stack contains a non-float.
   * @throws EmptyStackException if the stack is empty.
   * 
   */

  public float top() throws BadTypeException, EmptyStackException {
    return numbers.top().getValue();
  }

  /**
   * Removes the <code>float</code> at top of the stack and removes it.
   * 
   * @return the top <code>float</code> on the stack.
   * @throws BadTypeException    the stack contains a non-float.
   * @throws EmptyStackException if the stack is empty.
   */

  public float pop() throws BadTypeException, EmptyStackException {
    return numbers.pop().getValue();
  }

  /**
   * Returns the number of <code>float</code>s in the stack.
   * 
   * @return the size of the stack.
   */

  public int size() {
    return numbers.size();
  }
}
