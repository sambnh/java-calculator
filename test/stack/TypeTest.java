package stack;

import static org.junit.Assert.*;

import org.junit.Test;

import stack.Type;

public class TypeTest {
  
  /**
   * Test 13 - Tests if a <code>Type</code> can be declared as a variable.
   */
  
  @Test
  public void typeNotNull() {
    Type type = Type.NUMBER;
    assertNotNull("Type is null", type);
  } // Solution: Created Type enum and added fields
    
  /**
   * Test 39 - Tests if <code>toString</code> returns a <code>String</code>
   * representing a <code>Type</code>.
   */
  
  @Test 
  public void toStringReturnsNumber() {
    assertEquals("toString() method did not return a relevant string",
                 "Type: NUMBER", Type.NUMBER.toString());
  } // Solution: Added toString() method which returns "Symbol.NUMBER"

  /**
   * Test 40 - Tests if <code>toString</code> returns a <code>String</code>
   * representing a <code>Type</code>, which is different to the
   * <code>Type</code> entered in {@link #toStringReturnsNumber()}.
   */
  
  @Test
  public void toStringReturnsSymbol() {
    assertEquals("toString() method did not return a relevant string",
                 "Type: SYMBOL", Type.SYMBOL.toString());
  } // Solution: Change toString() to return "Type: " followed by the
  //             name of the enum (constructor deemed unnecessary)
}
