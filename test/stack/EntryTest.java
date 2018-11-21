package stack;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import stack.BadTypeException;
import stack.Entry;
import stack.Symbol;
import stack.Type;

/**
 *JUnit test case for Entry class.
 */

public class EntryTest {

  Entry entry;
  Entry entry2;
  
  //  Made Obsolete by getValueReturns
  //
  //  /**
  //   * Test 1 - Tests if a <code>Entry</code> object can be instantiated.
  //   */
  //  
  //  @Test
  //  public void instantiates() {
  //    entry = new Entry();
  //    assertNotNull("Entry is null", entry);
  //  } // Solution: Added Entry class

  //  Made Obsolete by getValueReturns
  //  
  //  /**
  //   * Test 2 - Tests if a <code>Entry</code> object can be instantiated with
  //   * a <code>float</code> as a parameter.
  //   */
  //  
  //  @Test
  //  public void acceptsFloatParameter() {
  //    entry = new Entry(0.0f);
  //  } // Solution: Added constructor to entry with a float parameter

  /**
   * Test 3 - Tests if <code>getValue</code> returns a value entered into the
   * constructor of entry.
   * 
   * @throws BadTypeException added after implementation of this exception.
   */
  
  @Test
  public void getValueReturnsFloat() throws BadTypeException {
    entry = new Entry(0.0f);
    assertEquals(
        "getValue did not return a value equal to "
        + "the value passed into the constructor",
        entry.getValue(), 0.0f, 0);
  } // Solution: Added getValue which returns value 0.0f

  /**
   * Test 4 - Tests if <code>getValue</code> returns a value entered into the
   * constructor of entry, which is different to the value entered in
   * {@link #getValueReturnsFloat()}.
   * 
   * @throws BadTypeException - added after implementation of this exception.
   */

  @Test
  public void getValueReturnsDifferentFloat() throws BadTypeException {
    entry = new Entry(1.0f);
    assertEquals(
        "getValue did not return a value equal to "
        + "the value passed into the constructor",
        entry.getValue(), 1.0f, 0);
  } // Solution: Added float number, made constructor set number to value of
  //             parameter, getValue now returns number

  // Made Obsolete by getSymbolReturns
  //
  //  /**
  //   * Test 5 - Tests if an <code>Entry</code> object can be instantiated
  //   * with a <code>float</code> as a parameter.
  //   */
  //  
  //  @Test
  //  public void acceptSymbolParameter() {
  //    entry = new Entry(Symbol.LEFT_BRACKET);
  //  } // Solution: Added constructor that takes a Symbol as a parameter

  /**
   * Test 7 - Tests if <code>getSymbol</code> returns a value entered into the
   * constructor of entry.
   * 
   * @throws BadTypeException - added after implementation of this exception.
   */

  @Test
  public void getSymbolReturnsLeftBracket() throws BadTypeException {
    entry = new Entry(Symbol.LEFT_BRACKET);
    assertEquals(
        "getSymbol did not return a value equal "
            + "the value passed into the constructor",
        entry.getSymbol(), Symbol.LEFT_BRACKET);
  } // Solution: Added getSymbol which returns Symbol.LEFT_BRACKET

  /**
   * Test 8 - Tests if <code>getSymbol</code> returns a value entered into the
   * constructor of entry, which is different to the value entered in
   * {@link #getSymbolReturnsLeftBracket()}.
   * 
   * @throws BadTypeException - added after implementation of this exception.
   */
  
  @Test
  public void getSymbolReturnsRightBracket() throws BadTypeException {
    entry = new Entry(Symbol.RIGHT_BRACKET);
    assertEquals(
        "getSymbol did not return a value equal "
        + "the value passed into the constructor",
        entry.getSymbol(), Symbol.RIGHT_BRACKET);
  } // Solution: Added Symbol other, made constructor set other to value of
  //             parameter, getSymbol now returns which

  // Made Obsolete by getStringReturns
  //
  //  /**
  //   * Test 9 - Tests if an <code>Entry</code> object can be instantiated with
  //   * a <code>String</code> as a parameter.
  //   */
  //  
  //  @Test
  //  public void acceptsStringParameter() {
  //    entry = new Entry("");
  //  } // Solution: Added constructor that takes a String as a parameter

  /**
   * Test 10 - Tests if <code>getString</code> returns a value entered into the
   * constructor of entry.
   * 
   * @throws BadTypeException - added after implementation of this exception.
   */
  
