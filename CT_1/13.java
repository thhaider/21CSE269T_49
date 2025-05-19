// inner class in banking system to aprrove lone
class Bank {
    void displayBankDetails() {
        System.out.println("Bank Name: SBI");
        System.out.println("Location : Chennai");
    }

    class Loan {
        void approveLoan() {
            System.out.println("Loan Approved Successfully!");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank(); // Outer class object
        bank.displayBankDetails();

        Bank.Loan loan = bank.new Loan(); // Inner class object
        loan.approveLoan();
    }
}
