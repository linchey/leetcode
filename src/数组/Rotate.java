package 数组;
 /* 旋转数组
          给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

          示例 1:

          输入: [1,2,3,4,5,6,7] 和 k = 3
          输出: [5,6,7,1,2,3,4]
          解释:
          向右旋转 1 步: [7,1,2,3,4,5,6]
          向右旋转 2 步: [6,7,1,2,3,4,5]
          向右旋转 3 步: [5,6,7,1,2,3,4]*/

import java.util.Arrays;

public class Rotate {
/*
    反转全部元素，k之前得元素，再反转k后面得元素
*/
    public static void main(String[] args) {
        int[] nums1={1,2};
        rotate( nums1,3);
        System.out.println( Arrays.toString( nums1 ));
    }
    public static void rotate(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return;
        }
        k = k % nums.length;
        reserver(nums,0,nums.length-1);
        reserver(nums,0,k-1);
        reserver(nums,k,nums.length-1);



    }

    private static void reserver(int[] nums, int left, int right) {
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    private static void swap(int[]nums,int left, int right) {
        nums[left]^=nums[right];
        nums[right]^=nums[left];

        nums[left]^=nums[right];

    }
}
