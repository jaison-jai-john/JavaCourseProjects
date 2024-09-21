package JavaCourseProjects.assignment1.IsPerfectSquare;

import java.util.Scanner;

public class IsPerfectSquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    if (isPerfectSquare(num)) {
      System.out.println(num + " is a perfect square");
    } else {
      System.out.println(num + " is not a perfect square");
    }
    scanner.close();
  }

  public static boolean isPerfectSquare(int num) {
    int sqrt = (int) Math.sqrt(num);
    return sqrt * sqrt == num;
  }
}
