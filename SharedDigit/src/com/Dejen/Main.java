package com.Dejen;

public class Main {

    public static void main(String[] args) {
	  hasSharedDigit(12,23);
	  hasSharedDigit(9,99);
	  hasSharedDigit(15,55);


    }

    public static boolean hasSharedDigit( int x,int y) {
        int a = x % 10;
        int b = x / 10;
        int c = y % 10;
        int d = y / 10;

        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;


        } else if ( a == c  || b==d ||  a == d || b == c){

            return true;


        } else if (( a != c  || b !=d ||  a != d || b != c)) {
            return false ;

        }
         return false;

    }
}
