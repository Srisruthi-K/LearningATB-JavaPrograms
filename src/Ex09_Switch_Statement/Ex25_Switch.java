package Ex09_Switch_Statement;

import java.util.Scanner;


public class Ex25_Switch {

    // You need to take a user input and ask for the integer from 1 to 7.
    // And if user enters 1 to 7,
    // you will tell which day it is.
    // Logic Building Formula

// Step 1 - Number one is using the Scanner class.
// Step 2 number two will be basically figuring out the expression and the day.
// Step 3- We will basically add step 3 as a rough logic.
// Step 4 - 4 is you will write the fix the logic and optimize.
// Step 5 - figure out the edge cases.

public static void main(String [] args){

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number from 1 to 7 ");
    if(sc.hasNextInt())
    {

        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("The entered number is 1");
                break;
            case 2:
                System.out.println("The entered number is 2");
                break;
            case 3:
                System.out.println("The entered number is 3");
                break;
            case 4:
                System.out.println("The entered number is 4");
                break;
            case 5:
                System.out.println("The entered number is 5");
                break;
            case 6:
                System.out.println("The entered number is 6");
                break;
            case 7:
                System.out.println("The entered number is 7");
                break;
            default:
                System.out.println("Enter the correct number between 1 to 7");
        }

    }
    else{
        System.out.println("Enter the integer value between 1 to 7");
    }

}}
