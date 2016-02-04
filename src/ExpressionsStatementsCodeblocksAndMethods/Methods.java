package ExpressionsStatementsCodeblocksAndMethods;

/**
 * Created by MichalK on 12/28/2015.
 */
public class Methods {
    public static void main(String[] args) {

        int score = 10000;
        int levCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        int highScore = calculateScore(score, levCompleted, bonus, gameOver);
        System.out.println("Newer final score is " + highScore);
        System.out.println("You are here now ");

//        to use variable again, I dont need to create ones, just to reuse them and change the values, which is completely valid like

        score = 120;
        levCompleted = 5;
        bonus = 700;

//          dosadim tam bud to priamo hodnoty pre dane dataType alebo rovno premennu ktorej viem priradovat potom ine hodnoty rovnako
        highScore = calculateScore(score, levCompleted, bonus, gameOver);
        System.out.println("Newer final score is " + highScore);
        System.out.println("You are here now for second time");

//CHALLENGE  --------------------------------------------
        System.out.println("-----------------------------------------");
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("petr", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("petr", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("petr", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("petr", highScorePosition);


        System.out.println("-----------------------------------------");
//CHALLENGE  -----------------------------------------------






    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Player " + name + " managed to get to " + position + ". position on High Score table. Congrats!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore >= 500) {
            return 2;
        } else if (playerScore < 500 && playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }


    public static int calculateScore(int score, int levCompleted, int bonus, boolean gameOver) {
        int finalScore = score + (levCompleted * bonus);
        if (gameOver) {
            return finalScore;
        } else {
            return -1;
        }

    }


}