  @Test
  public void getStringReturnsEmptyString() throws BadTypeException {
    entry = new Entry("");
    assertEquals(
        "getString did not return a value equal "
        + "the value passed into the constructor",
        entry.getString(), "");
  } // Solution: Added getString which returns an empty string

  /**
   * Test 11 - Tests if <code>getString</code> returns a value entered into the
   * constructor of entry, which is different to the value entered in
   * {@link #getStringReturnsEmptyString()}.
   * 
   * @throws BadTypeException - added after implementation of this exception.
   */
  
  @Test
  public void getStringReturnsLargerString() throws BadTypeException {
    entry = new Entry("2 + 4");
    assertEquals(
        "getString did not return a value equal "
        + "the value passed into the constructor",
        entry.getString(), "2 + 4");
  } // Solution: Added String string, made constructor set other to value of
  //             parameter, getString now returns string

  /**
   * Test 12 - Tests if <code>getType</code> returns <code>Type.NUMBER</code> when the
   * value passed into the constructor of the <code>Entry</code> object is a
   * <code>float</code>.
   */
  
  @Test
  public void getTypeReturnsNumber() {
    entry = new Entry(0.0f);
    assertEquals(
        "getType did not return a value equal "
        + "the value passed into the constructor",
        entry.getType(), Type.NUMBER);
  } // Solution: Added getType which returns Type.NUMBER
  
  /**
   * Test 14 - Tests if <code>getType</code> returns <code>Type.SYMBOL</code>
   * when the value passed into the constructor of the <code>Entry</code> object
   * is a <code>Symbol</code>.
   */
  
  @Test
  public void getTypeReturnsSymbol() {
    entry = new Entry(Symbol.LEFT_BRACKET);
    assertEquals(
        "getType did not return a value equal "
        + "the value passed into thse constructor",
        entry.getType(), Type.SYMBOL);
  } // Solution: Added Type type, made all constructors set type to
  //             the type of the parameter, getValue now returns type
  
  /**
   * Test 15 - Tests if <code>getType</code> returns <code>Type.STRING</code>
   * when the value passed into the constructor of the <code>Entry</code> object
   * is a <code>String</code>.
   */
  
  @Test
  public void getTypeReturnsString() {
    entry = new Entry("");
    assertEquals(
        "getType did not return a value equal "
        + "the value passed into thse constructor",
        entry.getType(), Type.STRING);
  } // Passed with no changes needed
  
  /**
   * Test 16 - Tests if <code>BadTypeException</code> is thrown when
   * <code>getValue</code> is called on an <code>Entry</code> object with a type
   * of <code>Type.STRING</code>.
   * 
   * @throws BadTypeException - if the type is not <code>Type.NUMBER</code>.
   */
  
  @Test(expected = BadTypeException.class)
  public void getValueThrowsBadTypeForString() throws BadTypeException {
    entry = new Entry("");
    entry.getValue();
    fail("Exception was not thrown");
  } // Solution: Added BadTypeException class which extends Exception,
  //             added condition in getValue that throws a
  //             BadTypeException when the type is not number.
  
  /**
   * Test 17 - Tests if, when a <code>BadTypeException</code> is thrown,
   * <code>getMessage</code> can be called on the caught exception.
   */
  
  @Test
  public void badTypeExceptiongetMessageReturns() {
    entry = new Entry("");
    try {
      entry.getValue();
    } catch (BadTypeException e) {
      assertNotNull("BadTypeException did not return a message",
          e.getMessage());
    }
  } // Solution: Added constructor to BadTypeException that takes a String
  //             parameter and calls super constructor, added message to throw
  //             in getValue
  
  /**
   * Test 18 - Tests if <code>BadTypeException</code> is thrown when 
   * <code>getValue</code> is called on an <code>Entry</code> object 
   * with a type of <code>Type.SYMBOL</code>.
   * 
   * @throws BadTypeException - if the type is not <code>Type.NUMBER</code>.
   */
  
  @Test(expected = BadTypeException.class)
  public void getValueThrowsBadTypeForSymbol() throws BadTypeException {
    entry = new Entry(Symbol.LEFT_BRACKET);
    entry.getValue();
    fail("Exception was not thrown");
  } // Passed with no changes needed
  
  /**
   * Test 19 - Tests if <code>BadTypeException</code> is thrown when
   * <code>getString</code> is called on an <code>Entry</code> object with a
   * type of <code>Type.NUMBER</code>.
   * 
   * @throws BadTypeException - if the type is not <code>Type.STRING</code>.
   */

