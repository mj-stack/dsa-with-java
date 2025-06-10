import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check if prime or not: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not prime");
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i*i < num; i++) {
            System.out.printf("Ran %d times: ", (i - 1));
            System.out.println();
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}