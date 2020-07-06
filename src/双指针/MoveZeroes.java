package 双指针;

import java.util.Arrays;

/*移动零
         给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持相对顺序。

         示例:

         输入: [0,1,0,3,12]
         输出: [1,3,12,0,0]*/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] a={1,2};
        moveZeroes( a );
        System.out.println( Arrays.toString( a));
    }
    public static void moveZeroes(int[] nums) {
       /*//暴力
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;nums[i]==0&&j<nums.length;j++){
                nums[i]^=nums[j];
                nums[j]^=nums[i];
                nums[i]^=nums[j];
            }
        }*/
       //双指针  记录非0的下标，遍历数组。将非0元素填到记录索引下
       int point=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[point]=nums[i];
               if(i!=point){
                    nums[i]=0;
               }
               point++;
           }
       }
    }
}
