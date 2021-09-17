package exercise10.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
    */

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {

   private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution10 app = new Solution10();

        //Call all the methods for finding user input
        int priceOne = app.readPriceFromUser();
        int quantityOne = app.readQuantityFromUser();
        int priceTwo = app.readPrice2FromUser();
        int quantityTwo = app.readyQuantity2FromUser();
        int priceThree = app.readPrice3FromUser();
        int quantityThree = app.readQuantity3FromUser();

        //call the subtotal method and print its statement
        double subtotal = app.calculateTheSubtotal(priceOne,quantityOne,priceTwo,quantityTwo, priceThree, quantityThree);
        System.out.println("Subtotal: $" + subtotal);
        //call the ta method and print its statement
        double taxAmount = app.calculateTheTaxedAmt(subtotal);
        System.out.println("Tax: $" + taxAmount);
        //call the total method and print its statement
        double total = app.addTheTaxAndTheySubtotal(taxAmount, subtotal);
        System.out.println("Total: $" + total);
    }

    private double addTheTaxAndTheySubtotal(double tA,double sT) {
        //create total variable make it equal to tA + sT
        double total = tA + sT;
        return total;
    }

    private double calculateTheTaxedAmt(double subtotal) {
        //create 'taxAmt' = subtotal *.055
        //make it a double with a format of two decimal places
        double taxAmt = subtotal * .055;
        new DecimalFormat("#.##").format(taxAmt);
        return taxAmt;
    }

    private double calculateTheSubtotal(int p1,int q1, int p2, int q2, int p3, int q3) {
        //create 'st' = multiply the price and the quantity then add each one together
        //make it a double with a format of two decimal places
        int st = ((p1 * q1) + (p2 * q2) + (p3 * q3));
        new DecimalFormat("#.##").format(st);
        return st;
    }

    private int readQuantity3FromUser() {
        //print quantity statement then return the user input
        System.out.println("Enter the quantity of Item 2: ");
        int quantity3 = Integer.parseInt(in.nextLine());
        return quantity3;
    }

    private int readPrice3FromUser() {
        //print price statement then return the user input
        System.out.println("Enter the price of item 2: ");;
        int price3 = Integer.parseInt(in.nextLine());
        return price3;
    }

    private int readyQuantity2FromUser() {
        //print quantity statement then return the user input
        System.out.println("Enter the quantity of Item 2: ");
        int quantity2 = Integer.parseInt(in.nextLine());
        return quantity2;
    }

    private int readPrice2FromUser() {
        //print price statement then return the user input
        System.out.println("Enter the price of item 2: ");;
        int price2 = Integer.parseInt(in.nextLine());
        return price2;
    }

    private int readQuantityFromUser() {
        //print quantity statement then return the user input
        System.out.println("Enter the quantity of Item 1: ");
        int quantity1 = Integer.parseInt(in.nextLine());
        return quantity1;
    }

    private int readPriceFromUser() {
        //print price statement then return the user input
        System.out.println("Enter the price of item 1: ");;
        int price1 = Integer.parseInt(in.nextLine());
        return price1;
    }
}
