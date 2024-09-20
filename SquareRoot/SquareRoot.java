package Lab.SquareRoot;

import java.util.Scanner;

public class SquareRoot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double num = scanner.nextDouble();
    // sqrt without using Math.sqrt()
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
