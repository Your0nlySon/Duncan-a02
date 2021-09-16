package exercise07.base;

    /*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
     */

import java.util.Scanner;

public class Solution07 {

    /*
    print: What is the length of the room in feet?
    'lengthFt': reads string from user
    print: What is the width of the room in feet?
    'widthFt': reads string from user
    Convert lengthFT(lFt) and widthFt(wFt) to int
    'areaFT' = lFt * wFt
    print: You entered dimensions of 'lFt' feet by 'wFt' feet. The area is \n 'areaFt'
    'areaM' = 0.9290304 * areaFT
    print: 'areaM' square meters
     */

    public static void main(String[] args) {

        System.out.println("What is the length of the room in feet? ");
        Scanner input = new Scanner(System.in);
        String lengthFT = input.nextLine();
        int lFT = Integer.parseInt(lengthFT);

        System.out.println("What is the width of the room in feet? ");
        Scanner input2 = new Scanner(System.in);
        String widthFT = input2.nextLine();
        int wFT = Integer.parseInt(widthFT);

        int areaFT = lFT * wFT;
        System.out.println("You entered dimensions of " + lFT + " feet by " + wFT + " feet. The area is \n" + areaFT + " square feet");

        double areaM = 0.09290304 * areaFT;
        System.out.format("%.3f", areaM);
        System.out.println(String.format(" square meters",areaM));
    }
}
