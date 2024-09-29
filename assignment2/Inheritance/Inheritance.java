package JavaCourseProjects.assignment2.Inheritance;

// Single Inheritance
class Animal {
  void eat() {
    System.out.println("Animal is eating");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Dog is barking");
  }
}

// Multilevel Inheritance
class Puppy extends Dog {
  void weep() {
    System.out.println("Puppy is weeping");
  }
}

// Hierarchical Inheritance
class Cat extends Animal {
  void meow() {
    System.out.println("Cat is meowing");
  }
}

// Multiple Inheritance using Interfaces
interface CanFly {
  void fly();
}

interface CanSwim {
  void swim();
}

class Duck extends Animal implements CanFly, CanSwim {
  @Override
  public void fly() {
    System.out.println("Duck is flying");
  }

  @Override
  public void swim() {
    System.out.println("Duck is swimming");
  }
}

// Hybrid Inheritance
interface CanRun {
  void run();
}

class SuperAnimal extends Animal implements CanFly, CanSwim, CanRun {
  @Override
  public void fly() {
    System.out.println("SuperAnimal is flying");
  }

  @Override
  public void swim() {
    System.out.println("SuperAnimal is swimming");
  }

  @Override
  public void run() {
    System.out.println("SuperAnimal is running");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    // Single Inheritance
    Dog dog = new Dog();
    dog.eat();
    dog.bark();

    // Multilevel Inheritance
    Puppy puppy = new Puppy();
    puppy.eat();
    puppy.bark();
    puppy.weep();

    // Hierarchical Inheritance
    Cat cat = new Cat();
    cat.eat();
    cat.meow();

    // Multiple Inheritance using Interfaces
    Duck duck = new Duck();
    duck.eat();
    duck.fly();
    duck.swim();

    // Hybrid Inheritance
    SuperAnimal superAnimal = new SuperAnimal();
    superAnimal.eat();
    superAnimal.fly();
    superAnimal.swim();
    superAnimal.run();
  }
}