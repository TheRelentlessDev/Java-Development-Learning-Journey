import java.util.Scanner;

public class InputValidation {
    static int getValidatedInput(Scanner scanner, int min, int max){
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid Character ---- Enter a number on the list :");
                scanner.next();
            }
            int value = scanner.nextInt();
            scanner.nextLine();

            if (value >= min && value <= max){
                return value;
            } else {
                System.out.print("Invalid Input --- Enter a number between " + min + " and " + max +": ");
            }
        }
    }

}
