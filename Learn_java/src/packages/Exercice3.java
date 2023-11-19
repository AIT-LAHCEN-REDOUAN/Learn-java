package packages;

import java.util.Arrays;

public class Exercice3 {
    public static void main(String[] args) {
        int totalAmount = 100; // 1 Franc = 100 cents
        int[] coinValues = {2, 5, 10}; // Coin denominations

        int totalCombinations = countCombinations(totalAmount, coinValues);

        System.out.println("Total combinations: " + totalCombinations);
    }

    public static int countCombinations(int amount, int[] coinValues) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        System.out.println(Arrays.toString(dp));

        for (int coin : coinValues) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}



