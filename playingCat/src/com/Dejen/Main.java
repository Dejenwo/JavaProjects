package com.Dejen;

public class Main {

    public static void main(String[] args) {
	 isCatPlaying(true,10);
	 isCatPlaying(false,36);
	 isCatPlaying(false,35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer == true) && ((temperature >= 25 ) && (temperature <= 45))) {
            return true;

        }else if ((summer == false) && ((temperature > 35 ) && (temperature <= 35))){
            return true;
        }else {
            return false;
        }

    }
}
