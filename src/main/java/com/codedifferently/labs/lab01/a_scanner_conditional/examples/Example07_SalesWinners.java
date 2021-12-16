package com.codedifferently.labs.lab01.a_scanner_conditional.examples;

import java.util.Scanner;

public class Example07_SalesWinners {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many memberships did you sell?");
        int sales = in.nextInt();
        switch (sales){
            case 6:
                System.out.println("You win $1000");
            case 5:
                System.out.println("You win a Iphone");
            case 4:
                System.out.println("You win a Laptop");
            case 3:
                System.out.println("You win a gift card");
            case 2:
                System.out.println("You win a sandwich");
            case 1:
                System.out.println("You win some gum ");
                break;
            default:
                System.out.println("work harder");
        }
    }
}
