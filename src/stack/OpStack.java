package stack;

/**
 * Provides a facade for the Stack class to be used by the reverse Polish
 * evaluation.
 */

public class OpStack {

  private Stack operators;
  
  public OpStack() {
    operators = new Stack();
  }

  /**
   * Returns <code>true</code> if the stack is empty.
   * 
   * @return <code>true</code> if the stack is empty; otherwise
   *         <code>false</code>.
   */

  public boolean isEmpty() {
    return operators.isEmpty();
  }

  /**
   * Adds a <code>float</code> onto the top of the stack.
   * 
   * @param operator - the Symbol to be pushed onto the stack.
   */

  public void push(Symbol operator) {
    operators.push(new Entry(operator));
  }

  /**
   * Returns the <code>Symbol</code> at top of the stack.
   * 
   * @return the top <code>Symbol</code> of the stack.
   * @throws BadTypeException    the stack contains a non-Symbol.
   * @throws EmptyStackException if the stack is empty.
   */
  
  public Symbol top() throws BadTypeException, EmptyStackException {
    return operators.top().getSymbol();
  }

  /**
   * Removes the <code>Symbol</code> at top of the stack and removes it.
   * 
   * @return the top <code>float</code> on the stack.
   * @throws BadTypeException    the stack contains a non-Symbol.
   * @throws EmptyStackException if the stack is empty.
   */
  
  public Symbol pop() throws BadTypeException, EmptyStackException {
    return operators.pop().getSymbol();
  }
 
  /**
   * Returns the number of <code>Symbol</code>s in the stack.
   * 
   * @return the size of the stack.
   */
  
  public int size() {
    return operators.size();
  }

}
