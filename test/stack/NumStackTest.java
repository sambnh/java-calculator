package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
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
   */
  
  @Test
  public void topReturnsOne() {
    numStack.push(1.0f);
    assertEquals("top() did not return the float passed into push()",
        numStack.top(), 1.0f, 0);
  } // Solution: Added top method which returns 1.0f.
  
  /**
   * Tests if <code>top</code> returns the same value as a pushed
   * <code>float</code>, which is different to the previous test.
   */
  
  @Test
  public void topReturnsZero() {
    numStack.push(0.0f);
    assertEquals("top() did not return the float passed into push()",
        numStack.top(), 0.0f, 0);
  } // Solution: Added number variable which is set to the parameter 
  //             of push, added top which returns number
}
