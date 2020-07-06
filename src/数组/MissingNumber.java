package 数组;
/**
 *0～n-1中缺失的数字
 * */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        /*
        int res=0;
        for(int i=0;i<=nums.length-1;i++){
            if(res!=nums[i]){
                return  res;
            }
            res++;
        }
        return res;*/
        /*二分法*/
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(right+left)>>1;
            if(nums[mid]!=mid) {
                right = mid - 1;
            }else{
                left=mid+1;
            }
        }
        return left == nums.length - 1 && nums[left] == left ? left + 1 : left;

    }
    public static void main(String[] args) {
        int[] a={0,1,2,3,4,5,6,7,9};
        int t=new MissingNumber().missingNumber( a );
        System.out.println(t);
    }
}
