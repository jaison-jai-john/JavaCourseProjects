package JavaCourseProjects.assignment2.StudentMarkList;

import java.util.Scanner;

public class StudentMarkList {
  private static final int NUM_STUDENTS = 5;
  private static final int NUM_SUBJECTS = 3;
  private static final int PASS_MARK = 40;
  private static final int[][] marks = new int[NUM_STUDENTS][NUM_SUBJECTS];

  public static void main(String[] args) {
    fetchMarks();
    displayMarks();
    gradeStudents();
  }

  public static void fetchMarks() {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < NUM_STUDENTS; i++) {
      System.out.println("Enter marks for student " + (i + 1));
      for (int j = 0; j < NUM_SUBJECTS; j++) {
        System.out.print("Enter marks for subject " + (j + 1) + ": ");
        marks[i][j] = scanner.nextInt();
      }
    }
    scanner.close();
  }

  public static void gradeStudents() {
    for (int i = 0; i < NUM_STUDENTS; i++) {
      int totalMarks = 0;
      for (int j = 0; j < NUM_SUBJECTS; j++) {
        totalMarks += marks[i][j];
      }
      if (totalMarks >= NUM_SUBJECTS * PASS_MARK) {
        System.out.println("Student " + (i + 1) + " passed with " + totalMarks + " marks");
      } else {
        System.out.println("Student " + (i + 1) + " failed with " + totalMarks + " marks");
      }
    }
  }

  public static void displayMarks() {
    for (int i = 0; i < NUM_STUDENTS; i++) {
      System.out.print("Student " + (i + 1) + ": ");
      for (int j = 0; j < NUM_SUBJECTS; j++) {
        System.out.print(marks[i][j] + " ");
      }
      System.out.println();
    }
  }
}
