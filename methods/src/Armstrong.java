package src;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to count the digits: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is not Armstrong");
        }
    }

    static boolean isArmstrong(int num) {
        int totalNum = countNum(num);
        int sum = 0;
        for (int i = 0; num > 0 ; i++) {
            int rem = num % 10;
            sum += Math.pow(rem, totalNum);
            num /= 10;
        }
        return sum == num;
    }

    static int countNum(int num) {
        int count = 0;
        for (int i = 0; num > 0; i++) {
            num /= 10;
            count++;
        }
        return count;
    }
}
