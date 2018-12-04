package stack;

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
   * Tests if a <code>NumStack</code> object can be instantiated, achieved by
   * implicitly calling {@link #setup()}.
   */

  @Test
  public void instantiates() {
    assertNotNull("Stack is null", numStack);
  } // Solution: Created empty Stack class

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

}
