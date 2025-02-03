public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        addNumbers(num1, num2); // Calling the method without a return value
    }
    // Method to add two numbers without a return type
    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
