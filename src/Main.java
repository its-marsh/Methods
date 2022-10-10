public class Main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Felix",calculateHighScorePosition(1500));
        displayHighScorePosition("Vicky",calculateHighScorePosition(900));
        displayHighScorePosition("Taylor",calculateHighScorePosition(400));
        displayHighScorePosition("Matt",calculateHighScorePosition(50));
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore; // have to return some value, outside if-statement
        }
        return -1; // -1 is invalid value by convention
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    } //return type void can be called a procedure

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        }
        return 4;
    } //methods may also be called a function
}