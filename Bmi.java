import java.util.Scanner;

public class Bmi {
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter weight in pounds: ");
	double pounds = scanner.nextDouble();

	System.out.print("Enter height in inches: ");
	double inches = scanner.nextDouble();

	double kg = pounds * 0.45359237;
	double m= inches * 0.0254;

	double bmi = (kg)/((m*m));

	System.out.print("The BMI = " + bmi);


	}

}