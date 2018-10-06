package com.Dejen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int YearOfBirth = scanner.nextInt();
            scanner.nextLine();
            int age = 2018 - YearOfBirth;


            System.out.println("Enter Your Name: ");
            String name = scanner.nextLine();

            if ( age>= 0 && age <= 120 ) {
                System.out.println("Your Name is " + name + " " +
                        "and you are " + age + " years of old");
            } else
            {
                System.out.println("Invalid Age Entry");
            }
        } else {

            System.out.println("Unable to parse year of birth");
        }

    }
}
