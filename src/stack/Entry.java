package stack;
/**
 * Values stored in a Stack.
 */
public class Entry {
  
  private float number;
  private Symbol symbol;
  private String string;
  private Type type;

  /**
   * Constructs a new <code>Entry</code> that stores a <code>float</code>.
   * 
   * @param number The <code>float</code> that this stores
   */
  
  public Entry(float number) {
    this.number = number;
    type = Type.NUMBER;
  }

  /**
   * Constructs a new <code>Entry</code> that stores a <code>Symbol</code>.
   * 
   * @param symbol The <code>Symbol</code> that this stores.
   */
  
  public Entry(Symbol symbol) {
    this.symbol = symbol;
    type = Type.SYMBOL;
  }

  /**
   * Constructs a new <code>Entry</code> that stores a <code>String</code>.
   * 
   * @param string The <code>String</code> that this stores.
   */
  
  public Entry(String string) {
    this.string = string;
    type = Type.STRING;
  }

  /**
   * Returns the type.
   * 
   * @return this entry's type.
   */
  
  public Type getType() {
    return type;
  }

  /**
   * Returns <code>string</code>. If the <code>type</code> is not
   * <code>Type.STRING</code>, a BadTypeException is thrown.
   * 
   * @return this entry's <code>string</code>.
   * @throws BadTypeException if the <code>type</code> is not
   *                          <code>Type.STRING</code>.
   */

  public String getString() throws BadTypeException {
    if (type != Type.STRING) {
      throw new BadTypeException(
        "Entry type must be string to call getString()");
    }
    return string;
  }

  /**
   * Returns <code>symbol</code>. If the <code>type</code> is not
   * <code>Type.SYMBOL</code>, a BadTypeException is thrown.
   * 
   * @return this entry's <code>symbol</code>.
   * @throws BadTypeException if the <code>type</code> is not
   *                          <code>Type.SYMBOL</code>.
   */

  public Symbol getSymbol() throws BadTypeException {
    if (type != Type.SYMBOL) {
      throw new BadTypeException(
        "Entry type must be symbol to call getSymbol()");
    }
    return symbol;
  }

  /**
   * Returns <code>number</code>. If the <code>type</code> is not
   * <code>Type.NUMBER</code>, a BadTypeException is thrown.
   * 
   * @return this entry's <code>number</code>.
   * @throws BadTypeException if the <code>type</code> is not
   *                          <code>Type.NUMBER</code>.
   */

  public float getValue() throws BadTypeException {
    if (type != Type.NUMBER) {
      throw new BadTypeException(
        "Entry type must be number to call getValue()");
    }
    return number;
  }
  
  /**
   * Indicates if another object is equal to this one.
   * 
   * @return true if this object is the same as the argument; 
   *              otherwise false.
   */

  @Override
  public boolean equals(Object o) {
    if (o instanceof Entry) {
      return this.hashCode() == o.hashCode();      
    }
    return false;
  }
  
  /**
   * Returns a hash code value for an <code>Entry</code> object.
   * 
   * @return this entry's hash code.
   */
     
  @Override
  public int hashCode() {
    int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(number);
    result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
    result = prime * result + ((string == null) ? 0 : string.hashCode());
    return result;
  }
  
  /**
   * Returns a string representation of an instance of <code>Entry</code>.
   * 
   * @return a string representation of an instance of <code>Entry</code>.
   */
 
  @Override
  public String toString() {
    if (type == Type.SYMBOL) {
      return symbol.toString();
    } else if (type == Type.NUMBER) {
      return String.valueOf(number);
    }
    return string;
  }
  
}
