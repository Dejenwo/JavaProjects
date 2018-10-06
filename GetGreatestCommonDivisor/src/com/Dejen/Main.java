package com.Dejen;

public class Main {

    public static void main(String[] args) {
	     getGreatestCommonDivisor(25,15);
	     getGreatestCommonDivisor(12,30);
	     getGreatestCommonDivisor(9,18);
	     getGreatestCommonDivisor(81,153);
    }

    public static int getGreatestCommonDivisor( int first, int second ) {

        int gcd = 1;
        if (first < 10 || second < 10 ) {
            return -1;
        }

        for ( int i = 1 ; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0)

               gcd = i;
        }
         return gcd;
    }
}
