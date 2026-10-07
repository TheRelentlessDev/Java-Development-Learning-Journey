import java.util.Scanner;

public class MainMenuManager {

    static void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOKIA MAIN MENU");
        System.out.println("1. Phonebook");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call Register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM Services");
        System.out.println("14. Quit/Exit");
        System.out.print("Enter Option: ");
        int mainMenu = InputValidation.getValidatedInput(scanner,1,14);

    }
}


