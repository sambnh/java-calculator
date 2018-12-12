package stack;

import java.util.Scanner;

/**
 * The reverse polish implementation of a calculator.
 */

public class ReversePolishCalculator implements Calculator {

  private NumStack numStack;

  @Override
  public float evaluate(String expression) throws InvalidExpressionException {
    if (expression == null) {
      throw new InvalidExpressionException("Expression must be non-null");
    }
    Scanner s = new Scanner(expression);
    numStack = new NumStack();
    if (!s.hasNextFloat()) {
      s.close();
      throw new InvalidExpressionException("Invalid expression");
    }
    while (s.hasNext()) {
      if (s.hasNextFloat()) {
        numStack.push(s.nextFloat());
      } else {
        
        try {
          float num1 = numStack.pop();
          float num2 = numStack.pop();
          String operator = s.next();
          switch (operator) {
            case "+": numStack.push(num2 + num1);
              break;
            case "-": numStack.push(num2 - num1);
              break;
            case "*": numStack.push(num2 * num1);
              break;
            case "/": numStack.push(num2 / num1);
              break;
            default:
              throw new InvalidExpressionException(
                "Invalid operator '" + operator + "'");
          }
        } catch (EmptyStackException | BadTypeException e) {
          s.close();
          throw new InvalidExpressionException("Invalid expression");
        }
      } 
    }
    s.close();
    try {
      Float answer = numStack.pop();
      if (!numStack.isEmpty()) {
        throw new InvalidExpressionException("Invalid expression");
      }
      return answer;
    } catch (EmptyStackException | BadTypeException e) {
      throw new InvalidExpressionException("Invalid expression");
    }
  }

}
