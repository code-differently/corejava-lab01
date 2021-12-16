package com.codedifferently.labs.lab01.a_scanner_conditional.examples;

import java.util.Scanner;

public class Example01_Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Enter a number:");
        int answer = input.nextInt();
        System.out.println(name + ", the number you entered is: " + answer);
    } // closes main method
}// closes class
