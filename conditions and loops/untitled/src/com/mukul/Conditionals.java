package com.mukul;

public class Conditionals {
    public static void main(String[] args) {
        /*
        * Syntax of if statement:
        * if (boolean expression true or false) {
        *   // body
        * } else {
        *   // other body
        * }
        * */

        int salary = 25000;
        // if (salary > 10000) {
        //     salary += 2000;
        // } else {
        //     salary += 1000;
        // }

        // multiple if else statement
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);
    }
}
