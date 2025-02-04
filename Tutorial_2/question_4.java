class Main {
    public static void main(String[] args) {
        int a = 15, b = 4;
        boolean x = true, y = false;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("AND (&&): " + (x && y));
        System.out.println("OR (||): " + (x || y));
        System.out.println("NOT (!x): " + (!x));

        // 4. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("AND (&): " + (a & b));
        System.out.println("OR (|): " + (a | b));
        System.out.println("XOR (^): " + (a ^ b));
        System.out.println("Complement (~a): " + (~a));
        System.out.println("Left Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);

        // 6. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("Post-increment (d++): " + (d++)); // Displays 5, then increments to 6
        System.out.println("After post-increment: " + d);
        System.out.println("Pre-increment (++d): " + (++d));  // Increments to 7, then displays 7
        System.out.println("Post-decrement (d--): " + (d--)); // Displays 7, then decrements to 6
        System.out.println("After post-decrement: " + d);

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Maximum of a and b: " + max);
    }
}
