package Lab.SumOfNaturals;

import java.util.Scanner;

public class SumOfNaturals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.println("Sum of first " + num + " natural numbers is " + sum);
    scanner.close();
  }
}
