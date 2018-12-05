package application;

import java.util.function.Consumer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 * Provides a GUI for the calculator.
 */

public class GuiView implements View {

  @FXML // fx:id="answerText"
  private TextField answerText; // Value injected by FXMLLoader

  @FXML // fx:id="reverseRadio"
  private RadioButton reverseRadio; // Value injected by FXMLLoader

  @FXML // fx:id="infixRadio"
  private RadioButton infixRadio; // Value injected by FXMLLoader

  @FXML // fx:id="calculateButton"
  private Button calculateButton; // Value injected by FXMLLoader

  @FXML // fx:id="type"
  private ToggleGroup type; // Value injected by FXMLLoader

  @FXML // fx:id="expressionText"
  private TextField expressionText; // Value injected by FXMLLoader

  @Override
  public String getExpression() {
    return expressionText.getText();
  }

  @Override
  public void setAnswer(String answer) {
    answerText.setText(answer);
  }

  @Override
  public void addCalculateObserver(Observer observer) {
    calculateButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        observer.tell();
      }
    });
  }

  @Override
  public void addTypeObserver(Consumer<Boolean> consumer) {
    type.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

      @Override
      public void changed(ObservableValue<? extends Toggle> observable,
          Toggle from, Toggle to) {
        consumer.accept(to == infixRadio ? Boolean.TRUE : Boolean.FALSE);
      }
    });
  }

}
