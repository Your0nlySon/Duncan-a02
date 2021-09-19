package exercise17.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution17 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution17 app = new Solution17();

        //Create and call methods for Sex, Ounces, Weight, HourSince, and Calc
        int userSex = app.readUserSexFromUser();
        int ouncesOfAlc = app.readOuncesOfAlcFromUser();
        int userWeight = app.readWeightFromUser();
        int hourLast = app.readHoursSinceLastDrinkFromUser();

        double calcBAC = app.calcBAC(userSex, ouncesOfAlc, userWeight,hourLast);

    }

    private double calcBAC(int uS, int oAC, int uW, int hL) {
        Double BAC;

        //Calculates the BAC for a male
        if (uS == 1) {
            BAC = ((oAC * 5.14 / uW * 0.73) - .015 * hL);
            System.out.println("Your BAC is " + BAC);
        }
        //Calculates the BAC for a female
        else {
            BAC = ((oAC * 5.14 / uW * 0.66) - .015 * hL);
            System.out.println("Your BAC is " + BAC);
        }
        //States whether or not you can drive
        if (BAC < 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else {
            System.out.println("It is not legal for you to drive.");
        }
        return BAC;
    }

    private int readHoursSinceLastDrinkFromUser() {
        String hours;
        boolean isHours = false;

        //Uses a do loop to make sure that a value returned can only be a numerical value
        do {
            System.out.println("How many hours has it been since your last drink? ");
            hours = in.nextLine();
            if (hours.matches("[0-9]+")) {
                isHours = true;
                int hourSince = Integer.parseInt(hours);
                return hourSince;
            }
            System.out.println("Your input was invalid");
        } while (!isHours);

        int t = 0;
        return t;
    }

    private int readWeightFromUser() {
       String weight;
       boolean isWeight = false;

       //Uses a do loop to make sure that a value returned can only be a numerical value
       do {
           System.out.println("What is your weight, in pounds? ");
           weight = in.nextLine();
           if (weight.matches("[0-9]+")) {
               isWeight = true;
               int lbs = Integer.parseInt(weight);
               return lbs;
           }
           System.out.println("Your input was invalid");
       } while (!isWeight);

        int t = 0;
        return t;
    }

    private int readOuncesOfAlcFromUser() {
        String number;
        boolean isNum = false;

        //Uses a do loop to make sure that a value returned can only be a numerical value
        do {
            System.out.println("How many ounces of alcohol did you have? ");
            number = in.nextLine();
            if (number.matches("[0-9]+")) {
                isNum = true;
                int oun = Integer.parseInt(number);
                return oun;
            }
            System.out.println("Your input was invalid");
        } while (!isNum);

        int t = 0;
        return t;
    }

    private int readUserSexFromUser() {

        //creates an array that fills only with 1 and 2
        Set<String> validInputs = new HashSet<>();
        validInputs.addAll(Arrays.asList("1", "2"));

        boolean isValid = false;
        String input;
        int t = 0;
        //Uses a do loop to figure out if 1 or 2 are the only values returned
        do {
            System.out.println("Enter a 1 is you are male or a 2 if you are female: ");
            input = in.nextLine();

            if (validInputs.contains(input)) {
                isValid = true;
                int sex = Integer.parseInt(input);
                return sex;
            }
            System.out.println("Your input was invalid!");
        } while (!isValid);
        return t;
    }
}
