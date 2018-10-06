package com.Dejen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sumOdd(100,100);

    }

    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 == 1 ) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end ) {

        if (start < 0 || end < 0 || start > end) {
            return -1;
        }
        int sum = 0;
        for (int i = start ; i <= end; i++ ) {
            if ( i % 2 != 0 ) {
                sum += i;
            }
        }


        return sum;

    }
}
