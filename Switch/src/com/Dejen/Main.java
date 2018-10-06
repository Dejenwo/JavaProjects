package com.Dejen;

public class Main {

    public static void main(String[] args) {
	 int switchValue = 1;
	 switch(switchValue){
         case 1:
             System.out.println("value was 1");
             break;
         case 2:
             System.out.println("value was 2");
             break;
         default:
             System.out.println("value was not 1 or 2");
             break;
     }

     char charValue = 'D';
	 switch(charValue) {
         case 'A':
             System.out.println("value was A");
             break;
         case 'B':
             System.out.println("value was B");
             break;
         case 'C': case 'D': case 'E':
             System.out.println(charValue + " was found");
             break;
         default:
             System.out.println("Letters not found");
             break;
     }

     String month = "Jan";
	 switch(month) {
         case "Jan":
             System.out.println("jan");
             break;
         case "June":
             System.out.println("June");

	     default:
             System.out.println("not found");
             break;
     }

    }
}
