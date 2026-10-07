import java.util.Scanner;

public class PhonebookMenuManager {
    static void ShowPhonebookMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("PHONEBOOK MENU ");
            System.out.println("1. Search");
            System.out.println("2. Service Nos");
            System.out.println("3. Add Name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign Tone");
            System.out.println("7. Send b'card");
            System.out.println("8. Options");
            System.out.println("9. Speed Dials");
            System.out.println("10. Voice Tags");
            System.out.println("11. Back");
            System.out.print("Enter Option: ");
            int phoneBookMenu = InputValidation.getValidatedInput(scanner,1,11);
            if (phoneBookMenu == 1){
                System.out.println("Feature Coming Soon!!!");
            }
            if (phoneBookMenu == 2) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu == 3) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu == 4) {
                System.out.println("Feature Coming Soon!!!");
            }
            if (phoneBookMenu == 5) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu == 6) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu == 7) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu == 8) {
                while (true) {
                    System.out.println("1. Type of View ");
                    System.out.println("2. Memory Status ");
                    System.out.println("3. Back");
                    System.out.print("Enter Option: ");
                    while(!scanner.hasNextInt()){
                        System.out.print("Invalid input Enter Number:");
                        scanner.next();
                    }
                    int innerphoneBookMenu = scanner.nextInt();
                    scanner.nextLine();
                    if(innerphoneBookMenu<=0) {
                        System.out.print("Invalid Input Enter a number in the list: ");
                        continue;
                    }
                    if (innerphoneBookMenu == 1) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerphoneBookMenu == 2) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if(innerphoneBookMenu==3){
                        break;
                    }
                }
            }
            if (phoneBookMenu == 9) {
                System.out.print("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu == 10) {
                System.out.print("Feature Coming Soon!!! ");
            }
            if (phoneBookMenu==11){
                break;
            }
        }
    }



}
