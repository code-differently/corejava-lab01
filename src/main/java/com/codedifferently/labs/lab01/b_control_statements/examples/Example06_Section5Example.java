package com.codedifferently.labs.lab01.b_control_statements.examples;

import java.util.Scanner;

public class Example06_Section5Example {
    public static void main(String[] args) {
        boolean quit = false;
        int num1 = 10, num2 =6, answer = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please enter a mathematical operand ");
            String input = in.next();
            char operand = input.charAt(0);
            switch(operand){
                case '*':
                    answer = num1 * num2;
                    break;
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '/':
                    answer = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            System.out.println("Quit? Y/N");
            if(in.next().equalsIgnoreCase("Y"))
                quit=true;
        }while(!quit);
    }
}
