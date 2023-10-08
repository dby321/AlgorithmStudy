package com.yaxinanquan;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/17 14:53:12
 */
public class Problem1 {
    public static void main(String[] args) {
        String S="abcd";
        String T="bacde";
        System.out.println(lookup(S,T));
    }
    public static char lookup (String s, String t) {
        // write code here
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if(!map1.containsKey(entry.getKey())||!map1.get(entry.getKey()).equals(entry.getValue())){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
