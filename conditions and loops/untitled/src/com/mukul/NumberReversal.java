package com.mukul;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to get a reversed one: ");
        int number = input.nextInt();

        int reversedNum = 0;
        while(number > 0) {
            int lastDig = number % 10;
            reversedNum = (reversedNum * 10) + lastDig;
            number /= 10;
        }

        System.out.printf("Reversed number is %d", reversedNum);
    }
}
