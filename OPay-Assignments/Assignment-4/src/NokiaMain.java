import java.util.Scanner;
public class NokiaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            MainMenuManager.showMainMenu();
            int mainMenu = InputValidation.getValidatedInput(scanner,1,14);

            if(mainMenu==1) {
                PhonebookMenuManager.ShowPhonebookMenu();
            }

            if(mainMenu == 2) {
               MessageMenuManager.showMessageMenu();
            }

            if(mainMenu ==3){
                System.out.println("Feature Coming Soon!!! ");
            }
            if(mainMenu ==4){
                CallRegisterMenu.showCallRegisterMenu();
            }
            if(mainMenu ==5){
                ToneMenuManager.showTonesMenu();
            }
            if(mainMenu ==6){
               SettingsMenuManager.showSettingsMenu();
            }
            if(mainMenu ==7){
                while(true) {
                    System.out.println("Feature Coming Soon!!! ");
                    System.out.println("0. Return to Main menu");
                    System.out.println("1. Stop Program");
                    int callDivert = InputValidation.getValidatedInput(scanner,0,1);
                    if(callDivert == 0){
                        MainMenuManager.showMainMenu();
                    }
                    if (callDivert == 1) {
                        return;
                    }
                }
            }
            if(mainMenu ==8){
                System.out.println("Feature Coming Soon!!! ");
            }
            if(mainMenu ==9){
                System.out.println("Feature Coming Soon!!! ");
            }
            if(mainMenu ==10){
                System.out.println("Feature Coming Soon!!! ");
            }
            if(mainMenu == 11){
                ClockMenuManager.showClockMenu();
            }
            if(mainMenu ==12){
                System.out.println("Feature Coming Soon!!! ");
            }
            if(mainMenu ==13){
                System.out.println("Feature Coming Soon!!! ");
            }
            if(mainMenu ==14){
                break;
            }
        }
    }






}