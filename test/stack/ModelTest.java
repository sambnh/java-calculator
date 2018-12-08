package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ModelTest {

  Model model;

  /**
   * Sets up a <code>Model</code> to be used for testing.
   */

  @Before
  public void setup() {
    model = new Model();
  }

  /**
   * Tests if <code>evaluate</code> returns <code>1.0</code> when
   * there are no entries.
   */

  @Test
  public void evaluateReturnsFloat() {
    assertEquals("evalutate() did not return 1.0", 1.0f, model.evaluate("1.0"),
        0);
  } // Solution: Added evaluate which returns 1.0f

}
