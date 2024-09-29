package JavaCourseProjects.assignment2.Area;

public class AreaCalculation {

  public static void main(String[] args) {
    // Create instances of each shape
    Circle circle = new Circle(5);
    Square square = new Square(4);
    Rectangle rectangle = new Rectangle(4, 6);
    Cone cone = new Cone(3, 5);
    Triangle triangle = new Triangle(3, 4);

    // Display the area of each shape
    System.out.println("Area of Circle: " + circle.calculateArea());
    System.out.println("Area of Square: " + square.calculateArea());
    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    System.out.println("Surface Area of Cone: " + cone.calculateArea());
    System.out.println("Area of Triangle: " + triangle.calculateArea());
  }
}

class Circle {
  private double radius;

  // Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Method to calculate area
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

class Square {
  private double side;

  // Constructor
  public Square(double side) {
    this.side = side;
  }

  // Method to calculate area
  public double calculateArea() {
    return side * side;
  }
}

class Rectangle {
  private double length;
  private double width;

  // Constructor
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Method to calculate area
  public double calculateArea() {
    return length * width;
  }
}

class Cone {
  private double radius;
  private double height;

  // Constructor
  public Cone(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  // Method to calculate surface area
  public double calculateArea() {
    double slantHeight = Math.sqrt(radius * radius + height * height);
    return Math.PI * radius * (radius + slantHeight);
  }
}

class Triangle {
  private double base;
  private double height;

  // Constructor
  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  // Method to calculate area
  public double calculateArea() {
    return 0.5 * base * height;
  }
}