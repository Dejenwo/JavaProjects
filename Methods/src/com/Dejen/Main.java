package com.Dejen;

public class Main {
    public static void main(String[] args) {
    	boolean gameOver = true;
    	int score = 1000;
    	int levelCompleted = 50;
    	int bonus = 100;
    	calculateScore(gameOver,score,levelCompleted,bonus);

    	score = 10000;
    	levelCompleted = 100;
    	bonus = 200;
    	calculateScore(gameOver,score,levelCompleted,bonus);
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted,int bonus){

		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=2000;
			System.out.println("The final Score was " + finalScore);
			return finalScore;
		}
        return -1;
	}

}
