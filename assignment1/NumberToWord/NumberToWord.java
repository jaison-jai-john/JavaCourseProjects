package JavaCourseProjects.assignment1.NumberToWord;

import java.util.Scanner;

public class NumberToWord {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    System.out.println(numToWord(num));
    scanner.close();
  }

  public static String numToWord(int num) {
    String[] ones = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };
    String[] teens = {
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };
    String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
        "ninety"
    };
    String[] thousands = {
        "", "thousand", "million", "billion"
    };

    if (num == 0) {
      return "zero";
    }

    String word = "";
    int i = 0;
    while (num > 0) {
      if (num % 1000 != 0) {
        word = numToWordHelper(num % 1000, ones, teens, tens) + thousands[i] + " " + word;
      }
      num /= 1000;
      i++;
    }
    return word;
  }

  public static String numToWordHelper(int num, String[] ones, String[] teens, String[] tens) {
    String word = "";
    if (num >= 100) {
      word += ones[num / 100] + " hundred ";
      num %= 100;
    }
    if (num >= 10 && num <= 19) {
      return word + teens[num - 10] + " ";
    } else if (num >= 20) {
      word += tens[num / 10] + " ";
      num %= 10;
    }
    if (num >= 1 && num <= 9) {
      word += ones[num] + " ";
    }
    return word;
  }
}
