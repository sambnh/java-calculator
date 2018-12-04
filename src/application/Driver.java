package application;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Used to start the calculator.
 */

public class Driver extends Application {

  private static Controller controller;
  
  @Override
  public void start(Stage primaryStage) {
    controller.startGui(primaryStage);
  }

  /**
   * The main method for the program used to start.
   * 
   * @param args the arguments for program
   */

  public static void main(String[] args) {
    controller = new Controller();
    launch(args);
  }
}
