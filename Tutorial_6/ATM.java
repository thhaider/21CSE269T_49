import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0;
        
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }
            
            balance -= amount;
            System.out.println("Transaction successful! New balance: $" + balance);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
            scanner.close();
        }
    }
}
