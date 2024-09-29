package JavaCourseProjects.assignment2.AreaRunTime;

// Superclass
class Shape {
  // Method to calculate area
  double calculateArea() {
    return 0.0;
  }

  // Method to display area
  void displayArea() {
    System.out.println("Area: " + calculateArea());
  }
}

// Subclass for Circle
class Circle extends Shape {
  double radius;

  // Constructor
  Circle(double radius) {
    this.radius = radius;
  }

  // Overriding the calculateArea method
  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }
}

// Subclass for Square
class Square extends Shape {
  double side;

  // Constructor
  Square(double side) {
    this.side = side;
  }

  // Overriding the calculateArea method
  @Override
  double calculateArea() {
    return side * side;
  }
}

// Subclass for Rectangle
class Rectangle extends Shape {
  double length, width;

  // Constructor
  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Overriding the calculateArea method
  @Override
  double calculateArea() {
    return length * width;
  }
}

// Subclass for Triangle
class Triangle extends Shape {
  double base, height;

  // Constructor
  Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  // Overriding the calculateArea method
  @Override
  double calculateArea() {
    return 0.5 * base * height;
  }
}

public class AreaRunTime {
  public static void main(String[] args) {
    // Create instances of each shape
    Shape circle = new Circle(5);
    Shape square = new Square(4);
    Shape rectangle = new Rectangle(4, 6);
    Shape triangle = new Triangle(3, 4);

    // Display the area of each shape
    System.out.println("Circle:");
    circle.displayArea();

    System.out.println("Square:");
    square.displayArea();

    System.out.println("Rectangle:");
    rectangle.displayArea();

    System.out.println("Triangle:");
    triangle.displayArea();
  }
}