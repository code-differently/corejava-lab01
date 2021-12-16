package com.codedifferently.labs.lab01.a_scanner_conditional.examples;

import java.util.Scanner;

public class Example06_StringChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        System.out.println("Enter your name:");
        name = in.next();
        if(name.equals("Wutang"))
            System.out.println("Best Group Ever");
        else if (name.equals("Kanye"))
            System.out.println("Might be crazy , butntalented");
        else
            System.out.println("You arent famous");
    }
}
