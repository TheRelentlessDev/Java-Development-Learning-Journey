import java.util.Random;
import java.util.Scanner;
public class RandomNumber{
    public static void main(String[] args) {
        int number;
        int count = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number origin: ");
        int origin = scanner.nextInt();
        System.out.print("Enter number bound: ");
        int bound = scanner.nextInt();
        System.out.print("Enter Target Number: ");
        int targetNumber = scanner.nextInt();
        System.out.print("Enter the number of iterations: ");
        int iteration = scanner.nextInt();

        for(int i = 1; i <= iteration; i++) {
             number = random.nextInt(origin,bound);
            if (number == targetNumber) {
                count++;
                System.out.println("Target number = " + number);
            } else {
                System.out.println(number);
            }
        }
        if (count == 1) {
            System.out.println(targetNumber + " Appeared Once " );
        }else {
            System.out.println(targetNumber + " Appeared " + count + " Times");
        }
    }
}




