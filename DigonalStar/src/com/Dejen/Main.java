package com.Dejen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(4);
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");

        }else{
            // i = rows.
            for(int i = 1; i <= number; i++){

                // j = columns.
                for(int j = 1; j <= number; j++){

                    // (j == 1) = Left side of square.
                    // (i == 1) = Top side of square.
                    // (j == number) = Right side of square.
                    // (i == number) = Bottom side of square.
                    if((j == 1) || (i == 1) || (j == number) || (i == number)){

                        System.out.print("*");


                        // (i == j) = Diagonal line from top left to bottom right.
                    }else if(i == j){
                        System.out.print("*");

                        // (i == (number - j + 1)) = Diagonal line from top right to bottom left.
                    }else if(i == (number - j + 1)) {
                        System.out.print("*");

                        // Spaces.
                    }else{
                        System.out.print(" ");

                    }
                }
                // Next line.
                System.out.println();
            }
        }
    }


}
