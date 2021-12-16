package com.codedifferently.labs.lab01.a_scanner_conditional.examples;

import java.util.Scanner;

public class Example09_LeapYearCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = in.nextInt();
        System.out.println("Enter the year");
        int year = in.nextInt();
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month has 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month has 31 days");
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
                    System.out.println("That month has 29 days");
                else
                    System.out.println("That month has 28 days");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
