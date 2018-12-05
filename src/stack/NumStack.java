package stack;

/**
 * Provides a facade for the Stack class to be used by the reverse Polish
 * evaluation.
 */

public class NumStack {

  private float number;
  private boolean empty = true;
  
  public boolean isEmpty() {
    return empty;
  }
  
  public void push(float number) {
    empty = false;
    this.number = number;
  }

  public float top() {
    return number;
  }
  
}
