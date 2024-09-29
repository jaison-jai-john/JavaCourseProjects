package JavaCourseProjects.assignment2.SqrtWithoutFunction;

import java.util.Scanner;

public class SqrtWithoutFunction {
  public static void main(String[] args) {

    // Scanner class to take user input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double num = scanner.nextDouble();
    double sqrt = num / 2;
    double temp;
    do {
      temp = sqrt;
      sqrt = (temp + (num / temp)) / 2;
    } while ((temp - sqrt) != 0);
    System.out.println("Square root of " + num + " is " + sqrt);
    scanner.close();
  }
}
