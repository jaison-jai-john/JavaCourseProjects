package Lab.LargestOfThree;

import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    System.out.print("Enter the third number: ");
    int num3 = scanner.nextInt();
    int largest = num1;
    if (num2 > largest) {
      largest = num2;
    }
    if (num3 > largest) {
      largest = num3;
    }
    System.out.println("Largest of " + num1 + ", " + num2 + ", and " + num3 + " is " + largest);
    scanner.close();
  }
}
