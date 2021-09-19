package exercise20.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution20 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution20 app = new Solution20();

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
        if (stateName.equals("Wisconsin")) {
            System.out.println("What county do you live in? ");
            String countyName = in.nextLine();
            //if statement to create output and math for Wisconsin
            if(countyName.equals("Eau Claire")) {
                taxedAmt = 0.055;
            }
            else if (countyName.equals("Dunn")) {
                taxedAmt = 0.054;
            }
            else {
                taxedAmt = 0.05;
            }
            System.out.println("The tax is $" + taxedAmt);

            finalPrice = Math.ceil((pOI + taxedAmt)*100.0)/100.0;
            System.out.println("The total is $" + finalPrice);

            return finalPrice;
        }

        //else if statement to get the tax for Illinois
        else if (stateName.equals("Illinois")) {
            taxedAmt = 0.08;
            System.out.println("The tax is $" + taxedAmt);

            finalPrice = Math.ceil((pOI + taxedAmt)*100.0)/100.0;
            System.out.println("The total is $" + finalPrice);

            return finalPrice;
        }

        //return the total from non Wisconsin and Illinois
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