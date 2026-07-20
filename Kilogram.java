import java.util.Scanner;

public class Kilogram {
	public static void main (String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number in Pounds: ");

	double pounds = scanner.nextDouble();
	
	double kilogram = pounds * 0.454;

	System.out.println("The conversion to Kilogram = " + kilogram);
	




	}

}

