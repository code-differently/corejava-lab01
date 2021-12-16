package com.codedifferently.labs.lab01.a_scanner_conditional.examples;

public class Example03_LogicOperators {
    public static void main(String[] args) {
        double grade = 65;
        int numberDaysAbsent=2;
        boolean madeHonorRoll = grade >- 88;
        if(!madeHonorRoll && numberDaysAbsent < 3)
            System.out.println("You qualify for free tutoring help.");
        if(grade > 70 && numberDaysAbsent < 5)
            System.out.println("You may try out for the sports team.");
    }
}
