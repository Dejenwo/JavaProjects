package com.Dejen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(-5);
        sumFirstAndLastDigit(10);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        for (int i = number; i > 0; i /= 10) {
            if (i < 10) {
                firstDigit = i;
            }
        }
        return firstDigit + lastDigit;
    }
}
