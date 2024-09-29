package JavaCourseProjects.assignment1.EvenNumbers;

public class EvenNumbers {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
      if (isEven(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }
}
