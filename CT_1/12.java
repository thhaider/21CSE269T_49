//Student grading system
import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter total subjects: ");
        int totalSubjects = sc.nextInt();

        System.out.print("Enter total marks: ");
        double totalMarks = sc.nextDouble();

        // Implicit conversion
        double percentage = (totalMarks / (totalSubjects * 100)) * 100;

        // Explicit conversion (rounding)
        int roundedPercentage = (int) percentage;

        // String conversion
        String percentageStr = String.valueOf(roundedPercentage);

        // Grade assignment
        char grade;
        if (roundedPercentage >= 90) grade = 'A';
        else if (roundedPercentage >= 75) grade = 'B';
        else if (roundedPercentage >= 60) grade = 'C';
        else if (roundedPercentage >= 40) grade = 'D';
        else grade = 'F';

        // Final output
        System.out.println("\n--- Student Report ---");
        System.out.println("Name       : " + name);
        System.out.println("Subjects   : " + totalSubjects);
        System.out.println("Percentage : " + percentageStr + "%");
        System.out.println("Grade      : " + grade);
    }
}
