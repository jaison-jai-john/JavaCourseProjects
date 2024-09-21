package JavaCourseProjects.assignment1.control_flow.Grade;

import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your score: ");
    int score = scanner.nextInt();

    char grade = score > 90 ? 'A' : score > 80 ? 'B' : score > 70 ? 'C' : 'F';
    System.out.println("Your grade is " + grade);

    scanner.close();
  }
}
