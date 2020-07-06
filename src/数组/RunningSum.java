package 数组;

import java.util.Arrays;

/*
1480. 一维数组的动态和
输入：nums = [1,2,3,4]
输出：[1,3,6,10]
解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4]
*/
public class RunningSum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println("输入："+ Arrays.toString( arr ));
        System.out.println( "输出："+Arrays.toString( runningSum(arr) ) );
    }
    public static int[] runningSum(int[] nums) {
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
