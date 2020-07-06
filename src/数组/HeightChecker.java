package 数组;

import java.util.Arrays;

/**
 * 1051.高度检查器
 * */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int res=0;
        int[] temp= Arrays.copyOf( heights, heights.length);
        for(int i=0;i<heights.length-1;i++){
            for(int j=0;j<heights.length-i-1;j++){
                if(heights[j]>heights[j+1]){
                    heights[j]^= heights[j+1];
                    heights[j+1]^=heights[j];
                    heights[j]^=heights[j+1];
                }
            }
        }
        for(int i=0;i<=heights.length-1;i++){
            if(heights[i]!=temp[i]){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] t={1,1,4,2,1,3};
        int a=new HeightChecker().heightChecker( t );
        System.out.println(a);
    }
}
