public class RichestCustomerWealth {
    public static void main(String[] args) {
        // https://leetcode.com/problems/richest-customer-wealth/

        // Question
        // You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the [i]th customer has in the [j]th bank. Return the wealth that the richest customer has.
        // A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

        // Example 1:
        // Input: accounts = [[1,2,3],[3,2,1]]
        // Output: 6

        // Example 2:
        // Input: accounts = [[1,5],[7,3],[3,5]]
        // Output: 10

        // Example 3:
        // Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
        // Output: 17

        // ----------------------------------------------------------------
        // Solution

        // int[][] accounts = {
        //         {1, 2, 3},
        //         {3, 2, 1}
        // };

        // int[][] accounts = {
        //        {1, 5},
        //        {7, 3},
        //        {3, 5}
        // };

        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    static public int maximumWealth(int[][] accounts) {
        int maxWealth = calculateIndividualWealth(accounts[0]);
        for (int[] account : accounts) {
            if (calculateIndividualWealth(account) >= maxWealth) {
                maxWealth = calculateIndividualWealth(account);
            }
        }
        return maxWealth;
    }

    static public int calculateIndividualWealth(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
