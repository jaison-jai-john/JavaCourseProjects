package JavaCourseProjects.control_flow.Largest_num;

import java.util.Scanner;

public class Largest_num {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      nums[i] = scanner.nextInt();
    }

    System.out.println("The greatest number is: " + greatest(nums));
    scanner.close();
  }

  public static int greatest(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }
}
