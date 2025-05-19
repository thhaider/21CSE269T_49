//Constructor Overloading with "this" in Employee class
class Employee {
    int empId;
    String name;
    double salary;
    String department;

    // Constructor 1
    Employee(int empId) {
        this.empId = empId;
        this.name = "Not Assigned";
        this.salary = 0;
        this.department = "Not Assigned";
    }

    // Constructor 2
    Employee(int empId, String name) {
        this(empId); // chaining
        this.name = name;
    }

    // Constructor 3
    Employee(int empId, String name, double salary, String department) {
        this(empId, name); // chaining
        this.salary = salary;
        this.department = department;
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID        : " + empId);
        System.out.println("Name      : " + name);
        System.out.println("Salary    : " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102, "Ravi");
        Employee e3 = new Employee(103, "Kiran", 50000, "IT");

        e1.display();
        e2.display();
        e3.display();
    }
}
