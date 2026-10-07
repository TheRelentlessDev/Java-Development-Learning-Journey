import java.util.Scanner;

public class ClockMenuManager {
    static void showClockMenu(){
    Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Alarm Clock");
            System.out.println("2. Clock Settings");
            System.out.println("3. Date Settings");
            System.out.println("4. Stopwatch");
            System.out.println("5. Countdown Timer");
            System.out.println("6. Auto Update of Time and Date");
            System.out.println("7. Back");
            System.out.print("Enter Option: ");
            while(!scanner.hasNextInt()){
                System.out.print("Invalid input Enter Number:");
                scanner.next();
            }
            int phoneBookMenu1 = scanner.nextInt();
            scanner.nextLine();
            if(phoneBookMenu1 <=0) {
                System.out.print("Invalid Input Enter a number in the list: ");
                continue;
            }
            if (phoneBookMenu1 == 1) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu1 == 2) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu1 == 3) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu1 == 4) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu1 == 5) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu1 == 6) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu1 == 7) {
                break;
            }
        }
    }
}
