package 字符串;

import java.util.HashMap;
import java.util.Map;

/* 有效的字母异位词

          给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
          输入: s = "anagram", t = "nagaram"
          输出: true
          */
public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "anagram";
        System.out.println(isAnagram( s,t ));
    }
     public static boolean isAnagram(String s, String t) {
        boolean flag=false;
        if(s.length()!=t.length())return false;
        if(s.equals( t ))return true;
         char[] c1=s.toCharArray();
         char[] c2=t.toCharArray();
         Map<Character,Integer> map1=countChar(c1);
         Map<Character,Integer> map2=countChar(c2);
         if (map1.equals( map2 )) flag=true;

         return flag;
     }

    private static Map<Character, Integer> countChar(char[] c1) {
        Map<Character,Integer>map=new HashMap<>(  );
        for (char c:c1){
           map.put( c,map.getOrDefault(c,0)+1);
        }
        return map;
    }
}
