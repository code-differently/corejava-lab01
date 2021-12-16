package com.codedifferently.labs.lab01.a_scanner_conditional.examples;

import java.util.Scanner;

public class Example10_TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please say Hello or Goodbye");
        String inputGreeting = in.next();
        String hello = "Hello";
        String answer = hello.equals(inputGreeting) ? "Hey Friend": "Bye Friend";
        System.out.println(answer);
    }
}
