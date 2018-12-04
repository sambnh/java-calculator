package application;

import stack.Model;

/**
 * The class observes the {@link View} and calls methods in {@link Model} to
 * connect the functionality of the calculator to the UI.
 */

public class Controller {

  Model model;
  View view;
  Boolean infix;

  /**
   * Constructs a new <code>Controller</code> that which stores a
   * <code>View</code> and a <code>Model</code>.
   * 
   * @param view  - the <code>View</code> to be used
   * @param model - the <code>Model</code> to be used
   */

  public Controller(View view, Model model) {
    this.view = view;
    this.model = model;
    this.view.addCalculateObserver(this::calculate);
    this.view.addTypeObserver(this::changeType);
  }

  /**
   * Passes the <code>View</code>'s expression into the <code>Model</code>'s
   * <code>evaluate</code> method, which returns the answer which is passed back
   * to the view.
   */

  private void calculate() {
    view.setAnswer(String.valueOf(model.evaluate(view.getExpression())));
  }

  /**
   * Sets the value of <code>infix</code> to that of the parameter passed.
   * 
   * @param infix - <code>true</code> if the type is infix, <code>false</code>
   *              if the type is reverse polish.
   */

  private void changeType(Boolean infix) {
    this.infix = infix;
  }

}
