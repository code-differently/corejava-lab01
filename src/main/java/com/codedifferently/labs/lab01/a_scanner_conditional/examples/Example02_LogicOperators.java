package com.codedifferently.labs.lab01.a_scanner_conditional.examples;

public class Example02_LogicOperators {

    public static void main(String[] args) {
        int numberDaysAbsent = 0;
        int grade = 99;
        boolean madeHonorRoll = grade >= 88;
        if(madeHonorRoll && numberDaysAbsent ==0)
            System.out.println("You qualify for the scholarship.");
    }
}
