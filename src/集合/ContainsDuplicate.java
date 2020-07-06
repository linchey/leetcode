package 集合;

import java.util.HashSet;
import java.util.Set;

/*存在重复元素
        给定一个整数数组，判断是否存在重复元素。

        如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
        输入: [1,2,3,1]
        输出: true
        */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] a={1,2,3,1};
        System.out.println(containsDuplicate( a ));
    }
    public static boolean containsDuplicate(int[] nums) {

        boolean flag=false;
        //利用集合特性
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains( nums[i] )){
                flag=true;
            }else {
                set.add( nums[i] );
            }
        }
        return flag;
    }
}

