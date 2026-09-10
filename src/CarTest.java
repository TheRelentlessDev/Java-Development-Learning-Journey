import java.util.Scanner;
public class CarTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Car Make: ");
        String make = scanner.nextLine();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter production Year: ");
        int year = scanner.nextInt();
        Car myCar = new Car(make,model ,year);

        System.out.println("Make: " + myCar.getMake() );
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " +myCar.getYear());


    }
}
