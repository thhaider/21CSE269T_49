//Java program to reverse a string using both String and StringBuffer
import java.util.Scanner;

public class StringReverseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // 1. Reversing using String (manually)
        String reversedStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedStr += input.charAt(i);  // Inefficient for large strings
        }
        System.out.println("Reversed using String: " + reversedStr);

        // 2. Reversing using StringBuffer
        StringBuffer sb = new StringBuffer(input);
        System.out.println("Reversed using StringBuffer: " + sb.reverse());
    }
}
