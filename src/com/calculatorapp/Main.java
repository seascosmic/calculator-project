package com.calculatorapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        boolean continueLoop = true;

        System.out.println("DO A CALCULATION!");

        while (continueLoop) {
            System.out.println("Enter the first number: ");
            double numberOne = user.nextDouble();
            System.out.println("Enter the second number: ");
            double numberTwo = user.nextDouble();
            System.out.println("Choose an operation: (+, -, *, /)");
            char operator = user.next().charAt(0);
            double result;

            switch (operator) {
                case '+':
                    result = numberOne + numberTwo;
                    break;
                case '-':
                    result = numberOne - numberTwo;
                    break;
                case '*':
                    result = numberOne * numberTwo;
                    break;
                case '/':
                    result = numberOne / numberTwo;
                    if (numberTwo != 0) {
                        result = numberOne / numberTwo;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid Operation");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.println("Do you wanna continue: (S/N)");
            String respLoop = user.next().toUpperCase();
            if (respLoop.equals("N")) {
                continueLoop = false;
            }
        }
        System.out.println("Calculator closed.");
        user.close();
    }
}
