package JavaCourseProjects.assignment2.Super;

// Superclass
class Super {
  String name = "SuperClass";

  // Constructor
  Super() {
    System.out.println("Constructor of SuperClass");
  }

  // Method
  void display() {
    System.out.println("Method of SuperClass");
  }
}

// Subclass
class Sub extends Super {
  String name = "SubClass";

  // Constructor
  Sub() {
    // Calling the superclass constructor
    super();
    System.out.println("Constructor of SubClass");
  }

  // Method
  void display() {
    // Calling the superclass method
    super.display();
    System.out.println("Method of SubClass");
  }

  // Method to demonstrate accessing superclass field
  void printNames() {
    System.out.println("Name in SubClass: " + name);
    System.out.println("Name in SuperClass: " + super.name);
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    // Create an instance of Sub
    Sub sub = new Sub();

    // Call the display method
    sub.display();

    // Call the printNames method
    sub.printNames();
  }
}