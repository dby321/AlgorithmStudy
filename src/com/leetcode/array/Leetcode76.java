package com.leetcode.array;

import java.util.HashMap;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 更新子串后要更新最小长度
 * @date 2023/5/28 21:03:27
 */
public class Leetcode76 {
    public static void main(String[] args) {
        String s="cabwefgewcwaefgcf";
        String t="cae";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> tMap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        int valid=0;
        int left=0;
        int right=0;
        int minLen=Integer.MAX_VALUE;
        String substring="";
        HashMap<Character,Integer> window=new HashMap<>();
        while(right<s.length()){
            if(tMap.containsKey(s.charAt(right))){
                window.put(s.charAt(right),window.getOrDefault(s.charAt(right),0)+1);
                if(window.get(s.charAt(right)).equals(tMap.get(s.charAt(right)))){
                    valid++;
                }
            }
            right++;
            while(valid== tMap.size()){
                if(minLen>right-left){
                    substring=s.substring(left,right);
                    minLen=Math.min(minLen,right-left);
                }
                if(tMap.containsKey(s.charAt(left))){
                    if(window.get(s.charAt(left)).equals(tMap.get(s.charAt(left)))){
                        valid--;
                    }
                    window.put(s.charAt(left),window.get(s.charAt(left))-1);
                }
                left++;
            }
        }
       return substring;
    }
}
