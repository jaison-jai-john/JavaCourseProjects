package JavaCourseProjects.assignment1.IsPositiveOrNegative;

import java.util.Scanner;

public class IsPositiveOrNegative {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    if (num > 0) {
      System.out.println(num + " is positive");
    } else if (num < 0) {
      System.out.println(num + " is negative");
    } else {
      System.out.println(num + " is neither positive nor negative");
    }
    scanner.close();
  }
}
