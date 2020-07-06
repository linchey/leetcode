package 数组;
/*数组去重
* 给定 nums = [0,0,1,1,1,2,2,3,3,4],

函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。*/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int q=0;
        if(nums.length==0||nums.length==1)return nums.length;
        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[q]){
                q++;
                nums[q]=nums[i];
            }

        }
        return q+1;
    }

    public static void main(String[] args) {
        int[] a={1,2};
        System.out.println(removeDuplicates( a ));
    }
}
