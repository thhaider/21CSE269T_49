class Employee {
    String name;
    double salary;

    // Constructor to initialize Employee
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double incentive;

    // Constructor using super() to call parent constructor
    Manager(String name, double salary, double incentive) {
        super(name, salary); // Calling parent class constructor
        this.incentive = incentive;
    }

    // Method to display Manager details
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling parent method
        System.out.println("Incentive: " + incentive);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    // Constructor using super() to call parent constructor
    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Calling parent class constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Method to display Developer details
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling parent method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating Manager object
        Manager manager = new Manager("Alice", 80000, 10000);
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println();

        // Creating Developer object
        Developer developer = new Developer("Bob", 60000, "Java");
        System.out.println("Developer Details:");
        developer.displayDetails();
    }
}

