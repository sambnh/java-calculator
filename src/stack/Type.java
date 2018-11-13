package stack;
/**
 * A list of types of value an Entry can represent
 */
public enum Type {

  NUMBER,
  SYMBOL,
  STRING,
  INVALID;
  
  /**
   * Returns a <code>String</code> object representing the specified symbol.
   * 
   * @return a string of type
   */
  
  @Override
  public String toString() {
    return "Type: " + name();
  }

}
