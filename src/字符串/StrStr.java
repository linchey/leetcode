package 字符串;
/*
实现 strStr() 函数。

        给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

        示例 1:

        输入: haystack = "hello", needle = "ll"
        输出: 2

        示例 2:

        输入: haystack = "aaaaa", needle = "bba"
        输出: -1
*/

public class StrStr {
    public static void main(String[] args) {
        String s="hello";
        String s1="ll";
        System.out.println(strStr("hellohelbo","helbo"));
    }
    public static int strStr(String haystack, String needle) {
        char[] a=haystack.toCharArray();
        char[] b=needle.toCharArray();
        int count=0;
        if(haystack.length()<needle.length())return -1;

        for(int i=0;i<a.length-b.length+1;i++){
            count=0;
            for(int j=0;j<b.length;j++){
                if(a[i+j]!=b[j]){
                    break;
                }
                count++;
            }
            if(count==b.length){
                return i;
            }
        }
        return -1;
    }
}
