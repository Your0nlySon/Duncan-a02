package exercise08.base;

    /*
    UCF COP3330 Fall 2021 Assignment 1 Solution
    Copyright 2021 first_name last_name
    */

import java.net.SecureCacheResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution08 {

    /*
    print: How many people?
    'amtPeople': read the string from the user
    print: How many pizzas do you have?
    'amtPizza': read the string from the user
    print: How many slices are per pizza?
    'pizzaSlices': read the string from the user
    'totalSlices' = amtPizza * pizzaSlices
    Convert amtPeople(people), amtPizza(pizza), pizzaSlices(slices) to integers
    print: 'people' people with 'pizza' ('totalSlices')
    'averageSlices' = totalSlices / people (Use remainder)
    print: Each person gets 'averageSlices' pieces of pizza
    print: There are 'leftOver' leftover pieces
     */

    public static void main(String[] args) {

        System.out.println("How many people will be eating pizza? ");
        Scanner input = new Scanner(System.in);
        String amtPeople = input.nextLine();
        int people = Integer.parseInt(amtPeople);

        System.out.println("How many pizzas do you have? ");
        Scanner input2 = new Scanner(System.in);
        String amtPizza = input2.nextLine();
        int pizza = Integer.parseInt(amtPizza);

        System.out.println("How many slices are per pizza? ");
        Scanner input3 = new Scanner(System.in);
        String pizzaSlices = input3.nextLine();
        int slices = Integer.parseInt(pizzaSlices);

        int totalSlices = pizza * slices;
        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");

        int averageSlices = totalSlices / people;
        int leftOvers = totalSlices % people;
        System.out.println("Each person gets " + averageSlices + " pieces of pizza");
        System.out.println("There are " + leftOvers + " leftover pieces");
    }
}
