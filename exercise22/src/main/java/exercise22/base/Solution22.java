package exercise22.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution22 {

    //Create method and call firstNum, secondNum, and thirdNum
    //Read input from user and return value for all three methods
    //Have the numbers compare to each other through the use of if and else if statements
    //Print the biggest number

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Solution22 app = new Solution22();

        int firstNum = app.readFirstNumFromUser();
        int secondNum = app.readSecondNumFromUser();
        int thirdNum = app.readThirdNumFromUser();

        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                System.out.println(firstNum);
            }
            else {
                System.out.println(thirdNum);
            }
        }
        else if (firstNum < secondNum) {
            if (secondNum > thirdNum) {
                System.out.println(secondNum);
            }
            else {
                System.out.println(thirdNum);
            }
        }
    }

    private int readThirdNumFromUser() {
        System.out.println("What is your third number? ");
        int tN = Integer.parseInt(in.nextLine());
        return tN;
    }

    private int readSecondNumFromUser() {
        System.out.println("What is your second number? ");
        int sN = Integer.parseInt(in.nextLine());
        return sN;
    }

    private int readFirstNumFromUser() {
        System.out.println("What is your first number? ");
        int fN = Integer.parseInt(in.nextLine());
        return fN;
    }

}
