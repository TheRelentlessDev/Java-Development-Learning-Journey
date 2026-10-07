import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for( int i= num; i>= 1 ; i--){
            factorial = factorial * i;

        }
        System.out.print("Factorial of " +num + " is = " + factorial);

    }
}
