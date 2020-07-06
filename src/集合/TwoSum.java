package 集合;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*两数之和
        给定 nums = [2, 7, 11, 15], target = 9

        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]*/
public class TwoSum {
    public static void main(String[] args) {
        int[] a={2, 7, 11, 15};
        System.out.println( Arrays.toString( twoSum( a,9 ) ) );

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>(  );

        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                result[1]=i;
                result[0]=map.get(nums[i]);
                return result;
            }
            map.put(target-nums[i],i);
        }
        return result;
    }
}
