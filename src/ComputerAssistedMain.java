import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedMain{
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         Random random = new Random();

         ProgramOutputs.showPrintOut();

         System.out.print("Enter the smallest number you want (origin): ");
         int initialInterval = InputValidation.originValidation(scanner);

         System.out.print("Enter the number just above the largest number you want (bound): ");
         int finalInterval = InputValidation.boundValidation(scanner);

         while(true){
            int entryCount = 0;
            int countCorrectAns = 0;
            int countWrongAns = 0;

            int num1 = random.nextInt(initialInterval, finalInterval);
            int num2 = random.nextInt(initialInterval,finalInterval);
            System.out.println("What is " + num1 + " times " + num2 + "? ");

            while(true) {
                int multiplication = num1 * num2;

                int randomAnswer = random.nextInt(1,5);
                System.out.print("Enter your answer: ");

                int answer = InputValidation.answerValidation(scanner);
                entryCount++;

                if(answer == 0) {
                    System.out.println("Session Over " +
                            "\n Thank You");
                    return;
                }

                if (answer == multiplication){
                    countCorrectAns++;
                    ProgramOutputs.correctAnswerResponses(randomAnswer);
                     num1 = random.nextInt(initialInterval, finalInterval);
                     num2 = random.nextInt(initialInterval,finalInterval);
                     System.out.println("What is " + num1 + " times " + num2 + "? ");


                }else {
                    countWrongAns++;
                    ProgramOutputs.wrongAnswerResponses(randomAnswer);
                    System.out.println("What is " + num1 + " times " + num2 + "? ");
                }

                if(entryCount == 10) {
                   ProgressLevel.showProgressLevel(countCorrectAns,countWrongAns);

                   entryCount = 0;
                   countCorrectAns=0;
                   countWrongAns=0;
                   break;
                }
            }

         }
    }
}

