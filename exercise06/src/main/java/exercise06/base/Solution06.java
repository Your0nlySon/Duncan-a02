package exercise06.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
     */

    import java.util.Calendar;
    import java.util.Scanner;

public class Solution06 {

    /*
    print: What is your current age?
    'currentAge': reads string from user
    'print: At what age would you like to retire?
    'retireAge': reads string from user
    Convert currentAge(cA) and retireAge(rA) to int
    'yearsLeft': Subtract cA from rA
    print: You have 'yearsLeft' until you can retire
    get current Year
    'retireYear': currentYear + yearsLeft
    print: It's [CurrentYear], so you can retire in 'retireYear'.
     */

public static void main(String[] args) {

        System.out.println("What is your current age? ");
        Scanner input = new Scanner(System.in);
        String currentAge = input.nextLine();
        int cA = Integer.parseInt(currentAge);

        System.out.println("At what age would you like to retire");
        Scanner input2 = new Scanner(System.in);
        String retireAge = input2.nextLine();
        int rA = Integer.parseInt(retireAge);

        int yearsLeft = rA - cA;
        System.out.println("You have " + yearsLeft + " until you can retire.");

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = currentYear + yearsLeft;
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear + ".");
    }
}
