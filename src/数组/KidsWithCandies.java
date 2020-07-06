package 数组;

import java.util.ArrayList;
import java.util.List;

/*
1431. 拥有最多糖果的孩子
输入：candies = [2,3,5,1,3], extraCandies = 3
输出：[true,true,true,false,true]
解释：
孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，他将成为拥有最多糖果的孩子。
孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
*/
public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> l=kidsWithCandies( candies,extraCandies );
        for (Boolean a:l) {
            System.out.println(a);
        }
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>(  );
        int max=getMax(candies);
        int [] t=new int[candies.length];
        for(int i=0;i<candies.length;i++){
            t[i]=max-candies[i];
            if(t[i]<=extraCandies){
                list.add( true );
            }else {
                list.add( false );
            }
        }
        return list;
    }

    private static int getMax(int[] candies) {
        int max=candies[0];
        for (int i=0;i<candies.length;i++){
           if(max<candies[i]){
               max=candies[i];
           }
        }
        return max;
    }
}
