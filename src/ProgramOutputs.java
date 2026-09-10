public class ProgramOutputs {
    static void showPrintOut(){
        System.out.println("""
                 Enter origin and bound\s
                 Origin is the first interval  value\s
                 Bound is the limit of the interval value
                 Example: if origin  is 1 and bound is 5\s
                 Then the multiplication will be from 1 - 4,\s
                 5 will not be included.\
               \s""");
        System.out.println("===Enter 0 as Answer to end program=== ");
    }
    static void correctAnswerResponses(int randomAnswer){
        switch(randomAnswer) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice Work!");
                break;
            case 4:
                System.out.println("keep up the good work!");
                break;
        }

    }
    static void wrongAnswerResponses(int randomAnswer){
        switch(randomAnswer) {
            case 1:
                System.out.println("No. Please try again!");
                break;
            case 2:
                System.out.println("Wrong. Try once more!");
                break;
            case 3:
                System.out.println("Dont give up!");
                break;
            case 4:
                System.out.println("No. keep trying!");
                break;
        }
    }

}
