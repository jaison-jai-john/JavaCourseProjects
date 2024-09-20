package JavaCourseProjects.control_flow.Factorial;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    System.out.println("The factorial of " + num + " is: " + factorial(num));
    scanner.close();
  }

  public static int factorial(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    return fact;
  }
}
