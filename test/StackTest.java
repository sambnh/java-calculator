import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import stack.EmptyStackException;
import stack.Entry;
import stack.Stack;
import stack.Symbol;

/**
 * This test case is used to test the <code>Stack</code> class.
 */

public class StackTest {

  Stack stack;
  Stack stack2;
  
  /**
   * Test 41 - Sets up a <code>stack</code> to be used for testing.  
   */
  
  @Before
  public void setup() {
    stack = new Stack();
    stack2 = new Stack();
  }
  
  /**
   * Test 42 - Tests if a <code>Stack</code> object can be instantiated,
   * achieved by implicitly calling {@link #setup()}.
   */
  
  @Test
  public void instantiates() {
    assertNotNull("Stack is null", stack);
  } // Solution: Created empty Stack class
  
  /**
   * Test 43 - Tests if <code>isEmpty</code> returns <code>true</code> when
   * there are no entries.
   */
  
  @Test
  public void isEmptyReturnsTrue() {
    assertTrue("isEmpty() did not return true", stack.isEmpty());
  } // Solution: Added isEmpty which returns false
  
  /**
   * Test 44 - Tests if <code>push</code> runs when an <code>Entry</code>
   * object is passed.
   */
  
  @Test
  public void pushesEntry() {
    stack.push(new Entry(0.0f));
  } // Solution: Added push with Entry parameter
  
  /**
   * Test 45 - Tests if <code>isEmpty</code> returns <code>false</code> when an
   * <code>Entry</code> object has been pushed.
   */
  
  @Test
  public void isEmptyReturnsFalse() {
    stack.push(new Entry(0.0f));
    assertFalse("isEmpty() did not return false", stack.isEmpty());
  } // Solution: Added boolean variable empty, Added constructor
  //             to initialised empty as true, empty is set to false
  //             when push is called and isEmpty now returns empty
  
  /**
   * Test 46 - Tests if <code>top</code> returns the same value as a pushed
   * <code>Entry</code>.
   * 
   * @throws EmptyStackException - added after implementation of this exception.
   */
  
  @Test
  public void topReturnsEntry() throws EmptyStackException {
    Entry entry = new Entry(0.0f);
    stack.push(entry);
    assertEquals("top() did not return the int passed into push()",
        stack.top(), entry);
  } // Solution: Added entry variable which is set to the parameter 
  //             of push, added top which returns entry
  
  /**
   * Test 47 - Tests if <code>pop</code> returns the same value as a pushed
   * <code>Entry</code>.
   * 
   * @throws EmptyStackException - added after implementation of this exception.
   */
  
  @Test
  public void popReturnsEntry() throws EmptyStackException {
    Entry entry = new Entry(0.0f);
    stack.push(entry);
    assertEquals("pop() did not return the int passed into push()",
        stack.pop(), entry);
  } // Solution: Added pop which returns top
  
  /**
   * Test 48 - Tests if <code>isEmpty</code> returns <code>true</code> when
   * an <code>Entry</code> object has been pushed and popped.
   * 
   * @throws EmptyStackException added after implementation of this exception.
   */
  
  @Test
  public void isEmptyAfterPop() throws EmptyStackException {
    stack.push(new Entry(0.0f));
    stack.pop();
    assertTrue("isEmpty() did not return true", stack.isEmpty());
  } // Solution: pop now also sets empty to true
   
  /**
   * Tests if <code>size</code> returns <code>0</code> when
   * the stack is empty.
   */
  
  @Test
  public void sizeReturnsZeroWhenEmpty() {
    assertEquals("size() did not return zero when empty", 0, stack.size());
  } // Solution: Added size which returns 0
  
  /**
   * Test 49 - Tests if <code>size</code> returns <code>1</code> when
   * an <code>Entry</code> object has been pushed onto the stack.
   */

  @Test
  public void sizeReturnsOneAfterPush() {
    stack.push(new Entry(0.0f));
    assertEquals("size() did not return the number of entries", 1,
        stack.size());
  } // Solution: Removed empty, Added int size initialised to 0
  //             push increments size, and isEmpty
  //             returns true if size == 0
  
