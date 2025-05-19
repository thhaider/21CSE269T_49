//Method Overloading – Area of Shapes
import java.util.Scanner;

class AreaCalculator {
    double calculateArea(double length, double breadth) {
        return length * breadth; // Rectangle
    }

    double calculateArea(double side) {
        return side * side; // Square
    }

    double calculateArea(float radius) {
        return 3.14 * radius * radius; // Circle
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calculateArea(l, b));

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        System.out.println("Area of Square: " + obj.calculateArea(s));

        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();
        System.out.println("Area of Circle: " + obj.calculateArea(r));
    }
}
