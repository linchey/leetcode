package 字符串;
/*
字符串中的第一个唯一字符

        给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。



        示例：

        s = "leetcode"
        返回 0

        s = "loveleetcode"
        返回 2
*/

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar( s ));
    }
    public static int firstUniqChar(String s) {
        int res=-1;
        char[] c=s.toCharArray();
        Map<Character,Integer>map= new HashMap();
        for (int i=0;i<c.length;i++){
            if (map.containsKey( c[i] )){
                map.put( c[i],map.get( c[i] )+1 );
            }else {
                map.put( c[i],1 );
            }
        }
        for (int i = 0; i < c.length; i++) {
            if(map.get(c[i])==1) return i;//找到词频为1的字母(只出现一次)返回其索引
        }

        return res;
    }
}
