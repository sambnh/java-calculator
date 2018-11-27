package stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
   * Tests if a <code>NumStack</code> object can be instantiated,
   * achieved by implicitly calling {@link #setup()}.
   */

  @Test
  public void instantiates() {
    assertNotNull("Stack is null", numStack);
  } // Solution: Created empty Stack class

}
