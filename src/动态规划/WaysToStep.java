package 动态规划;
/*
面试题 08.01. 三步问题
三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。
结果可能很大，你需要对结果模1000000007。
 输入：n = 3
 输出：4
 说明: 有四种走法
*/
public class WaysToStep {
    public static void main(String[] args) {
        System.out.println(waysToStep(3));
    }
    public static int waysToStep(int n) {
        int[] dp=new int[n+1];
        if(n<=2)return  n;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007+dp[i-3];
            dp[i]%=1000000007;
        }
        return dp[n];
    }
}
