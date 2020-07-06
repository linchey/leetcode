package 双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> temp = new ArrayList<>();
        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                temp.add( nums1[i] );
                i++;
                j++;
            }

        }
        int[] res = new int[temp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = temp.get(i);
        return res;

    }
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] a=(new Intersect()).intersect( nums1,nums2 );
        System.out.println( Arrays.toString( a ));
    }
}
