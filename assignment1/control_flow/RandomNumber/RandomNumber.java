package JavaCourseProjects.assignment1.control_flow.RandomNumber;

import java.util.Scanner;

public class RandomNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a min range: ");
    int min = scanner.nextInt();
    System.out.print("Enter a max range: ");
    int max = scanner.nextInt();
    int random = (int) (Math.random() * (max - min + 1) + min);
    System.out.println("Random number between " + min + " and " + max + ": " + random);
    scanner.close();
  }
}
