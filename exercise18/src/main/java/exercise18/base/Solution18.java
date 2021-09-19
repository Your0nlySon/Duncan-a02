package exercise18.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution18 {
    //Call and create methods, read user input, calc method
    //create an array with inputs that will be allowed
    //make a do loop to ask for input and if input is not correct make the do the input again
    //return the string from method
    //calc create and if statement and use the formualas below to decide either C or F
    //F = (C × 9 / 5) + 32 or C = (F − 32) × 5 / 9
    //return value

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution18 app = new Solution18();

        String userConversion = app.readStringAboutTempFromUser();
        Double calcOfConversion = app.calcOfConversionOfTemperature(userConversion);
    }

    private Double calcOfConversionOfTemperature(String uC) {
        if (uC.equals("C")) {
            System.out.println("Enter Fahrenheit: ");
            int f = Integer.parseInt(in.nextLine());
            double celsius = (f - 32) * 5 / 9;
            System.out.println("Your temperature in Celsius is " + celsius);
            return celsius;
        }
        else {
            System.out.println("Enter Celsius: ");
            int c = Integer.parseInt(in.nextLine());
            double fahrenheit = (c * 9 / 5) + 32;
            System.out.println("Your temperature in Fahrenheit is " + fahrenheit);
            return fahrenheit;
        }
    }

    private String readStringAboutTempFromUser() {
        Set<String> validInputs = new HashSet<>();
        validInputs.addAll(Arrays.asList("c", "C", "f", "F"));

        boolean isValid = false;
        String input;

        do {
            System.out.println("Do you want to convert temperature to celsius [C] or fahrenheit [F]: ");
            input = in.nextLine();

            if (validInputs.contains(input)) {
                isValid = true;
                return input;
            }
            System.out.println("Your input was invalid!");
        } while (!isValid);
        return input;
    }

}
