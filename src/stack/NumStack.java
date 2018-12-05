package stack;

/**
 * Provides a facade for the Stack class to be used by the reverse Polish
 * evaluation.
 */

public class NumStack {

  private Stack numbers;
  
  public NumStack() {
    numbers = new Stack();
  }
  
  public boolean isEmpty() {
    return numbers.isEmpty();
  }
  
  public void push(float number) {
    numbers.push(new Entry(number));
  }

  public float top() throws BadTypeException, EmptyStackException {
    return numbers.top().getValue();
  }
  
  public float pop() throws BadTypeException, EmptyStackException {
    return numbers.pop().getValue();
  }

  public int size() {
    return numbers.size();
  }
}
