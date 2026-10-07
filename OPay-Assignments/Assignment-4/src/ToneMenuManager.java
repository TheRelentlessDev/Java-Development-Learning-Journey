import java.util.Scanner;

public class ToneMenuManager {
    static void showTonesMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Ringing Tone");
            System.out.println("2. Ringing Volume");
            System.out.println("3. Incoming call Alert");
            System.out.println("4. Composer");
            System.out.println("5. Message Alert Tone");
            System.out.println("6. Keypad Tones");
            System.out.println("7. Warning and Game Tones");
            System.out.println("8. Vibrating Alert");
            System.out.println("9. Screen Saver");
            System.out.println("10. Back ");
            System.out.print("Enter Option: ");
            while(!scanner.hasNextInt()){
                System.out.print("Invalid input Enter Number:");
                scanner.next();
            }
            int subMenu6 = scanner.nextInt();
            scanner.nextLine();
            if(subMenu6 <=0) {
                System.out.print("Invalid Input Enter a number in the list: ");
                continue;
            }
            if (subMenu6 == 1) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 2) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 3) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 4) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 5) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 6) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 7) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 8) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 9) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu6 == 10) {
                break;
            }
        }
    }
}
