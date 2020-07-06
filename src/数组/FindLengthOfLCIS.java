package 数组;
/*
674. 最长连续递增序列
*/
public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int res=0,temp=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                temp++;
            } else {
                if(res<temp){
                res=temp;
                temp=1;
                }
            }
        }
        if(res<temp) { res=temp;};
        return res;
    }
    public static void main(String[] args) {
       int[] a={1,3,4,5,4,2,4,5,1};
       int t=new FindLengthOfLCIS().findLengthOfLCIS( a );
       System.out.println(t);

    }
}
