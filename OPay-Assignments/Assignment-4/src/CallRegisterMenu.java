import java.util.Scanner;
public class CallRegisterMenu {
    static void showCallRegisterMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Missed Calls ");
            System.out.println("2. Received Calls ");
            System.out.println("3. Dialed Numbers ");
            System.out.println("4. Erase Recent Call List");
            System.out.println("5. Show Call Duration");
            System.out.println("6. Show Call Costs");
            System.out.println("7. Call Cost Settings");
            System.out.println("8. Prepaid Credit");
            System.out.println("9. Back ");
            System.out.print("Enter Option: ");
            int registerMenu = InputValidation.getValidatedInput(scanner,1,14);
            if (registerMenu == 1) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (registerMenu == 2) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (registerMenu == 3) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (registerMenu == 4) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (registerMenu == 5) {
                while(true) {
                    System.out.println("1. Last Call Duration");
                    System.out.println("2. All Call's Duration");
                    System.out.println("3. Received Call's Duration");
                    System.out.println("4. Dialled Call's Duration");
                    System.out.println("5. Clear Timers");
                    System.out.println("6. Back ");
                    System.out.print("Enter Option: ");
                    while(!scanner.hasNextInt()){
                        System.out.print("Invalid input Enter Number:");
                        scanner.next();
                    }
                    int innerRegisterMenu = scanner.nextInt();
                    scanner.nextLine();
                    if(innerRegisterMenu <=0) {
                        System.out.print("Invalid Input Enter a number in the list: ");
                        continue;
                    }
                    if (innerRegisterMenu == 1) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerRegisterMenu == 2) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerRegisterMenu == 3) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerRegisterMenu == 4) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerRegisterMenu == 5) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerRegisterMenu == 6) {
                        break;
                    }
                }
            }
            if (registerMenu == 6) {
                while(true) {
                    System.out.println("1. Last Call Cost");
                    System.out.println("2. All Calls Cost");
                    System.out.println("3. Clear Counters");
                    System.out.println("4. Back");
                    System.out.print("Enter Option: ");
                    while(!scanner.hasNextInt()){
                        System.out.print("Invalid input Enter Number:");
                        scanner.next();
                    }
                    int innerSubMenu4 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubMenu4 <=0) {
                        System.out.print("Invalid Input Enter a number in the list: ");
                        continue;
                    }
                    if (innerSubMenu4 == 1) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerSubMenu4 == 2) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerSubMenu4 == 3) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerSubMenu4 == 4) {
                        break;
                    }
                }
            }
            if (registerMenu == 7) {
                while(true) {
                    System.out.println("1. Call Cost Limit");
                    System.out.println("2. Show Cost In");
                    System.out.println("3. Back ");
                    System.out.print("Enter Option:");
                    while(!scanner.hasNextInt()){
                        System.out.print("Invalid input Enter Number:");
                        scanner.next();
                    }
                    int innerSubMenu5 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubMenu5 <=0) {
                        System.out.print("Invalid Input Enter a number in the list: ");
                        continue;
                    }
                    if (innerSubMenu5 == 1) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerSubMenu5 == 2) {
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if (innerSubMenu5 == 3) {
                        break;
                    }
                }
            }
            if (registerMenu == 8) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (registerMenu == 9) {
                break;
            }
        }
    }
}
