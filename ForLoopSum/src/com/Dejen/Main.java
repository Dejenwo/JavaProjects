package com.Dejen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        int sum = 0;

        for (int i= 1; i <= 1000; i++) {
            if ((i % 3 == 0 ) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found the number = " + i);

            }
            if (count == 10) {
                break;
            }
        }

        System.out.println("The sum of five numbers = " + sum);
    }
}
