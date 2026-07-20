import java.util.Scanner;

public class Energy {
	public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the amount of water in Kilograms: ");
	double m = scanner.nextDouble();
	
	System.out.print("Enter the initial temperature: ");
	double temp1 = scanner.nextDouble();
	
	System.out.print("Enter the final temperature: ");
	double temp2 = scanner.nextDouble();

	double q = m * (temp2 - temp1) * 4184;

	System.out.print("The energy needed is = " + q);


	}
}