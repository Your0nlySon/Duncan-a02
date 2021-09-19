package exercise21.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution21 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //print a statement to ask for month
        System.out.println("Please enter the number of the month: ");
        //user input called userMonth
        String userMonth = in.nextLine();
        int month = Integer.parseInt(userMonth);
        String monthString;

        //switch statement for month
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        //prints the final statement
        System.out.println(monthString);
    }
}
