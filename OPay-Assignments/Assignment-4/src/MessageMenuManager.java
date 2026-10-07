import java.util.Scanner;

public class MessageMenuManager {
    static void showMessageMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1. Write Messages ");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
            System.out.println("4. Picture Messages");
            System.out.println("5. Templates");
            System.out.println("6. Smileys");
            System.out.println("7. Message Settings");
            System.out.println("8. Info Service");
            System.out.println("9. Voice Mail Number");
            System.out.println("10. Service Command Editor");
            System.out.println("11. Back");
            System.out.print("Enter Option: ");
            while(!scanner.hasNextInt()){
                System.out.print("Invalid input Enter Number:");
                scanner.next();
            }
            int subMenu2 = scanner.nextInt();
            scanner.nextLine();
            if(subMenu2 <=0) {
                System.out.print("Invalid Input Enter a number in the list: ");
                continue;
            }
            if (subMenu2 == 1) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 2) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 3) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 4) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 5) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 6) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 7) {
                while (true) {
                    System.out.println("1. Set 1");
                    System.out.println("2. Common ");
                    System.out.println("3. Back ");
                    System.out.print("Enter Option: ");
                    while(!scanner.hasNextInt()){
                        System.out.print("Invalid input Enter Number:");
                        scanner.next();
                    }
                    int innerSubMenu2 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubMenu2<=0) {
                        System.out.print("Invalid Input Enter a number in the list: ");
                        continue;
                    }
                    if (innerSubMenu2 == 1) {
                        while (true) {
                            System.out.println("1. Message Center Number");
                            System.out.println("2. Messages Sent As");
                            System.out.println("3. Message Validity");
                            System.out.println("4. Back ");
                            System.out.print("Enter Option: ");
                            while(!scanner.hasNextInt()){
                                System.out.print("Invalid input Enter Number:");
                                scanner.next();
                            }
                            int innerSubMenu2Option1 = scanner.nextInt();
                            scanner.nextLine();
                            if(innerSubMenu2Option1 <=0) {
                                System.out.print("Invalid Input Enter a number in the list: ");
                                continue;
                            }
                            if (innerSubMenu2Option1 == 1) {
                                System.out.println("Feature Coming Soon!!! ");
                            }
                            if (innerSubMenu2Option1 == 2) {
                                System.out.println("Feature Coming Soon!!! ");
                            }
                            if (innerSubMenu2Option1 == 3) {
                                System.out.println("Feature Coming Soon!!! ");
                            }
                            if (innerSubMenu2Option1 == 4) {
                                break;
                            }
                        }

                    }
                    if (innerSubMenu2 == 2) {
                        while (true) {
                            System.out.println("1. Delivery Report");
                            System.out.println("2. Reply Via Same Center");
                            System.out.println("3. Character Support");
                            System.out.println("4. Back ");
                            System.out.print("Enter Option: ");
                            while(!scanner.hasNextInt()){
                                System.out.print("Invalid input Enter Number:");
                                scanner.next();
                            }
                            int innerSubMenu2Option2 = scanner.nextInt();
                            scanner.nextLine();
                            if(innerSubMenu2Option2 <=0) {
                                System.out.print("Invalid Input Enter a number in the list: ");
                                continue;
                            }
                            if (innerSubMenu2Option2 == 1) {
                                System.out.println("Feature Coming Soon!!! ");
                            }
                            if (innerSubMenu2Option2 == 2) {
                                System.out.println("Feature Coming Soon!!! ");
                            }
                            if (innerSubMenu2Option2 == 3) {
                                System.out.println("Feature Coming Soon!!! ");
                            }
                            if (innerSubMenu2Option2 == 4) {
                                break;
                            }
                        }
                    }
                    if (innerSubMenu2 == 3) {
                        break;
                    }
                }
            }
            if (subMenu2 == 8) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 9) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 9) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 10) {
                System.out.println("Feature Coming Soon!!! ");
            }
            if (subMenu2 == 11) {
                break;
            }
        }
    }
}
