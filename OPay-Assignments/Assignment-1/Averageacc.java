import java.util.Scanner;
public class Averageacc {
	public static void main (String[] args){
	
	System.out.print("Enter initial velocity in m/s: ");
	Scanner scanner = new Scanner (System.in);
	double initialVelocity = scanner.nextDouble();

	System.out.print("Enter final velocity m/s: ");
	double finalVelocity = scanner.nextDouble();
	
	System.out.print("Enter time taken in secs: ");
	double time = scanner.nextDouble();

	double averageAcceleration = ((finalVelocity - initialVelocity)/(time));
	
	System.out.println("The Average Acceleration is = " + averageAcceleration);
	

	
		

	}
}