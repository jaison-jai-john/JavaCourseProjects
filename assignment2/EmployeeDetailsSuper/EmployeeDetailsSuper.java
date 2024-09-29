package JavaCourseProjects.assignment2.EmployeeDetailsSuper;

// Superclass
class Employee {
  String name;
  int age;
  double salary;

  // Constructor
  Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  // Method to display employee details
  void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: $" + salary);
  }
}

// Subclass
class Manager extends Employee {
  String department;

  // Constructor
  Manager(String name, int age, double salary, String department) {
    // Calling the superclass constructor
    super(name, age, salary);
    this.department = department;
  }

  // Method to display manager details
  void displayDetails() {
    // Calling the superclass method
    super.displayDetails();
    System.out.println("Department: " + department);
  }

  // Method to demonstrate accessing superclass field
  void printSalary() {
    System.out.println("Salary in Employee class: $" + super.salary);
  }
}

public class EmployeeDetailsSuper {
  public static void main(String[] args) {
    // Create an instance of Manager
    Manager manager = new Manager("John Doe", 35, 75000.0, "IT");

    // Display manager details
    manager.displayDetails();

    // Print salary using superclass field
    manager.printSalary();
  }
}