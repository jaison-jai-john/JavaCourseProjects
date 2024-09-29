package JavaCourseProjects.assignment2.EmployeeSalary;

public class EmployeeSalary {

  public static void main(String[] args) {
    // Create an instance of the Employee class
    Employee employee = new Employee("John Doe", 40, 20.0);

    // Display employee details
    employee.displayEmployeeDetails();

    // Calculate and display the salary
    double salary = employee.calculateSalary();
    System.out.println("Total Salary: $" + salary);
  }
}

class Employee {
  private String name;
  private int hoursWorked;
  private double hourlyRate;

  // Constructor
  public Employee(String name, int hoursWorked, double hourlyRate) {
    this.name = name;
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }

  // Method to calculate salary
  public double calculateSalary() {
    return hoursWorked * hourlyRate;
  }

  // Method to display employee details
  public void displayEmployeeDetails() {
    System.out.println("Employee Name: " + name);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Hourly Rate: $" + hourlyRate);
  }

  // Getter and Setter methods for name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter and Setter methods for hoursWorked
  public int getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  // Getter and Setter methods for hourlyRate
  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }
}