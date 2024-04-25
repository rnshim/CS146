from typing import List

class Coin:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [10001] * (amount + 1)
        dp[0] = 0

        for amt in range(1, amount + 1):
            for coin in coins:
                if amt - coin >= 0:
                    dp[amt] = min(dp[amt], dp[amt - coin] + 1)

        if dp[amount] != 10001:
            return dp[amount]
        return -1
    
coin = Coin()
print(coin.coinChange([1, 2, 5], 11))  
print(coin.coinChange([2], 3))         
print(coin.coinChange([1], 0))        