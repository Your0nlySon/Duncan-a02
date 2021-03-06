package exercise11.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class Solution11 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution11 app = new Solution11();

        //Create methods for amtEuros, exchangeRate, and amtUSD
        int amtEuros = app.readAmountEurosFromUser();
        double exchangeRate = app.readExchangeRateFromUser();
        double amtUSD = app.calculateTheAmtOfUSD(amtEuros, exchangeRate);

        //Print the final statement
        System.out.println(amtEuros + " euros at an exchange rate of " + exchangeRate + " is " + amtUSD + " U.S. Dollars.");
    }

    private double calculateTheAmtOfUSD(int eurosTraded, double rate) {
        //Conversion rate = eurosTraded * rate and round up the cent to the penny
        double conversionRate = eurosTraded * rate;
        double cR = Math.ceil(conversionRate*100.0)/100.0;
        return cR;
    }

    private double readExchangeRateFromUser() {
        //Get user input for the rate of exchange
        System.out.println("What is the exchange rate? ");
        double rate = Double.parseDouble(in.nextLine());
        return rate;
    }

    private int readAmountEurosFromUser() {
        //Get the amount of euros from the user
        System.out.println("How many euros are you exchanging? ");
        int euros = Integer.parseInt(in.nextLine());
        return euros;
    }

}
