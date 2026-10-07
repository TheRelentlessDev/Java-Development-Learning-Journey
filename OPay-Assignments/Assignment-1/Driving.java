import java.util.Scanner;

public class Driving {
	public static void main (String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the driving distance in miles: ");
	double distance = scanner.nextDouble();

	System.out.print("Enter miles per gallon: ");
	double miles = scanner.nextDouble();

	System.out.print("Enter feul price per gallon: ");
	double price = scanner.nextDouble();
		

	double costOfDriving =  (distance/miles) * price;

	System.out.println("The Cost of Driving = " + costOfDriving);
	



	}

}

