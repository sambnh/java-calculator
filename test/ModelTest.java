import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import stack.Model;

public class ModelTest {

  Model model;

  /**
   * Test 41 - Sets up a <code>Model</code> to be used for testing.
   */

  @Before
  public void setup() {
    model = new Model();
  }

  /**
   * Test 42 - Tests if a <code>Model</code> object can be instantiated,
   * achieved by implicitly calling {@link #setup()}.
   */

  @Test
  public void instantiates() {
    assertNotNull("Stack is null", model);
  } // Solution: Created empty Model class

  /**
   * Test 43 - Tests if <code>evaluate</code> returns <code>1.0</code> when
   * there are no entries.
   */

  @Test
  public void evaluateReturnsFloat() {
    assertEquals("evalutate() did not return 1.0", 1.0f, model.evaluate("1.0"),
        0);
  } // Solution: Added evaluate which returns 1.0f

}
