package JavaCourseProjects.assignment2.Interest;

// Superclass
class Bank {
  // Method to calculate interest
  double getInterestRate() {
    return 0.0;
  }

  // Method to display interest rate
  void displayInterestRate() {
    System.out.println("Interest Rate: " + getInterestRate() + "%");
  }
}

// Subclass for BankA
class BankA extends Bank {
  // Overriding the getInterestRate method
  @Override
  double getInterestRate() {
    return 5.0;
  }
}

// Subclass for BankB
class BankB extends Bank {
  // Overriding the getInterestRate method
  @Override
  double getInterestRate() {
    return 6.5;
  }
}

// Subclass for BankC
class BankC extends Bank {
  // Overriding the getInterestRate method
  @Override
  double getInterestRate() {
    return 7.2;
  }
}

public class BankInterest {
  public static void main(String[] args) {
    // Create instances of each bank
    Bank bankA = new BankA();
    Bank bankB = new BankB();
    Bank bankC = new BankC();

    // Display interest rates for each bank
    System.out.println("Bank A:");
    bankA.displayInterestRate();

    System.out.println("Bank B:");
    bankB.displayInterestRate();

    System.out.println("Bank C:");
    bankC.displayInterestRate();
  }
}