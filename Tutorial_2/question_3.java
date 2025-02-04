class Main {
    public static void main(String[] args) {
        // Personal Loan Calculation
        LoanCalculator.calculateLoan(5000, 5.5);

        // Home Loan Calculation
        LoanCalculator.calculateLoan(100000, 6.5, 15);

        // Car Loan Calculation
        LoanCalculator.calculateLoan(30000, 7.0, 5, 500);
    }
}

class LoanCalculator {
    // Personal Loan (principal and interest rate)
    public static void calculateLoan(double principal, double interestRate) {
        double interest = principal * (interestRate / 100);
        System.out.println("Personal Loan Interest: $" + interest);
    }

    // Home Loan (principal, interest rate, and tenure)
    public static void calculateLoan(double principal, double interestRate, int tenure) {
        double interest = principal * (interestRate / 100) * tenure;
        System.out.println("Home Loan Interest for " + tenure + " years: $" + interest);
    }

    // Car Loan (principal, interest rate, tenure, and processing fee)
    public static void calculateLoan(double principal, double interestRate, int tenure, double processingFee) {
        double interest = principal * (interestRate / 100) * tenure;
        double totalAmount = principal + interest + processingFee;
        System.out.println("Car Loan Total Payment (including processing fee): $" + totalAmount);
    }
}
