// Even palindrome check
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is not a Palindrome");
        scanner.close();
    }
}
