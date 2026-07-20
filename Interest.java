import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your balance: ");
		double balance = scanner.nextDouble();

		System.out.print("Enter Interest rate ( i.e 5 for 5%): ");
		double annualInterestRate = scanner.nextDouble();
		
		double interest = balance * (annualInterestRate/1200);
		
		System.out.print("The calculated interest is = " + interest);
		

}

}