package exercise14.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution14 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution14 app = new Solution14();

        //Create and call methods one to ask for price and one to figure out location and final price
        double priceOfItem = app.readPriceOfItemFromUser();
        double placeOfPurchase = app.readPlaceFromUser(priceOfItem);

    }

    private Double readPlaceFromUser(double pOI) {
        //Ask for what state from user
        System.out.println("What is the state? ");
        String stateName = in.nextLine();
        //Create variables for finalPrice and taxedAmt
        double finalPrice;
        double taxedAmt;

        //if statement to create output and math for Wisconsin location
        if (stateName.equals("WI")) {
            taxedAmt = pOI * 0.055;
            finalPrice = Math.ceil((pOI + taxedAmt)*100.0)/100.0;
            System.out.println("The subtotal is: $" + pOI + "\nThe tax is: $" + taxedAmt + "\nThe total is $" + finalPrice);
            return finalPrice;
        }

        //return the total from non Wisconsin
        System.out.println("The total is $" + pOI);
        return pOI;
    }

    //Get user input for the price of the item
    private double readPriceOfItemFromUser() {
        System.out.println("What is the order amount? ");
        double price = Double.parseDouble(in.nextLine());
        return price;
    }

}
