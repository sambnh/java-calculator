package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class GUIView implements View{
    
  @FXML
  void calculateButtonPressed() {
    answerText.setText("1");
  }

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
  
}
