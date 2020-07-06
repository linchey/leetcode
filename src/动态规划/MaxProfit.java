package 动态规划;
/*
 买卖股票的最佳时机 II
 输入: [7,1,5,3,6,4]
输出: 7
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
     随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
*/
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        /*动态规划
        if (prices == null || prices.length == 0) {
            return 0;
        }
        //长度
        int[][] dp = new int[prices.length][2];
        //第0天不持有股票，第0天持有股票，那么它为-prices[0]
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            //第i天不持有股票(两种情况，第i-1天不持有股票，或第i-1天持有股票，但是第i天抛出)
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];*/
        //贪心
        int res=0;
        if (prices == null || prices.length == 0) {
            return 0;
        }
        for (int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                res+=prices[i]-prices[i-1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices={1,2,3,4,5};
        System.out.println(maxProfit( prices ));
    }
}
