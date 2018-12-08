package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a stack of <code>Entry</code> values.
 */
public class Stack {

  private int size;
  private List<Entry> entries;

  /**
   * Constructs a new <code>Stack</code> and initialises its variables.
   */

  public Stack() {
    size = 0;
    entries = new ArrayList<Entry>();
  }

  /**
   * Adds an <code>Entry</code> onto the top of the stack.
   * 
   * @param entry - the entry to be pushed onto the stack.
   */

  public void push(Entry entry) {
    entries.add(size, entry);
    size++;
  }

  /**
   * Removes an <code>Entry</code> from the top of the stack and removes it.
   * 
   * @return the top <code>Entry</code> on the stack.
   * @throws EmptyStackException - if the stack is empty.
   */

  public Entry pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("Stack must not be empty to call pop()");
    }
    Entry top = top();
    entries.remove(size - 1);
    size--;
    return top;
  }

  /**
   * Returns the <code>Entry</code> at top of the stack.
   * 
   * @return the top <code>Entry</code> of the stack.
   * @throws EmptyStackException - if the stack is empty.
   * 
   */

  public Entry top() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("Stack must not be empty to call top()");
    }
    return entries.get(size - 1);
  }

  /**
   * Returns the number of <code>Entry</code> objects in the stack.
   * 
   * @return the size of the stack
   */

  public int size() {
    return size;
  }

  /**
   * Returns <code>true</code> if the stack is empty.
   * 
   * @return <code>true</code> if the stack is empty; otherwise
   *         <code>false</code>.
   */

  public boolean isEmpty() {
    return (size == 0);
  }

  /**
   * Indicates if another object is equal to this one.
   * 
   * @param o - the reference object which to compare.
   * 
   * @return <code>true</code> if this object is the same as the argument;
   *         otherwise <code>true</code>.
   */

  @Override
  public boolean equals(Object o) {
    if (o instanceof Stack) {
      return this.hashCode() == o.hashCode();
    }
    return false;
  }

  /**
   * Returns a hash code value for a <code>Stack</code> object.
   * 
   * @return this stack's hash code.
   */

  @Override
  public int hashCode() {
    int prime = 31;
    int result = 1;
    for (Entry e : entries) {
      result = prime * result + ((e == null) ? 0 : e.hashCode());
    }
    return result;
  }

  /**
   * Returns a string representation of all the entries on the stack.
   * 
   * @return a string representation of all the entries on the stack.
   */

  @Override
  public String toString() {
    if (isEmpty()) {
      return "[]";
    }
    String result = "[" + entries.get(0).toString();
    for (int i = 1; i < size; i++) {
      result += ", " + entries.get(i).toString();
    }
    return result + "]";
  }
}
