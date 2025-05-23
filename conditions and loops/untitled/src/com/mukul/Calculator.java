package com.mukul;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till user does not press X or x


        int result = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    result = num1 / num2;
                }
            } else if (op == 'X' || op == 'x') {
                System.out.println("Breaking out");
                break;
            } else {
                System.out.println("Invalid operation");
            }
            System.out.println(result);
        }
    }
}
