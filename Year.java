import java.util.Scanner;

public class Year{
	public static void main (String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter time in minutes: ");

	int m = scanner.nextInt();
		
	int y = (m/525600);
	int d = (m % 525600); 
	int dd = (d/1440);

	System.out.println(m + " minutes is approximately " + y + " " + "years" + " " + "and" + " " + dd + " days");
	




	}

}

