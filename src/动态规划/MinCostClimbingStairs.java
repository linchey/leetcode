package 动态规划;
/*
746. 使用最小花费爬楼梯
数组的每个索引作为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。

每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。

您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。

输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
输出: 6
解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
*/
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int [] arr={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs( arr ));
    }

    private static int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            dp[i]=Math.min( dp[i-1]+cost[i],dp[i-2]+cost[i] );
        }
        return Math.min( dp[cost.length-1] ,dp[cost.length-2]);
    }
}
