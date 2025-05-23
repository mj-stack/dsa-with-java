package com.mukul;

import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your main num: ");
        int number = input.nextInt();
        int mainNum = number;

        System.out.print("Enter the number of which you want to check the occurrence: ");
        int n = input.nextInt();
        int occurence = 0;

        for (int i = 0; number > 1; i++) {
            int lastNum = number % 10;
            if (lastNum == n) {
                occurence++;
            }
            number /= 10;
        }

        System.out.printf("Number %d occurred %d times in %d", n, occurence, mainNum);
    }
}
