package 字符串;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CountWord {
    public static void main(String[] args) {
        CountWord countWord=new CountWord();
        String s="hello word hello world";
        countWord.countWord(s);
    }

    private  void countWord(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] strs = s.split( " " );
        for (int i = 0; i < strs.length; i++) {
            if (map.size()!=0&&map.containsKey( strs[i] )) {
                map.put( strs[i], map.get( strs[i] ) + 1 );
            } else {
                map.put( strs[i], 1 );
            }
        }
        Set<String> set = map.keySet();
        Iterator<String> i1 = set.iterator();
        while (i1.hasNext()) {
            String key = i1.next();// key
            Integer value = map.get( key );// 值
            System.out.println( "单词：" + key + "    出现次数：" + value );
            System.out.println( "------------------------------------------" );
        }
    }

}
