package 数组;

import java.util.Arrays;

/*加一
        给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

        最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

        你可以假设除了整数 0 之外，这个整数不会以零开头。
        输入: [1,2,3]
        输出: [1,2,4]
        解释: 输入数组表示数字 123。*/
public class PlusOne {
    public static void main(String[] args) {
        int[] a={9};
        System.out.println( Arrays.toString(plusOne( a )));
    }
    public static int[] plusOne(int[] digits) {
       int len=digits.length-1;
       while(digits[len]==9&&len>0){
           digits[len]=0;
           len--;
       }
       digits[len]+=1;
       if(digits[0]>=10){
           int[] newDigits=new int[digits.length+1];
           newDigits[0]=digits[0]/10;
           newDigits[1]=digits[0]%10;
           for (int i=2;i<newDigits.length;i++){
               newDigits[i]=digits[i-1];
           }
           return newDigits;
       }

        return digits;
    }


}
