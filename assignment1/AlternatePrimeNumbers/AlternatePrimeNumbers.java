package JavaCourseProjects.assignment1.AlternatePrimeNumbers;

import java.util.Scanner;

public class AlternatePrimeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter statring number: ");
    int start = scanner.nextInt();
    System.out.print("Enter ending number: ");
    int end = scanner.nextInt();
    System.out.println("Alternate prime numbers between " + start + " and " + end + " are:");
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
    scanner.close();
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
