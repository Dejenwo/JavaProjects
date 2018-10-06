package com.Dejen;

public class Main {

    public static void main(String[] args) {
	   hasSameLastDigit(41,22,71);
	   hasSameLastDigit(23,32,42);
	   hasSameLastDigit(9,99,999);


    }

    public static boolean hasSameLastDigit(int x, int y, int z ) {

        int a = x % 10;
        int b = y % 10;
        int c = z % 10;


        if (x < 10 || x > 1000 ||
            y < 10 || x < 1000 ||
            z < 10 || z > 1000) {

            return false;

        } else if (a == b || a == c || b== c) {

            return true;

        }

        return false;
    }
}
