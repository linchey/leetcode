package 动态规划;

/*
53. 最大子序和
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
*/
public class MaxSubArray {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray( arr ));
    }
    public static int maxSubArray(int[] nums) {
 /*       *//*空间复杂度为O(n)*//*
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int max=nums[0];
        for (int i=1;i<nums.length;i++){
            dp[i]=Math.max( nums[i],dp[i-1]+nums[i] );
            if(max<dp[i]){
                max=dp[i];
            }
        }
        return max;
    }*/
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            max=Math.max( max,sum );
        }
        return max;
    }
}
