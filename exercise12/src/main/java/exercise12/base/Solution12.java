package exercise12.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution12 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution12 app = new Solution12();

        //Create methods and principal, rateOfInterest, numYears, and calcInvestment
        double principal = app.readPrincipleFromUser();
        double rateOfInterest = app.readROTFromUser();
        int numYears = app.readNumberOfYearsFromUser();

        double calcInvestment = app.calculateTheTotalInvestment(principal, rateOfInterest, numYears);

        //print final statement
        System.out.println("After " + numYears + " years at " + rateOfInterest + "%, the investment will be worth $" + calcInvestment);
    }

    private double calculateTheTotalInvestment(double p, double rOI, int nY) {
        //create double called totalInvest = A = P(1 + rt) and then round up to the nearest penny
        double totalInvest = (p * (1 + ((rOI / 100) * nY)));
        double tI = Math.ceil(totalInvest*100.0)/100.0;
        return tI;
    }

    private int readNumberOfYearsFromUser() {
        //Read input for number of years
        System.out.println("Enter the number of years: ");
        int y = Integer.parseInt(in.nextLine());
        return y;
    }

    private double readROTFromUser() {
        //Read the input for the rate of interest
        System.out.println("Enter the rate of interest: ");
        double r = Double.parseDouble(in.nextLine());
        return r;
    }

    private double readPrincipleFromUser() {
        //Read the input from the user on the principle
        System.out.println("Enter the principle: ");
        double p = Double.parseDouble(in.nextLine());
        return p;
    }

}
