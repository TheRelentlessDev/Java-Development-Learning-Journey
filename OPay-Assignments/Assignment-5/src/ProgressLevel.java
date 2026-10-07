public class ProgressLevel {
    static void showProgressLevel( int countCorrectAns,int countWrongAns){
        int correctAnsPercentage = ((countCorrectAns * 100) / 10);
        int wrongAnsPercentage = ((countWrongAns * 100) / 10);

        if(correctAnsPercentage >= 75){
            System.out.println("Congratulations, you are ready to go to the next level! ");

        }else if(wrongAnsPercentage < 75) {
            System.out.println(" Please ask your teacher for extra help!");
        }

    }
}
