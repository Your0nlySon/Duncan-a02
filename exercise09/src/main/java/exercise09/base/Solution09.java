package exercise09.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution09 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution09 app = new Solution09();

        int length = app.readLengthFromUser();
        int width = app.readWidthFromUser();
        double paintNeeded = app.readPainNeededFromUser(length,width);
        System.out.println("You need " + paintNeeded + " buckets of paint");
    }

    private int readWidthFromUser() {
        System.out.println("Enter value for width? ");
        return in.nextInt();
    }

    private int readLengthFromUser() {
        System.out.println("Enter value for length? ");
        return in.nextInt();
    }

    private double readPainNeededFromUser(int length, int width) {
        double areaOfCeiling = length * width;
        double amtOfPaint = 350;
        double bucketOfPaint = Math.ceil(areaOfCeiling / amtOfPaint);

        return bucketOfPaint;
    }
}
