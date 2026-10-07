import java.util.Scanner;

public class Runway {
	public static void main (String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter speed in m/s: ");

	double v = scanner.nextDouble();
	
	System.out.print("Enter acceleration in m/s2: ");
	double a = scanner.nextDouble();
	
	double length = (v*v)/(2*a);

	System.out.println("The minimum runway length for this airplane is " + length);
	




	}

}

