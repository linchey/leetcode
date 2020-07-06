package 双指针;

/*
392. 判断子序列
给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
示例 1:
s = "abc", t = "ahbgdc"
true
*/
public class IsSubsequence {
    public static void main(String[] args) {
        String str1="axc",str2="ahbgdc";
        System.out.println(isSubsequence(str1,str2));
    }

    private static boolean isSubsequence(String s, String t) {
        char[] a1= s.toCharArray();
        char[] a2=t.toCharArray();
        int p1=0,p2=0;
        while(p1<a1.length&&p2<a2.length){
            if(a1[p1]==a2[p2]){
                p1++;
                p2++;
            }else{
                p2++;
            }
        }
        return a1.length==p1;
    }
}
