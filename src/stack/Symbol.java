package stack;
/**
 * A list of the non-number tokens possible in an expression.
 */
public enum Symbol {
  
  LEFT_BRACKET("("),
  RIGHT_BRACKET(")"),
  TIMES("*"),
  DIVIDE("/"),
  PLUS("+"),
  MINUS("-"),
  INVALID("Invalid");
  
  String symbol;
  
  /**
   * Constructs an instance of <code>Symbol</code>.
   * 
   * @param symbol The <code>String</code> of the symbol that is being
   *               represented.
   */
  Symbol(String symbol) {
    this.symbol = symbol;
  }
  
  /**
   * Returns a <code>String</code> that is being represented by this
   * <code>Symbol</code>.
   * 
   * @return The <code>String</code> of the symbol that is represented by this
   *         instance.
   */
  
  @Override
  public String toString() {
    return symbol;
  }
  
}
