package com.codedifferently.labs.lab01.a_scanner_conditional.activities;

import java.util.Scanner;

public class Activity_A05_SwitchCalculator {
    //Todo: Rewrite the code in Example04_Calculator to use a switch statement
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        System.out.println("Enter a number:");
        int num1 = in.nextInt();
        System.out.println("Enter another number:");
        int num2 = in.nextInt();
        System.out.println("Enter the operand:");
        char input = in.next().charAt(0);
        if(input == '*')
            answer = num1 * num2;
        else if (input == '/')
            answer = num1 / num2;
        else if (input == '%')
            answer = num1 % num2;
        else if (input == '+')
            answer = num1 + num2;
        else
            System.out.println("Invalid Command");
        System.out.println("The result is: " + answer);
    }
}
