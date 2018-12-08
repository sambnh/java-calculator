package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * This test case is used to test the <code>OpStack</code> class.
 */

public class OpStackTest {

  OpStack opStack;

  /**
   * Sets up a <code>OpStack</code> to be used for testing.
   */

  @Before
  public void setup() {
    opStack = new OpStack();
  }

  /**
   * Tests if <code>isEmpty</code> returns <code>true</code> when there are no
   * entries.
   */

  @Test
  public void isEmptyReturnsTrue() {
    assertTrue("isEmpty() did not return true", opStack.isEmpty());
  } // Solution: Added isEmpty which returns true

  /**
   * Tests if <code>push</code> runs when a <code>Symbol</code> is passed.
   */

  @Test
  public void pushesSymbol() {
    opStack.push(Symbol.PLUS);
  } // Solution: Added push with Symbol parameter
  
  /**
   * Tests if <code>isEmpty</code> returns <code>false</code> when a
   * <code>Symbol</code> has been pushed.
   */

  @Test
  public void isEmptyReturnsFalse() {
    opStack.push(Symbol.PLUS);
    assertFalse("isEmpty() did not return false", opStack.isEmpty());
  } // Solution: Added boolean variable empty, Added constructor
  // to initialised empty as true, empty is set to false
  // when push is called and isEmpty now returns empty
  
  /**
   * Tests if <code>top</code> returns the same value as a pushed
   * <code>Symbol</code>.
   * @throws EmptyStackException if <code>top</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    if <code>top</code> on a stack with non-Symbol
   *                             entries
   */
  
  @Test
  public void topReturnsPlus() throws BadTypeException, EmptyStackException {
    opStack.push(Symbol.PLUS);
    assertEquals("top() did not return the Symbol passed into push()",
        opStack.top(), Symbol.PLUS);
  } // Solution: Added top method which returns Symbol.PLUS.
  
  /**
   * Tests if <code>top</code> returns the same value as a pushed
   * <code>Symbol</code>, which is different to the previous test.
   * @throws EmptyStackException if <code>top</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    if <code>top</code> on a stack with non-Symbol
   *                             entries
   */
  
  @Test
  public void topReturnsMinus() throws BadTypeException, EmptyStackException {
    opStack.push(Symbol.MINUS);
    assertEquals("top() did not return the Symbol passed into push()",
        opStack.top(), Symbol.MINUS);
  } // Solution: Added operator variable which is set to the parameter 
  //             of push, added top which returns operator
  
  /**
   * Tests if <code>pop</code> returns the same value as a pushed
   * <code>Symbol</code>.
   * @throws EmptyStackException if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    if <code>pop</code> on a stack with non-Symbol
   *                             entries
   */
  
  @Test
  public void popReturnsPlus() throws BadTypeException, EmptyStackException {
    opStack.push(Symbol.PLUS);
    assertEquals("pop() did not return the Symbol passed into push()",
        opStack.pop(), Symbol.PLUS);
  } // Solution: Added pop which returns 1.0f

  
  /**
   * Tests if <code>pop</code> returns the same value as a pushed
   * <code>Symbol</code>, which is different to the previous test.
   * @throws EmptyStackException if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    if <code>pop</code> on a stack with non-Symbol
   *                             entries
   */
  
  @Test
  public void popReturnsMinus() throws BadTypeException, EmptyStackException {
    opStack.push(Symbol.MINUS);
    assertEquals("pop() did not return the Symbol passed into push()",
        opStack.pop(), Symbol.MINUS);
  } // Solution: Changed pop to return top
  
  /**
   * Tests if <code>isEmpty</code> returns <code>true</code> when an
   * <code>Symbol</code> has been pushed and popped.
   * @throws EmptyStackException if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    if <code>pop</code> on a stack with non-Symbol
   *                             entries
   */
  
  @Test
  public void isEmptyAfterPop() throws BadTypeException, EmptyStackException {
    opStack.push(Symbol.PLUS);
    opStack.pop();
    assertTrue("isEmpty() did not return true", opStack.isEmpty());
  } // Solution: pop now also sets empty to true
  
  /**
   * Tests if <code>size</code> returns <code>0</code> when the stack is empty.
   */
  
  @Test
  public void sizeReturnsZeroWhenEmpty() {
    assertEquals("size() did not return zero when empty", 0, opStack.size());
  } // Solution: Added size which returns 0
  
  /**
   * Tests if <code>size</code> returns <code>1</code> when a
   * <code>Symbol</code> has been pushed onto the stack.
   */

  @Test
  public void sizeReturnsOneAfterPush() {
    opStack.push(Symbol.PLUS);
    assertEquals("size() did not return the number of entries", 1,
        opStack.size());
  } // Solution: Removed empty, Added int size initialised to 0
  //             push increments size, and isEmpty
  //             returns true if size == 0
  

  /**
   * Tests if <code>pop</code> returns the same value as a pushed
   * <code>Symbol</code> after pushing and popping another <code>Symbol</code>.
   * 
   * @throws EmptyStackException if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    if <code>pop</code> on a stack with non-Symbol
   *                             entries
   */

  @Test
  public void lastPopReturnsFirstEntry()
      throws EmptyStackException, BadTypeException {
    opStack.push(Symbol.PLUS);
    opStack.push(Symbol.MINUS);
    opStack.pop();
    assertEquals("pop() did not return the first Symbol pushed", opStack.pop(),
        Symbol.PLUS);
  } // Solution: Added Stack numbers, added constructor which initialises
  //             numbers, changed methods to call equivalent methods in numbers
  //             and removed redundant variables
}