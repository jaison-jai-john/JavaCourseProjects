package Lab.EvenNumbers;

import java.util.Scanner;

public class EvenNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter starting number: ");
    int start = scanner.nextInt();
    System.out.print("Enter ending number: ");
    int end = scanner.nextInt();
    System.out.println("Even numbers between " + start + " and " + end + " are:");
    for (int i = start; i <= end; i++) {
      if (isEven(i)) {
        System.out.println(i);
      }
    }
    scanner.close();
  }

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }
}
