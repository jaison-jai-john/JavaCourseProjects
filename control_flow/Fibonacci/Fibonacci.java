package Lab.control_flow.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    System.out.println("Fibonacci series:");
    for (int i = 0; i < num; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    scanner.close();
  }

  public static int fibonacci(int num) {
    if (num == 0) {
      return 0;
    } else if (num == 1) {
      return 1;
    } else {
      return fibonacci(num - 1) + fibonacci(num - 2);
    }
  }
}
