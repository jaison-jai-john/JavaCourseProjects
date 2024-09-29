package JavaCourseProjects.assignment1.control_flow.MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = scanner.nextInt();

    System.out.print("How many multiplcations do you need?: ");
    int max = scanner.nextInt();

    for (int i = 1; i < max + 1; i++) {
      System.out.println(num + " x " + i + " = " + num * i);
    }
    scanner.close();
  }
}
