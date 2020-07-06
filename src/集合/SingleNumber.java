package 集合;

import java.util.HashMap;
import java.util.Map;

/*只出现一次的数字
        给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
        输入: [2,2,1]
        输出: 1
*/
public class SingleNumber {
    public static void main(String[] args) {
        int[] a={4,1,2,1,2};
        System.out.println( singleNumber(a));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>(  );
        for (int num:nums){
            if(map.containsKey( num )){
               map.put( num ,map.get( num )+1);
            }else{
                map.put( num ,1);
            }

        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue().equals( 1 )){
                return entry.getKey();
            }
        }
        return nums[0];
    }
}