  @Test(expected = BadTypeException.class)
  public void getStringThrowsBadTypeForFloat() throws BadTypeException {
    entry = new Entry(0.0f);
    entry.getString();
    fail("Exception was not thrown");
  } // Solution: Added condition in getString() that throws a
  //             BadTypeException when the type is not string.
  
  /**
   * Test 20 - Tests if <code>BadTypeException</code> is thrown when
   * <code>getString</code> is called on an <code>Entry</code> object with a
   * type of <code>Type.SYMBOL</code>.
   * 
   * @throws BadTypeException - if the type is not <code>Type.STRING</code>.
   */
  
  @Test(expected = BadTypeException.class)
  public void getStringThrowsBadTypeForSymbol() throws BadTypeException {
    entry = new Entry(Symbol.LEFT_BRACKET);
    entry.getString();
    fail("Exception was not thrown");
  } // Passed with no changes needed

  /**
   * Test 21 - Tests if <code>BadTypeException</code> is thrown when
   * <code>getSymbol</code> is called on an <code>Entry</code> object with a
   * type of <code>Type.STRING</code>.
   * 
   * @throws BadTypeException - if the type is not <code>Type.SYMBOL</code>.
   */
  
  @Test(expected = BadTypeException.class)
  public void getSymbolThrowsBadTypeForString() throws BadTypeException {
    entry = new Entry("");
    entry.getSymbol();
    fail("Exception was not thrown");
  } // Solution: Added condition in getSymbol() that throws a
  //             BadTypeException when the type is not symbol.
  
  /**
   * Test 22 - Tests if <code>BadTypeException</code> is thrown when
   * <code>getSymbol</code> is called on an <code>Entry</code> object with a
   * type of <code>Type.NUMBER</code>.
   * 
   * @throws BadTypeException - if the type is not <code>Type.SYMBOL</code>.
   */
  
  @Test(expected = BadTypeException.class)
  public void getSymbolThrowsBadTypeForFloat() throws BadTypeException {
    entry = new Entry(0.0f);
    entry.getSymbol();
    fail("Exception was not thrown");
  } // Passed with no changes needed
    
  /**
   * Test 23 - Tests if the <code>hashCode</code> of two different but
   * equivalent <code>Entry</code> objects return the same <code>int</code>
   * value.
   */
  
  @Test
  public void hashCodesEqual() {
    entry = new Entry(0.0f);
    entry2 = new Entry(0.0f);
    assertEquals("hashCode() did not return the same value for "
        + "equivalent Entry objects", entry.hashCode(), entry2.hashCode());
  } // Solution: Added hashCode() which returns 1
  
  /**
   * Test 24 - Tests if the <code>hashCode</code> of two different
   * non-equivalent <code>Entry</code> objects, with the same type of
   * <code>Type.NUMBER</code>, return different <code>int</code> values.
   */
  
  @Test
  public void hashCodesNotEqualFloats() {
    entry = new Entry(0.0f);
    entry2 = new Entry(1.0f);
    assertNotEquals("hashCode() returned the same value for non-equal"
        + " Entry objects", entry.hashCode(), entry2.hashCode());
  } // Solution: Added prime and result to hashCode() in addition to
  //             a line which includes the number value into the hash
    
  /**
   * Test 25 - Tests if the <code>hashCode</code> of two different
   * non-equivalent <code>Entry</code> objects, with the same type of
   * <code>Type.SYMBOL</code>, return different <code>int</code> values.
   */
    
  @Test
  public void hashCodesNotEqualSymbol() {
    entry = new Entry(Symbol.LEFT_BRACKET);
    entry2 = new Entry(Symbol.RIGHT_BRACKET);
    assertNotEquals("hashCode() returned the same value for non-equal"
        + " Entry objects", entry.hashCode(), entry2.hashCode());
  } // Solution: Added line which includes the symbol value into the hash  
  
  /**
   * Test 26 - Tests if the <code>hashCode</code> of two different
   * non-equivalent <code>Entry</code> objects, with the same type of
   * <code>Type.STRING</code>, return different <code>int</code> values.
   */
  
  @Test
  public void hashCodesNotEqualString() {
    entry = new Entry("");
    entry2 = new Entry("2 + 4");
    assertNotEquals("hashCode() returned the same value for non-equal"
        + " Entry objects", entry.hashCode(), entry2.hashCode());
  } // Solution: Added line which includes the string value into the hash
  
  /**
   * Test 27 - Tests if <code>equals</code> returns true for two equivalent
   * <code>Entry</code> objects using <code>assertEquals</code>.
   * 
   * @see org.junit.Assert#assertEquals
   */
  
