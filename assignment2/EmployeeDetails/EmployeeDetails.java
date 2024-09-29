package JavaCourseProjects.assignment2.EmployeeDetails;

public class EmployeeDetails {

  public static void main(String[] args) {
    // Create an instance of the Employee class using the constructor
    Employee employee = new Employee("John Doe", 30, "Software Engineer", 50000.0);

    // Display employee details
    employee.displayEmployeeDetails();
  }
}

class Employee {
  private String name;
  private int age;
  private String designation;
  private double salary;

  // Constructor to initialize employee details
  public Employee(String name, int age, String designation, double salary) {
    this.name = name;
    this.age = age;
    this.designation = designation;
    this.salary = salary;
  }

  // Method to display employee details
  public void displayEmployeeDetails() {
    System.out.println("Employee Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Designation: " + designation);
    System.out.println("Salary: $" + salary);
  }

  // Getter and Setter methods for name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter and Setter methods for age
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Getter and Setter methods for designation
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  // Getter and Setter methods for salary
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}