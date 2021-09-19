package exercise19.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution19 {
    //Create method and call userWeight
    //Create method and call userHeight
    //Create method and call calcBMI

    //userWeight and userHeight
    //create a do loop to ask for user input
    //within the do loop make sure there is an if statement that will see if the value inputted is a numerical value
    //if not send it through the loop again

    //userCalcBMI
    //'BMI' = bmi = (weight / (height × height)) * 703
    //If statement to see if BMI is within the ideal range

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution19 app = new Solution19();

        int userWeight = app.readUserWeightFromUser();
        int userHeight = app.readUserHeightFromUser();

        double calcBMI = app.calcBMI(userHeight, userWeight);
    }

    private double calcBMI(int uH, int uW) {
        double BMI = (uW / (uH * uW)) * 703;
        System.out.println("Your BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (BMI > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else {
            System.out.println("You are within the ideal weight range.\n");
        }
        return BMI;
    }

    private int readUserHeightFromUser() {
        String height;
        boolean isHeight = false;

        do {
            System.out.println("How much do you weigh? ");
            height = in.nextLine();
            if (height.matches("[0-9]+")) {
                isHeight = true;
                int hourSince = Integer.parseInt(height);
                return hourSince;
            }
            System.out.println("Your input was invalid");
        } while (!isHeight);

        int t = 0;
        return t;
    }

    private int readUserWeightFromUser() {
        String weight;
        boolean isWeight = false;

        do {
            System.out.println("How how tall are you? ");
            weight = in.nextLine();
            if (weight.matches("[0-9]+")) {
                isWeight = true;
                int hourSince = Integer.parseInt(weight);
                return hourSince;
            }
            System.out.println("Your input was invalid");
        } while (!isWeight);

        int t = 0;
        return t;
    }
}
