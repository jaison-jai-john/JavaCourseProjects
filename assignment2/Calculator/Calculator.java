package JavaCourseProjects.assignment2.Calculator;

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class Calculator {

  // Method to evaluate an expression
  public double evaluate(String expression) {
    Queue<String> postfix = infixToPostfix(expression);
    return evaluatePostfix(postfix);
  }

  // Method to convert infix expression to postfix expression
  private Queue<String> infixToPostfix(String expression) {
    Stack<Character> stack = new Stack<>();
    Queue<String> output = new LinkedList<>();
    StringBuilder number = new StringBuilder();

    for (int i = 0; i < expression.length(); i++) {
      char c = expression.charAt(i);

      if (Character.isDigit(c) || c == '.') {
        number.append(c);
      } else {
        if (number.length() > 0) {
          output.add(number.toString());
          number.setLength(0);
        }

        if (c == '(') {
          stack.push(c);
        } else if (c == ')') {
          while (!stack.isEmpty() && stack.peek() != '(') {
            output.add(stack.pop().toString());
          }
          stack.pop();
        } else if (isOperator(c)) {
          while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
            output.add(stack.pop().toString());
          }
          stack.push(c);
        }
      }
    }

    if (number.length() > 0) {
      output.add(number.toString());
    }

    while (!stack.isEmpty()) {
      output.add(stack.pop().toString());
    }

    return output;
  }

  // Method to evaluate postfix expression
  private double evaluatePostfix(Queue<String> postfix) {
    Stack<Double> stack = new Stack<>();

    while (!postfix.isEmpty()) {
      String token = postfix.poll();

      if (isNumber(token)) {
        stack.push(Double.parseDouble(token));
      } else if (isOperator(token.charAt(0))) {
        double b = stack.pop();
        double a = stack.pop();
        switch (token.charAt(0)) {
          case '+':
            stack.push(a + b);
            break;
          case '-':
            stack.push(a - b);
            break;
          case '*':
            stack.push(a * b);
            break;
          case '/':
            if (b == 0) {
              throw new ArithmeticException("Error: Division by zero is not allowed.");
            }
            stack.push(a / b);
            break;
        }
      }
    }

    return stack.pop();
  }

  // Method to check if a character is an operator
  private boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/';
  }

  // Method to check the precedence of operators
  private int precedence(char c) {
    switch (c) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      default:
        return -1;
    }
  }

  // Method to check if a string is a number
  private boolean isNumber(String token) {
    try {
      Double.parseDouble(token);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    System.out.println("Enter an expression: ");
    String expression = scanner.nextLine();

    try {
      double result = calculator.evaluate(expression);
      System.out.println("The result is: " + result);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    scanner.close();
  }
}