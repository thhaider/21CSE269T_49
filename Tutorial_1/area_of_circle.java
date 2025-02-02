// comutes area of a circle 
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		float radius = scanner.nextFloat();
		float area = (float) (Math.PI * radius * radius);
		System.out.printf("The area of the circle is: %.2f", area);
	}
}
