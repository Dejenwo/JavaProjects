package com.Dejen;

public class Main {

    public static void main(String[] args) {
	 canpack(1,0,4);
	 canpack(1,0,5);
	 canpack(0,5,4);
	 canpack(2,12,12);
	 canpack(-3,2,12);
    }

    public static boolean canpack (int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        for ( int i = 1 ; i <= bigCount; i++ ) {
            for ( int j = 1 ; j <= smallCount ; j++) {
                if (goal == i * 5 + j)
                    return true;

            }
        }
         return false;
    }
}
