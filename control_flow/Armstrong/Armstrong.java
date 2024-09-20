package Lab.control_flow.Armstrong;

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    if (isArmstrong(num)) {
      System.out.println(num + " is an Armstrong number.");
    } else {
      System.out.println(num + " is not an Armstrong number.");
    }
    scanner.close();
  }

  public static boolean isArmstrong(int num) {
    int sum = 0;
    int temp = num;
    while (temp != 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, 3);
      temp /= 10;
    }
    return sum == num;
  }
}
