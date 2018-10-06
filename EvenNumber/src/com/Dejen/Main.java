package com.Dejen;

public class Main {

    public static void main(String[] args) {
	// write your code here
      //  ;isEvenNumber(100);
      //  isEvenNumber(73);
      //  isEvenNumber(45);
     //   isEvenNumber(32);
        int number = 4;
        int endNumber = 20;
        int evenNumberFound = 0;
        while (number <= endNumber) {
               number++;
               if (!isEvenNumber(number)) {
                   continue;
               }
            System.out.println("The even numbers between 4 and 20 = " + number);
            evenNumberFound++;
            if (evenNumberFound == 5)    {
                break;
            }

        }
        System.out.println("Total Number of even number is " + evenNumberFound);
    }

    public static boolean isEvenNumber( int number) {
        if (number % 2 == 0 ) {
            return true;
        } else {
            return false;
        }

    }
}
