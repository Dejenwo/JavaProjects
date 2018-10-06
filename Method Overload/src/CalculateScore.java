public class CalculateScore {

    public static void main(String[] args) {

        int newScore = calculateScore("Dejen", 500);
        System.out.println(" The New Score " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int Score){

        System.out.println(" player " +  playerName  + " Score " +  Score + " Points.");
        return Score * 1000;
    }

    public static int calculateScore(int Score){

        System.out.println(" Unnamed player Score " +  Score + " Points.");
        return Score * 1000;
    }

    public static int calculateScore(){

        System.out.println(" No player Name, No player score");
        return 0;
    }
}
