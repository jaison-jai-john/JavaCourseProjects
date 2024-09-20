package Lab.operators;

import java.util.Scanner;

public class operators {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Arithmetic Operators
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    System.out.println("Arithmetic Operators:");
    System.out.println("Addition: " + (num1 + num2));
    System.out.println("Subtraction: " + (num1 - num2));
    System.out.println("Multiplication: " + (num1 * num2));
    System.out.println("Division: " + (num1 / num2));
    System.out.println("Modulus: " + (num1 % num2));

    // Assignment Operators
    int a = num1;
    System.out.println("\nAssignment Operators:");
    System.out.println("a = " + a);
    a += num2;
    System.out.println("a += num2: " + a);
    a -= num2;
    System.out.println("a -= num2: " + a);
    a *= num2;
    System.out.println("a *= num2: " + a);
    a /= num2;
    System.out.println("a /= num2: " + a);
    a %= num2;
    System.out.println("a %= num2: " + a);

    // Relational Operators
    System.out.println("\nRelational Operators:");
    System.out.println("num1 == num2: " + (num1 == num2));
    System.out.println("num1 != num2: " + (num1 != num2));
    System.out.println("num1 > num2: " + (num1 > num2));
    System.out.println("num1 < num2: " + (num1 < num2));
    System.out.println("num1 >= num2: " + (num1 >= num2));
    System.out.println("num1 <= num2: " + (num1 <= num2));

    // Logical Operators
    System.out.print("\nEnter a boolean value (true/false): ");
    boolean bool1 = scanner.nextBoolean();
    System.out.print("Enter another boolean value (true/false): ");
    boolean bool2 = scanner.nextBoolean();

    System.out.println("\nLogical Operators:");
    System.out.println("bool1 && bool2: " + (bool1 && bool2));
    System.out.println("bool1 || bool2: " + (bool1 || bool2));
    System.out.println("!bool1: " + (!bool1));

    // Unary Operators
    System.out.println("\nUnary Operators:");
    int unary = num1;
    System.out.println("unary: " + unary);
    System.out.println("++unary: " + (++unary));
    System.out.println("--unary: " + (--unary));
    System.out.println("unary++: " + (unary++));
    System.out.println("unary--: " + (unary--));
    System.out.println("unary: " + unary);

    // Bitwise Operators
    System.out.println("\nBitwise Operators:");
    System.out.println("num1 & num2: " + (num1 & num2));
    System.out.println("num1 | num2: " + (num1 | num2));
    System.out.println("num1 ^ num2: " + (num1 ^ num2));
    System.out.println("~num1: " + (~num1));
    System.out.println("num1 << 2: " + (num1 << 2));
    System.out.println("num1 >> 2: " + (num1 >> 2));
    System.out.println("num1 >>> 2: " + (num1 >>> 2));

    scanner.close();
  }
}