import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4]; 

        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
