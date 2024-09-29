package JavaCourseProjects.assignment2.Fibonacci;

public class Fibonacci {
  public static void main(String[] args) {
    int n = 10;
    int a = 0;
    int b = 1;
    System.out.print("First " + n + " terms: ");
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      int sum = a + b;
      a = b;
      b = sum;
    }
  }
}
