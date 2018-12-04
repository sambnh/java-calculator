package application;

import java.util.function.Consumer;

/**
 * The interface to outline the methods required for a <code>View</code>.
 */

public interface View {

  /**
   * Returns the user inputed expression.
   * 
   * @return the user inputed expression
   */

  public String getExpression();

  /**
   * Sets the answer of the inputed expression.
   * 
   * @param answer - the answer to the expression.
   */

  public void setAnswer(String answer);

  /**
   * Adds an observer that listens for the users signal to initiate a
   * calculation of the inputed expression.
   * 
   * @param observer - the observer listening for the user signal.
   */

  public void addCalculateObserver(Observer observer);

  /**
   * Adds a consumer that listens for the user to signal that the type
   * calculator type has changed and passes a boolean which is <code>true</code>
   * if the type is infix and <code>false</code> if the type is reverse polish.
   * 
   * @param consumer - the consumer ready to except a boolean parameter.
   */

  public void addTypeObserver(Consumer<Boolean> consumer);

}
