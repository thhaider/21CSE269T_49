import java.util.Scanner;

public class DrivingLicenseSystem {
    
    public static void checkEligibility(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Error: Applicant must be at least 18 years old to register.");
        }
        System.out.println("Registration successful! You are eligible for a driving license.");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid age.");
        } finally {
            System.out.println("Application process completed.");
            scanner.close();
        }
    }
}

