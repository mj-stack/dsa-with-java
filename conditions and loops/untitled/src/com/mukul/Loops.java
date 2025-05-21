package com.mukul;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // Q. Print numbers from 1 to 5.
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

        // syntax of for loop
        // for (initialization; condition; increment/decrement) {
            // body
        // }

        /*
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }

         */

        // print number from 1 to n
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number you want numbers to be print up to: ");
//        int n = input.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }

        // while loops
        /*
            while (condition) {
                body
                increment/ decrement
            }
        */
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }
    }
}
