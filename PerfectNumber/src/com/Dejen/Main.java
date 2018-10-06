package com.Dejen;

public class Main {

    public static void main(String[] args) {
      isPerfectNumber(6);
      isPerfectNumber(28);
      isPerfectNumber(-1);
      isPerfectNumber(5);

    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }

        return number == sum;
    }
}
