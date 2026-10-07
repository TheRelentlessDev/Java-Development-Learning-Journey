import java.util.Scanner;


public class SettingsMenuManager {
 static void showSettingsMenu() {
     while (true) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("1. Call Settings");
         System.out.println("2. Phone Settings");
         System.out.println("3. Security Settings");
         System.out.println("4. Restore Factory Settings");
         System.out.println("5. Back");
         System.out.print("Enter Option: ");
         while (!scanner.hasNextInt()) {
             System.out.print("Invalid input Enter Number:");
             scanner.next();
         }
         int subMenu7 = scanner.nextInt();
         scanner.nextLine();
         if (subMenu7 <= 0) {
             System.out.print("Invalid Input Enter a number in the list: ");
             continue;
         }
         if (subMenu7 == 1) {
             while (true) {
                 System.out.println("1. Automatic Redial");
                 System.out.println("2. Speed Dialling");
                 System.out.println("3. Call Waiting Options");
                 System.out.println("4. Own Number Sending ");
                 System.out.println("5. Phone Line in use");
                 System.out.println("6. Automatic Answer");
                 System.out.println("7. Back");
                 System.out.print("Enter Option: ");
                 while (!scanner.hasNextInt()) {
                     System.out.print("Invalid input Enter Number:");
                     scanner.next();
                 }
                 int innerSubMenu6 = scanner.nextInt();
                 scanner.nextLine();
                 if (innerSubMenu6 <= 0) {
                     System.out.print("Invalid Input Enter a number in the list: ");
                     continue;
                 }
                 if (innerSubMenu6 == 1) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu6 == 2) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu6 == 3) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu6 == 4) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu6 == 5) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu6 == 6) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu6 == 7) {
                     break;
                 }
             }
         }
         if (subMenu7 == 2) {
             while (true) {
                 System.out.println("1. Language");
                 System.out.println("2. Cell Info Display");
                 System.out.println("3. Welcome Note");
                 System.out.println("4. Network Selection");
                 System.out.println("5. Lights");
                 System.out.println("6. Confirm SIM Notification Settings");
                 System.out.println("7. Back");
                 System.out.print("Enter Option: ");
                 while (!scanner.hasNextInt()) {
                     System.out.print("Invalid input Enter Number:");
                     scanner.next();
                 }
                 int innerSubMenu7 = scanner.nextInt();
                 scanner.nextLine();
                 if (innerSubMenu7 <= 0) {
                     System.out.print("Invalid Input Enter a number in the list: ");
                     continue;
                 }
                 if (innerSubMenu7 == 1) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu7 == 2) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu7 == 3) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu7 == 4) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu7 == 5) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu7 == 6) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu7 == 7) {
                     break;
                 }
             }
         }
         if (subMenu7 == 3) {
             while (true) {
                 System.out.println("1. Pin Code Request");
                 System.out.println("2. Call Barring Service");
                 System.out.println("3. Fixed Dialling");
                 System.out.println("4. Closed User Group");
                 System.out.println("5. Phone Security");
                 System.out.println("6. Change Access Codes");
                 System.out.println("7. Back");
                 System.out.print("Enter Option: ");
                 while (!scanner.hasNextInt()) {
                     System.out.print("Invalid input Enter Number:");
                     scanner.next();
                 }
                 int innerSubMenu8 = scanner.nextInt();
                 scanner.nextLine();
                 if (innerSubMenu8 <= 0) {
                     System.out.print("Invalid Input Enter a number in the list: ");
                     continue;
                 }
                 if (innerSubMenu8 == 1) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu8 == 2) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu8 == 3) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu8 == 4) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu8 == 5) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu8 == 6) {
                     System.out.println("Feature Coming Soon!!! ");
                 }
                 if (innerSubMenu8 == 7) {
                     break;
                 }
             }
         }
         if (subMenu7 == 4) {
             System.out.println("Feature Coming Soon!!! ");
         }
         if (subMenu7 == 5) {
             break;
         }
     }
 }
}