  /**
   * Test 50 - Tests if <code>size</code> returns <code>0</code> when
   * an <code>Entry</code> object has been pushed onto the stack
   * and popped.
   * 
   * @throws EmptyStackException - added after implementation of this exception.
   */
  
  @Test
  public void sizeReturnsZeroAfterPushAndPop() throws EmptyStackException {
    stack.push(new Entry(0.0f));
    stack.pop();
    assertEquals("size() did not return zero when empty", 0, stack.size());
  } // Solution: pop now decrements size
   
  /**
   * Test 51 - Tests if <code>pop</code> returns the same value 
   * as a pushed <code>Entry</code> after pushing and popping
   * another <code>Entry</code>.
   * 
   * @throws EmptyStackException - added after implementation of this exception.
   */
  
  @Test
  public void lastPopReturnsFirstEntry() throws EmptyStackException {
    Entry entry = new Entry(0.0f);
    stack.push(entry);
    stack.push(new Entry(1.0f));
    stack.pop();
    assertEquals(stack.pop(), entry);
  } // Solution: Removed entry and added Entry array entries with 2 elements,
  //             Push now places entry in the index equal to size before
  //             increment, added local variable top to pop which is set to
  //             the value of top() before incrementing size, top now returns
  //             entries[size - 1]
  
  /**
   * Test 52 - Tests if the stack can hold a large number of entries (512).
   */
  
  @Test
  public void stackHoldsLargeNumberOfEntries() {
    Entry entry = new Entry(0.0f);
    for (int i = 0; i < 512; i++) {
      stack.push(entry);
    }
  } // Solution: Increased number of entry elements to 1024
  
  /**
   * Test 53 - Tests if the stack can hold any number of entries bound only by
   * the max integer value.
   */
  
  @Test
  public void stackHoldsLimitlessEntries() {
    Entry entry = new Entry(0.0f);
    for (int i = 0; i < 65536; i++) {
      stack.push(entry);
    }
  } // Solution: Changed entries to an ArrayList, push now calls add on,
  //             entries pop now removes top element and top calls get on
  //             entries
  
  /**
   * Test 54 - Tests if <code>EmptyStackException</code> is thrown when
   * <code>pop</code> is called on an empty stack.
   * 
   * @throws EmptyStackException - if <code>pop</code> is called when the stack
   *                             has no elements.
   */
  
  @Test(expected = EmptyStackException.class)
  public void popThrowsEmptyStackWhenEmpty() throws EmptyStackException {
    stack.pop();
    fail("Exception was not thrown");
  } // Solution: Added EmptyStackException class which extends Exception,
  //             added condition in pop that throws a EmptyStackException
  //             when isEmpty is true.
  
  @Test(expected = EmptyStackException.class)
  public void topThrowsEmptyStackWhenEmpty() throws EmptyStackException {
    stack.top();
    fail("Exception was not thrown");
  } // Solution: Added isEmpty() condition to top and added throws statement
  
  /**
   * Test 55 - Tests if <code>EmptyStackException</code> is thrown when
   * <code>pop</code> is called on an empty stack.
   * 
   * @throws EmptyStackException - if <code>pop</code> is called when the stack
   *                             has no elements.
   */
  
  @Test
  public void emptyStackExceptionNotThrownWhenNotEmpty() {
    stack.push(new Entry(0.0f));
    try {
      stack.top();
    } catch (EmptyStackException e) {
      fail("EmptyStackException was thrown");
    }
  } // Passed with no changes needed
  
  /**
   * Test 56 - Tests if, when a <code>EmptyStackException</code> is thrown,
   * <code>getMessage</code> can be called on the caught exception.
   */
  
  @Test
  public void emptyStackExceptiongetMessageReturns() {
    try {
      stack.top();
    } catch (EmptyStackException e) {
      assertNotNull("EmptyStackException did not return a message",
          e.getMessage());
    }
  } // Solution: Added constructor to EmptyStackException that takes a String
  //             parameter and calls super constructor, added message to throw
  //             in top and pop.
  
  /**
   * Test 57 - Tests if the <code>hashCode</code> of two different but
   * equivalent <code>Stack</code> objects return the same <code>int</code>
   * value.
   */
  