  @Test
  public void entriesEqualReturnsTrue() {
    entry = new Entry(0.0f);
    entry2 = new Entry(0.0f);
    assertEquals("equals() did not return true for equivalent Entry objects",
        entry, entry2);
  } // Solution: Added equals() which returns true

  /**
   * Test 28 - Tests if <code>equals</code> returns false for two non-equivalent
   * <code>Entry</code> objects, with the same type of <code>Type.NUMBER</code>,
   * using <code>assertNotEquals</code>.
   * 
   * @see org.junit.Assert#assertNotEquals
   */
  
  @Test
  public void entriesNotEqualFloatsReturnsFalse() {
    entry = new Entry(0.0f);
    entry2 = new Entry(1.0f);
    assertNotEquals("equals() did not return false for non-equivilant"
        + " Entry objects", entry, entry2);  
  } // Solution: Changed equals to compare hashCodes and return true if
  //             they are equal and otherwise false
    
  /**
   * Test 29 - Tests if <code>equals</code> returns false for two non-equivalent
   * <code>Entry</code> objects, with the same type of <code>Type.SYMBOL</code>,
   * using <code>assertNotEquals</code>.
   * 
   * @see org.junit.Assert#assertNotEquals
   */
  
  @Test
  public void entriesNotEqualSymbolReturnsFalse() {
    entry = new Entry(Symbol.LEFT_BRACKET);
    entry2 = new Entry(Symbol.RIGHT_BRACKET);
    assertNotEquals("equals() did not return false for non-equivilant"
        + " Entry objects", entry, entry2);  
  } // Passed with no changes needed
  
  /**
   * Test 30 - Tests if <code>equals</code> returns false for two non-equivalent
   * <code>Entry</code> objects, with the same type of <code>Type.STRING</code>,
   * using <code>assertNotEquals</code>.
   * 
   * @see org.junit.Assert#assertNotEquals
   */
  
  @Test
  public void entriesNotEqualStringReturnsFalse() {
    entry = new Entry("");
    entry2 = new Entry("2 + 4");
    assertNotEquals("equals() did not return false for non-equivilant"
        + " Entry objects", entry, entry2);   
  } // Passed with no changes needed
  
  /**
   * Test 31 - Tests if <code>equals</code> returns false when a
   * <code>Stack</code> object is compare to null, using
   * <code>assertNotEquals</code>.
   * 
   * @see org.junit.Assert#assertNotEquals
   */
  
  @Test
  public void entriesEqualsNullReturnsFalse() {
    Entry entry = new Entry(0.0f);
    assertNotEquals("equals() did not return false for non-equivilant"
        + " Entry objects", entry, null);  
  } // Solution: Added condition that check if the object passed is an instance
  //             of Entry, if not it returns false
  
  /**
   * Test 32 - Tests if <code>toString</code> returns a <code>String</code>
   * entered into the constructor of entry.
   */
   
  @Test
  public void toStringReturnsEmptyString() {
    entry = new Entry("");
    assertEquals("toString() did not return a string equal"
               + "the string passed into thse constructor", 
               "", entry.toString());
  } // Solution: Added toString which returns ""
  
  /**
   * Test 33 - Tests if <code>toString</code> returns a <code>String</code>
   * entered into the constructor of entry, which is different to the value
   * entered in {@link #toStringReturnsEmptyString}.
   */
  
  @Test
  public void toStringReturnsLargerString() {
    entry = new Entry("2 + 4");
    assertEquals("toString() did not return a string equal"
               + "the string passed into thse constructor", 
               "2 + 4", entry.toString());
  } // Solution: Changed toString to return the string field
  
  /**
   * Test 35 - Tests if <code>toString</code> returns a <code>Symbol</code>
   * entered into the constructor of entry.
   */
  
  @Test
  public void toStringReturnsSymbol() {
    entry = new Entry(Symbol.LEFT_BRACKET);
    assertEquals("toString() did not return a string that represents"
               + "the Symbol passed into thse constructor", 
               "(", entry.toString());
  } // Solution: Added condition that checks if the Entry is a symbol type,
  //             where it returns symbol.toString, if not it just
  //             returns string
  
  /**
   * Test 38 - Tests if <code>toString</code> returns a <code>float</code>
   * entered into the constructor of entry.
   */
  
  @Test
  public void toStringReturnsNumber() {
    entry = new Entry(0.0f);
    assertEquals("toString() did not return a string that represents"
               + "the float passed into thse constructor", 
               "0.0", entry.toString());
  } // Solution: Added condition that checks if the Entry is a number type,
  //             where it returns float.toString

}