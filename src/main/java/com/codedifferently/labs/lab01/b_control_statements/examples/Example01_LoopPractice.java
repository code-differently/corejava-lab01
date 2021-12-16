package com.codedifferently.labs.lab01.b_control_statements.examples;

import java.util.Scanner;

public class Example01_LoopPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInputs = 0;
        int sum = 0;
        while(numInputs < 10){
            int input = in.nextInt();
            sum +=input;
            numInputs++;
        }
        System.out.println("The sum of those ten numbers is:" + sum);
    }
}
