package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import stack.Model;

/**
 * The class observes the {@link View} and calls methods in {@link Model} to
 * connect the functionality of the calculator to the UI.
 */

public class Controller {

  BorderPane root;
  Model model;
  View view;
  Boolean infix;

  /**
   * Constructs a new <code>Controller</code> that which stores a
   * <code>View</code> and a <code>Model</code>.
   * 
   */

  public Controller() {
    FXMLLoader loader = new FXMLLoader(
        application.Driver.class.getResource("GuiView.fxml"));
    try {
      root = loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
    view = loader.getController();
    model = new Model();
    this.view.addCalculateObserver(this::calculate);
    this.view.addTypeObserver(this::changeType);
  }

  /**
   * Starts the JavaFX application.
   * 
   * @param primaryStage - the primary stage for calculator, onto which the
   *                     application scene can be set.
   */

  public void startGui(Stage primaryStage) {
    Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());
    scene.getStylesheets()
        .add(getClass().getResource("application.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.show();
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
