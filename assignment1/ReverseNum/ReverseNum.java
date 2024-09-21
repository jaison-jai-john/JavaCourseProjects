package JavaCourseProjects.assignment1.ReverseNum;

import java.util.Scanner;

public class ReverseNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    while (true) {
      int reverse = 0;
      int temp = num;
      while (temp != 0) {
        int digit = temp % 10;
        reverse = reverse * 10 + digit;
        temp /= 10;
      }
      System.out.println("Reverse of " + num + " is " + reverse);
      System.out.print("Enter another number (0 to exit): ");
      num = scanner.nextInt();
      if (num == 0) {
        break;
      }
    }
    scanner.close();
  }
}
