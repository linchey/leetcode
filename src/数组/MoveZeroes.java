package 数组;

import java.util.Arrays;

/*移动零
       给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的从小到大的顺序。

       示例:

       输入: [0,1,0,3,12]
       输出: [1,3,12,0,0]*/
public class MoveZeroes {
   public static void main(String[] args) {
       int[] a={2,1};
       moveZeroes( a );
       System.out.println( Arrays.toString( a));
   }
   public static void moveZeroes(int[] nums) {
/*
       思路：先排序，再找到第一个不为0的元素，将这个元素后面的元素反转，接着将整个素组反转
*/
       Arrays.sort( nums );
       int k=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               k=i;
               break;
           }
       }

       reserver(nums,k,nums.length-1);
       reserver(nums,0,nums.length-1);
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
