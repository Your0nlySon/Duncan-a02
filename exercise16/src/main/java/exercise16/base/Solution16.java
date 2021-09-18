package exercise16.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution16 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your age? ");
        String userAge = in.nextLine();
        int age = Integer.parseInt(userAge);
        String result = (age >= 16)
                ? "You are old enough to legally drive.\n"
                : "You are not old enough to legally drive.\n";
        System.out.println(result);
    }
}
