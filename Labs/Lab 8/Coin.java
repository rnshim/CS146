import java.util.Arrays;

public class Coin {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;
        for (int amt = 1; amt <= amount; amt++) {
            for (int coin : coins) {
                if (amt - coin >= 0) {
                    dp[amt] = Math.min(dp[amt], dp[amt - coin] + 1);
                }
            }
        }
        if (dp[amount] != 10001) {
            return dp[amount];
        }
        return -1;
    }

    public static void main(String[] args){
        Coin coin = new Coin(); 
        System.out.println(coin.coinChange(new int[]{1, 2, 5}, 11)); 
        System.out.println(coin.coinChange(new int[]{2}, 3)); 
        System.out.println(coin.coinChange(new int[]{1}, 0));
    }
}
