package 动态规划;
/*
70. 爬楼梯
输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶

*/
public class ClimbStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs( 3 ));
    }

    private static int climbStairs(int n) {
        int [] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
