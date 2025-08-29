// File = StockBuySell.java

import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter stock prices for each day: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int maxProfit = getMaxProfit(prices);
        System.out.println("Maximum profit you can earn: " + maxProfit);
    }

    public static int getMaxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // update min price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice); // potential profit
            }
        }
        return maxProfit;
    }
}
