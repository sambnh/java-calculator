package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import stack.Model;

public class Driver extends Application {

  private static FXMLLoader loader;
  private static BorderPane root;
  
  @Override
  public void start(Stage primaryStage) {
    Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());
    scene.getStylesheets()
        .add(getClass().getResource("application.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.show();
  }

  /**
   * The main method for the program used to start.
   * 
   * @param args the arguments for program
   * @throws IOException thrown if the {@link FXMLLoader#load()} cannot load
   *                     the FXML document.
   */

  public static void main(String[] args) throws IOException {
    View view;
    loader = new FXMLLoader(application.Driver.class.getResource("GuiView.fxml"));
    root = loader.load();
    view = loader.getController();
    Model model = new Model();
    new Controller(view, model);
    launch(args);
  }
}
