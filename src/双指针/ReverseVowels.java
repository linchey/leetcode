package 双指针;

import java.util.ArrayList;
import java.util.List;

/***
 * 345. 反转字符串中的元音字母
 *
 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] cs=s.toCharArray();
        int p=0, q=cs.length-1;
        char[] c={'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            list.add(c[i]);
        }
        while(p<q){
            while(p<q&&!list.contains(cs[p])){
                p++;
            }
            while(p<q&&!list.contains(cs[q])){
                q--;
            }
            if (p<q) {
                char temp = cs[p];
                cs[p] = cs[q];
                cs[q] = temp;
                p++;
                q--;
            }

        }
        return String.valueOf(cs);
    }
}
