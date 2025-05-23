package com.mukul;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int a = input.nextInt();
        System.out.print("Enter num 2: ");
        int b = input.nextInt();
        System.out.print("Enter num 3: ");
        int c = input.nextInt();

        // Q. Find the largest of the three numbers
//        if (a > b && a > c) {
//            System.out.println(a + " is largest");
//        } else if (b > a && b > c) {
//            System.out.println(b + " is largest");
//        } else {
//            System.out.println(c + " is largest");
//        }

        int max = Math.max(Math.max(a, b), c);
        System.out.println(max);
    }
}
