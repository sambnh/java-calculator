package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * This test case is used to test the <code>NumStack</code> class.
 */

public class NumStackTest {

  NumStack numStack;

  /**
   * Sets up a <code>NumStack</code> to be used for testing.
   */

  @Before
  public void setup() {
    numStack = new NumStack();
  }

  /**
   * Tests if <code>isEmpty</code> returns <code>true</code> when there are no
   * entries.
   */

  @Test
  public void isEmptyReturnsTrue() {
    assertTrue("isEmpty() did not return true", numStack.isEmpty());
  } // Solution: Added isEmpty which returns false

  /**
   * Tests if <code>push</code> runs when a <code>float</code> is passed.
   */

  @Test
  public void pushesFloat() {
    numStack.push(0.0f);
  } // Solution: Added push with float parameter

  /**
   * Tests if <code>isEmpty</code> returns <code>false</code> when a
   * <code>float</code> has been pushed.
   */

  @Test
  public void isEmptyReturnsFalse() {
    numStack.push(0.0f);
    assertFalse("isEmpty() did not return false", numStack.isEmpty());
  } // Solution: Added boolean variable empty, Added constructor
  // to initialised empty as true, empty is set to false
  // when push is called and isEmpty now returns empty
 
  /**
   * Tests if <code>top</code> returns the same value as a pushed
   * <code>float</code>.
   * 
   * @throws EmptyStackException - if <code>top</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    - if <code>top</code> on a stack with non float
   *                             entries
   */
  
  @Test
  public void topReturnsOne() throws BadTypeException, EmptyStackException {
    numStack.push(1.0f);
    assertEquals("top() did not return the float passed into push()",
        numStack.top(), 1.0f, 0);
  } // Solution: Added top method which returns 1.0f.
  
  /**
   * Tests if <code>top</code> returns the same value as a pushed
   * <code>float</code>, which is different to the previous test.
   * @throws EmptyStackException - if <code>top</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    - if <code>top</code> on a stack with non float
   *                             entries
   */
  
  @Test
  public void topReturnsZero() throws BadTypeException, EmptyStackException {
    numStack.push(0.0f);
    assertEquals("top() did not return the float passed into push()",
        numStack.top(), 0.0f, 0);
  } // Solution: Added number variable which is set to the parameter 
  //             of push, added top which returns number
  
  /**
   * Tests if <code>pop</code> returns the same value as a pushed
   * <code>float</code>.
   * @throws EmptyStackException - if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    - if <code>pop</code> on a stack with non float
   *                             entries
   */
  
  @Test
  public void popReturnsFloat() throws BadTypeException, EmptyStackException {
    numStack.push(1.0f);
    assertEquals("pop() did not return the float passed into push()",
        numStack.pop(), 1.0f, 0);
  } // Solution: Added pop which returns top

  /**
   * Tests if <code>isEmpty</code> returns <code>true</code> when an
   * <code>float</code> has been pushed and popped.
   * @throws EmptyStackException - if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    - if <code>pop</code> on a stack with non float
   *                             entries
   */
  
  @Test
  public void isEmptyAfterPop() throws BadTypeException, EmptyStackException {
    numStack.push(1.0f);
    numStack.pop();
    assertTrue("isEmpty() did not return true", numStack.isEmpty());
  } // Solution: pop now also sets empty to true
  
  /**
   * Tests if <code>size</code> returns <code>0</code> when the stack is empty.
   */
  
  @Test
  public void sizeReturnsZeroWhenEmpty() {
    assertEquals("size() did not return zero when empty", 0, numStack.size());
  } // Solution: Added size which returns 0
  
  /**
   * Tests if <code>size</code> returns <code>1</code> when a <code>float</code>
   * has been pushed onto the stack.
   */

  @Test
  public void sizeReturnsOneAfterPush() {
    numStack.push(1.0f);
    assertEquals("size() did not return the number of entries", 1,
        numStack.size());
  } // Solution: Removed empty, Added int size initialised to 0
  //             push increments size, and isEmpty
  //             returns true if size == 0
  
  /**
   * Tests if <code>size</code> returns <code>0</code> when a <code>float</code>
   * has been pushed onto the stack and popped.
   * 
   * @throws EmptyStackException - if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    - if <code>pop</code> on a stack with non float
   *                             entries
   */
  
  @Test
  public void sizeReturnsZeroAfterPushAndPop()
      throws EmptyStackException, BadTypeException {
    numStack.push(0.0f);
    numStack.pop();
    assertEquals("size() did not return zero when empty", 0, numStack.size());
  } // Solution: pop now decrements size

  /**
   * Tests if <code>pop</code> returns the same value as a pushed
   * <code>float</code> after pushing and popping another <code>float</code>.
   * 
   * @throws EmptyStackException - if <code>pop</code> is called when the stack
   *                             has no elements.
   * @throws BadTypeException    - if <code>pop</code> on a stack with non float
   *                             entries
   */

  @Test
  public void lastPopReturnsFirstEntry()
      throws EmptyStackException, BadTypeException {
    numStack.push(0.0f);
    numStack.push(1.0f);
    numStack.pop();
    assertEquals(numStack.pop(), 0.0f, 0);
  } // Solution: Added Stack numbers, added constructor which initialises
  //             numbers, changed methods to call equivalent methods in numbers
  //             and removed redundant variables
                 
}
