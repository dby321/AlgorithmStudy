package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 17:05:42
 */
public class Leetcode131 {
    public static void main(String[] args) {
        String s="aab";
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s) {
        List<String> trace=new ArrayList<>();
        List<List<String>> result=new ArrayList<>();
        backtrack(s,0,trace,result);
        return result;
    }
    public static void backtrack(String s,int start,List<String> trace,List<List<String>> result){
        if(start>=s.length())return ;
        for(int i=start;i<s.length();i++){
            if(huiwen(s.substring(start,i+1))){
                trace.add(s.substring(start,i+1));
                if(i==s.length()-1){
                    result.add(new ArrayList<>(trace));
                }
                backtrack(s,i+1,trace,result);
                trace.remove(trace.size()-1);
            }
        }
    }
    public static boolean huiwen(String s){
        if(s==null)return false;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
