package exercise15.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution15 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution15 app = new Solution15();
        //This is the string that will be compared to for validate
        String correctPassword = "abc$123";

        //Call and create methods for calling user and pass and validating the password
        String userAndPassword = app.readUserPassFromUser();
        String validatePassword = app.validatePassword(correctPassword, userAndPassword);
    }

    private String validatePassword(String cP, String uP) {
        //checks if the correctPassword is equal to the userPassword
        if(cP.equals(uP)) {
            System.out.println("Welcome!");
        }
        //if it isn't equal it tells you that it is wrong
        else {
            System.out.println("I don't know you.");
        }
        return uP;
    }

    private String readUserPassFromUser() {
        //reads user for the username
        System.out.println("Enter Username: ");
        in.nextLine();

        //reads user input for the password
        System.out.println("Enter Password: ");
        String userPass = in.nextLine();

        return userPass;
    }

}
