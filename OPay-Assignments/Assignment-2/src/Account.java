public class Account {

    private String name;
    private int age;
    private double accountBalance;


    public Account(String name, int age, double accountBalance) {
        this.name = name;
        this.age = age;
        this.accountBalance = accountBalance;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAccountBalance() {
        return accountBalance;
    }


    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        accountBalance += depositAmount;
        System.out.println("Deposit successful!");
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }
        if (withdrawAmount > accountBalance) {
            System.out.println("Insufficient balance!");
            return;
        }
        accountBalance -= withdrawAmount;
        System.out.println("Withdrawal successful!");
    }
}