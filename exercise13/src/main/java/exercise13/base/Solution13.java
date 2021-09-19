package exercise13.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution13 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution13 app = new Solution13();

        //create and call methods called principle, rateOfInterest, numYears, compoundYears, and calcInvestment
        double principal = app.readPrincipleFromUser();
        double rateOfInterest = app.readROTFromUser();
        int numYears = app.readNumberOfYearsFromUser();
        int compoundYears = app.readCompoundYearsFromUser();

        double calcInvestment = app.calculateTheTotalInvestment(principal, rateOfInterest, numYears, compoundYears);

        System.out.println("$" + principal + " invested at " + rateOfInterest + "% for " + numYears + "years compounded " + compoundYears + " times per year is $" + calcInvestment);
    }

    private int readCompoundYearsFromUser() {
        //Read input from user for Compound Years
        System.out.println("What is the number of times the interest is compounded per year? ");
        int c = Integer.parseInt(in.nextLine());
        return c;
    }

    private double calculateTheTotalInvestment(double p, double rOI, int nY, int cY) {
        //calculate totalInvest = A = P(1 + r/n)^(n*t)
        double totalInvest = (p * Math.pow(1 + ((rOI / 100) / cY), (cY * nY)));
        double tI = Math.ceil(totalInvest*100.0)/100.0;
        return tI;
    }

    private int readNumberOfYearsFromUser() {
        //Read input from user for Number of Years
        System.out.println("Enter the number of years: ");
        int y = Integer.parseInt(in.nextLine());
        return y;
    }

    private double readROTFromUser() {
        //Read input from user for Rate of interest
        System.out.println("Enter the rate of interest: ");
        double r = Double.parseDouble(in.nextLine());
        return r;
    }

    private double readPrincipleFromUser() {
        //Read input from user for Principle
        System.out.println("Enter the principle: ");
        double p = Double.parseDouble(in.nextLine());
        return p;
    }

}
