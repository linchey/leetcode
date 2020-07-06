package 字符串;
/*
验证回文字符串

        给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

        说明：本题中，我们将空字符串定义为有效的回文串。

        示例 1:

        输入: "A man, a plan, a canal: Panama"
        输出: true
*/

import java.util.ArrayList;

public class IsPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome( s ));
    }
    public static boolean isPalindrome(String s) {
        char[] cs = s.toLowerCase().toCharArray();
        ArrayList<Character> a=new ArrayList<>(  );
        for (int i=0;i<cs.length;i++){
            if(isChar(cs[i])){
                a.add( cs[i] );
            }
        }
        for (int i=0;i<a.size()/2;i++){
            if(a.get( i )!=a.get( a.size()-i-1 )){
                return false;
            }
        }
        return true;
    }

    private static boolean isChar(char ch) {
        if (ch >= 'a' && ch <= 'z') return true;
        //if (ch >= 'A' && ch <= 'Z') return true;
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }
}
