// Base class representing a bank account
class BankAccount {
    private String accountHolder;
    private double balance; // Private: Cannot be accessed directly
    protected String accountType; // Protected: Accessible by subclasses
    public String accountNumber; // Public: Accessible everywhere

    // Constructor to initialize account details
    public BankAccount(String accountHolder, String accountNumber, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Public method to view balance (Customers can only view)
    public void viewBalance() {
        System.out.println(accountHolder + "'s Balance: $" + balance);
    }

    // Protected method to update account type (Employees can modify)
    protected void updateAccountType(String newType) {
        this.accountType = newType;
        System.out.println("Account type updated to: " + accountType);
    }

    // Private method to update balance (Only Admin can use)
    private void updateBalance(double newBalance) {
        this.balance = newBalance;
        System.out.println("Balance updated successfully.");
    }

    // Public method to deposit money (Customers can add money)
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
            viewBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method accessible to Admin to update balance
    public void adminUpdateBalance(double newBalance) {
        updateBalance(newBalance);
    }
}

// Employee subclass (Can modify account type but not balance)
class Employee extends BankAccount {
    public Employee(String accountHolder, String accountNumber, double balance, String accountType) {
        super(accountHolder, accountNumber, balance, accountType);
    }

    // Employee-specific method to change account type
    public void changeAccountType(String newType) {
        updateAccountType(newType);
    }
}

// Admin subclass (Can modify balance and account type)
class Admin extends BankAccount {
    public Admin(String accountHolder, String accountNumber, double balance, String accountType) {
        super(accountHolder, accountNumber, balance, accountType);
    }

    // Admin-specific method to modify balance
    public void modifyBalance(BankAccount account, double newBalance) {
        account.adminUpdateBalance(newBalance);
    }
}

// Main class to test functionality
public class BankingSystem {
    public static void main(String[] args) {
        // Customer account
        BankAccount customer = new BankAccount("Alice", "123456", 1000.0, "Savings");
        System.out.println("Customer Actions:");
        customer.viewBalance();
        customer.deposit(500);

        // Employee updating account type
        Employee employee = new Employee("Alice", "123456", 1000.0, "Savings");
        System.out.println("\nEmployee Actions:");
        employee.changeAccountType("Checking");

        // Admin modifying balance
        Admin admin = new Admin("Admin", "000001", 0, "Admin");
        System.out.println("\nAdmin Actions:");
        admin.modifyBalance(customer, 5000.0);
        customer.viewBalance();
    }
}
