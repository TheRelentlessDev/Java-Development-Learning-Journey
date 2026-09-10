import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account myAccount = new Account("Jerome",17,7000);

        System.out.println("=== INITIAL ACCOUNT DETAILS ===");
        System.out.println("Customer name is: " + myAccount.getName());
        System.out.println("Customer age is: " + myAccount.getAge());
        System.out.println("Customer account balance is: " + myAccount.getAccountBalance());

        System.out.println("\n=== UPDATE ACCOUNT DETAILS ===");

        System.out.print("Please enter your name: ");
        String yourName = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Please deposit amount: ");
        double depAmount = scanner.nextDouble();

        myAccount.setName(yourName);
        myAccount.setAge(age);
        myAccount.deposit(depAmount);

        System.out.println("\n=== AFTER DEPOSIT ===");
        System.out.println("Customer name is: " + myAccount.getName());
        System.out.println("Customer age is: " + myAccount.getAge());
        System.out.println("Customer account balance is: " + myAccount.getAccountBalance());

        System.out.print("\nPlease enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);

        System.out.println("\n=== FINAL ACCOUNT DETAILS ===");
        System.out.println("Customer name is: " + myAccount.getName());
        System.out.println("Customer age is: " + myAccount.getAge());
        System.out.println("Customer account balance is: " + myAccount.getAccountBalance());

        scanner.close();
    }
}