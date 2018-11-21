package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import stack.Symbol;

public class SymbolTest {
  
  /**
   * Test 6 - Tests if a <code>Symbol</code> can be declared as a variable.
   */
  
  @Test
  public void typeNotNull() {
    Symbol symbol = Symbol.LEFT_BRACKET;
    assertNotNull("Type is null", symbol);
  } // Solution: Created Symbol enum and added fields

  /**
   * Test 36 - Tests if <code>toString</code> returns a <code>String</code> that
   * a <code>Symbol</code> represents.
   */
  
  @Test 
  public void toStringReturnsLeftBracket() {
    assertEquals("toString() method did not return a relevant string",
                 "(", Symbol.LEFT_BRACKET.toString());
  } // Solution: Added toString() method which returns "("

  /**
   * Test 37 - Tests if <code>toString</code> returns a <code>String</code> that
   * a <code>Symbol</code> represents, which is different to the
   * <code>Symbol</code> used in {@link #toStringReturnsLeftBracket()}.
   */
  
  @Test 
  public void toStringReturnsRightBracket() {
    assertEquals("toString() method did not return a relevant string",
                 ")", Symbol.RIGHT_BRACKET.toString());
  } // Solution: Added constructor to Symbol, added String symbol,
  //             constructor sets the symbol to the value passed
  //             into the constructor, toString returns symbol
}
