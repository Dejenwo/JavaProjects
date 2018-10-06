package com.Dejen;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);

    }

    public static void printMegaBytesAndKiloBytes(int KiloBytes) {

        int YY = KiloBytes / 1024;
        int ZZ = KiloBytes % 1024;

        if  (KiloBytes < 0 ){
            System.out.println("Invalid Value");

        }
        else {

            System.out.println("2050 KB = " + YY + " MB" + " AND " + ZZ + " KB");
        }




    }
}