  @Test
  public void hashCodesEqual() {
    Entry entry = new Entry(0.0f);
    stack.push(entry);
    stack2.push(entry);
    assertEquals("hashCode() did not return the same value for "
        + "equivalent Stack objects", stack.hashCode(), stack2.hashCode());
  } // Solution: Added hashCode() which returns 1
  
  /**
   * Test 58 - Tests if the <code>hashCode</code> of two different
   * non-equivalent <code>Stack</code> objects, with different entries, return
   * different <code>int</code> values.
   */
  
  @Test
  public void hashCodesNotEqual() {
    Entry entry = new Entry(0.0f);
    Entry entry2 = new Entry(1.0f);
    stack.push(entry);
    stack.push(entry2);
    assertNotEquals("hashCode() returned the same value for non-equal"
        + " Stack objects", stack.hashCode(), stack2.hashCode());
  } // Solution: Added prime and result to hashCode() in addition to
  //             a line which iterates through every entry in the stack
  //             and hashes them into the result
  
  /**
   * Test 59 - Tests if <code>equals</code> returns true for two equivalent
   * <code>Stack</code> objects using <code>assertEquals</code>.
   * 
   * @see org.junit.Assert#assertEquals
   */
  
  @Test
  public void stacksEqualReturnsTrue() {
    Entry entry = new Entry(0.0f);
    stack.push(entry);
    stack2.push(entry);
    assertEquals("equals() did not return true for equivalent Stack objects",
        stack, stack2);
  } // Solution: Added equals() which returns true
  
  /**
   * Test 60 - Tests if <code>equals</code> returns false for two non-equivalent
   * <code>Stack</code> objects, using <code>assertNotEquals</code>.
   * 
   * @see org.junit.Assert#assertNotEquals
   */
  
  @Test
  public void stacksNotEqualReturnsFalse() {
    stack.push(new Entry(0.0f));
    stack2.push(new Entry(1.0f));
    assertNotEquals("equals() did not return false for non-equivilant"
        + " Stack objects", stack, stack2);  
  } // Solution: Changed equals to compare hashCodes and return true if
  //             they are equal and otherwise false
  
  /**
   * Test 61 - Tests if <code>equals</code> returns false when a
   * <code>Stack</code> object is compare to null, using
   * <code>assertNotEquals</code>.
   */
  
  @Test
  public void stacksEqualsNullReturnsFalse() {
    stack.push(new Entry(0.0f));
    assertNotEquals("equals() did not return false for non-equivilant"
        + " Stack objects", stack, null);  
  } // Solution: Added condition that check if the object passed is an instance
  //             of Stack, if not it returns false
  
  /**
   * Test 62 - Tests if <code>toString</code> returns a <code>String</code>
   * representing an empty stack.
   */
   
  @Test
  public void toStringReturnsEmptyStackString() {
    assertEquals("toString() did not return a string representing"
               + "an empty stack", "[]", stack.toString());
  } // Solution: Added toString which returns "[]"
  
  /**
   * Test 63 - Tests if <code>toString</code> returns a <code>String</code>
   * representing a single entry in the stack.
   */
  
  @Test
  public void toStringReturnsOneEntryStackString() {
    stack.push(new Entry(0.0f));
    assertEquals("toString() did not return a string representing"
               + "an empty stack", "[0.0]", stack.toString());
  } // Solution: Changed toString to return the top() of the stack 
  //             in a try catch, returning "[]" if the stack is empty.
  
  /**
   * Test 64 - Tests if <code>toString</code> returns a <code>String</code>
   * representing a multiple entries in the stack.
   */
  
  @Test
  public void toStringReturnsLargerStackString() {
    stack.push(new Entry(0.0f));
    stack.push(new Entry(Symbol.LEFT_BRACKET));
    stack.push(new Entry("4 + 2"));
    assertEquals("toString() did not return a string representing"
               + "an empty stack", "[0.0, (, 4 + 2]", stack.toString());
  } // Solution: Changed toString to return the top() of the stack 
  //             in a try catch, returning "[]" if the stack is empty.
 
}
