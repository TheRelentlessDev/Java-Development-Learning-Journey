import java.util.Scanner;

public class InputValidation {

    static int originValidation(Scanner scanner){
        while (true)    {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid Character!!! Value must be a positive integer:");
                scanner.nextLine();
            }

            int origin = scanner.nextInt();
            scanner.nextLine();

            if(origin > 0 ){
                return origin;
            } else {
                System.out.print("Invalid Input!!! Value must be greater than Zero: " );
            }

        }
    }
    static int boundValidation(Scanner scanner){
        while(true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid Character!!! Value must be a positive integer:");
                scanner.nextLine();
            }

            int bound = scanner.nextInt();
            scanner.nextLine();


            if(bound > 0){
                return bound;
            }else {
                System.out.print("Invalid Input!!! Value must be greater than Zero: " );
            }

        }
    }
    static int answerValidation(Scanner scanner){
        while(true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid Character!!! Value must be a positive integer: ");
                scanner.nextLine();
            }

            int value = scanner.nextInt();
            scanner.nextLine();
            if(value > 0){
                return value;
            }
            if(value < 0){
                {
                    System.out.print("Invalid Input!!! Value must be greater than Zero: " );
                }
            }
            if(value == 0){
                return value;
            }

        }
    }
}
