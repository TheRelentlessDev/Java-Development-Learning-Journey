import java.util.Scanner;

public class Geometry {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter x1: ");
	double x1 = scanner.nextDouble();
	
	System.out.print("Enter y1: ");
	double y1 = scanner.nextDouble();
	
	System.out.print("Enter x2: ");
	double x2 = scanner.nextDouble();

	System.out.print("Enter y2: ");
	double y2 = scanner.nextDouble();
	
	System.out.print("Enter x3: ");
	double x3 = scanner.nextDouble();

	System.out.print("Enter y3: ");
	double y3 = scanner.nextDouble();

	double side1 = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
	double side2 = Math.sqrt(((x3-x2)*(x3-x2)) + ((y3-y2)*(y3-y2)));
	double side3 = Math.sqrt(((x3-x1)*(x3-x1)) + ((y3-y1)*(y3-y1)));

	double s = (side1 + side2 + side3)/2;

	double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
	
	System.out.print("The area of the triangle = " + area);







	

	}
}