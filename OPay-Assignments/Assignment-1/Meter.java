import java.util.Scanner;

public class Meter {
	public static void main (String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number in feet: ");

	double feet = scanner.nextDouble();
	
	double meter = feet * 0.305;

	System.out.println("The conversion to Meter = " + meter + "meters");
	




	}

}

