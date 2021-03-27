package Methods;

public class Main {
    public static void main(String[] args) {
       calculateScore(true,800, 5, 100);

    calculateScore(true,1000,8, 200);

    numberLottery("Jack hopper",65 );

    number(6);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void numberLottery(String participantName, int numberGuess ) {

        if (numberGuess == 67) {
            System.out.println(participantName + "You've won the grand prize of 100K");
        }

        else if (numberGuess > 30 && numberGuess < 50) {
            System.out.println(participantName + "You've won a 50 4K TV");
        }

        else if (numberGuess > 50 && numberGuess < 60) {
            System.out.println(participantName + "You've won a tropical cruise for 2");
        }

        else if (numberGuess  > 60 && numberGuess < 67) {
            System.out.println(participantName + "You've won a new Ford Mach-E");
        }

        else {
            System.out.println("Better luck next time" + participantName);
        }

    }
    public static int calculateGuestTier(int score) {
        int value;
        if (score >= 1000) {
            value = 1;
        } else if (score >= 500 && score < 1000) {
            value = 2;
        } else if (score >= 100 && score < 500) {
            value = 3;
        } else {
            value = 4;
        }
        return value;
    }

    public static void number (int number ) {
        if (number > 0)
            System.out.println("positive");
        else if (number < 0)
            System.out.println("negative");
        else if (number == 0)
            System.out.println("zero");

    }

    public static int tempConvertor(int number, String values ) {
        if (number < 0){
            return -1;
        }

        if (String )


    }
}
