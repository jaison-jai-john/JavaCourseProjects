package JavaCourseProjects.assignment2.ObjectInitialization;

class Student {
  private String name;
  private int rollNo;
  private int age;

  public Student() {
    name = "John Doe";
    rollNo = 1;
    age = 18;
  }

  public Student(String name, int rollNo, int age) {
    this.name = name;
    this.rollNo = rollNo;
    this.age = age;
  }

  public static Student createStudent(String name, int rollNo, int age) {
    return new Student(name, rollNo, age);
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
    System.out.println("Age: " + age);
  }

  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student("Jane Doe", 2, 19);
    Student student3 = Student.createStudent("Alice Doe", 3, 20);

    student1.display();
    student2.display();
    student3.display();
  }
}
