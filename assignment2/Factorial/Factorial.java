package JavaCourseProjects.assignment2.Factorial;

import java.util.Scanner;

public class Factorial {

  // Method to calculate factorial iteratively
  public static long factorialIterative(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  // Method to calculate factorial recursively
  public static long factorialRecursive(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorialRecursive(n - 1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number to calculate its factorial: ");
    int number = scanner.nextInt();

    // Calculate factorial using iterative method
    long iterativeResult = factorialIterative(number);
    System.out.println("Factorial of " + number + " (Iterative): " + iterativeResult);

    // Calculate factorial using recursive method
    long recursiveResult = factorialRecursive(number);
    System.out.println("Factorial of " + number + " (Recursive): " + recursiveResult);

    scanner.close();
  }
}