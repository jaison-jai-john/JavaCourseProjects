package JavaCourseProjects.assignment1.OddNumbers;

public class OddNumbers {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (!isEven(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }
}
