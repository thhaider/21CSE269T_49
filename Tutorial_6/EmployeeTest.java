// Abstract class Employee
abstract class Employee {
    protected String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public abstract double calculateSalary();
    
    public void displaySalary() {
        System.out.println("Employee: " + name + ", Salary: $" + calculateSalary());
    }
}

// Full-Time Employee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Part-Time Employee class
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;
    
    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// Main class to test the implementation
public class EmployeeTest {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 5000);
        Employee partTime = new PartTimeEmployee("Bob", 20, 80);
        
        fullTime.displaySalary();
        partTime.displaySalary();
    }
}
