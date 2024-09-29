package JavaCourseProjects.assignment2.Methods;

import java.util.Scanner;

public class Methods {

  // User-defined method to add two numbers
  public int add(int a, int b) {
    return a + b;
  }

  // User-defined method to display a message
  public void displayMessage(String message) {
    System.out.println("User-defined method: " + message);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Create an instance of the Methods class
    Methods methods = new Methods();

    // Using a predefined method (System.out.println)
    System.out.println("Predefined method: This is a predefined method in Java.");

    // Using user-defined methods
    System.out.print("Enter two numbers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int sum = methods.add(num1, num2);
    methods.displayMessage("The sum of 5 and 10 is " + sum);

    scanner.close();
  }
}