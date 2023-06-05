package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 17:34:18
 */
public class Leetcode93 {
    public static void main(String[] args) {
        String s="101023";
        System.out.println(restoreIpAddresses(s));
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<>();
        StringBuilder trace=new StringBuilder();
        backtrack(s,0,0,trace,result);
        return result;
    }
    public static void backtrack(String s,int start,int turn,StringBuilder trace,List<String> result){
        if(start>=s.length())return ;
        for(int i=start;i<s.length();i++){
            String substring=s.substring(start,i+1);
            if(substring.equals("0")||substring.length()<=3&&Long.parseLong(substring)<=255&&Long.parseLong(substring)>=0&&substring.charAt(0)!='0'){
                String sub=s.substring(start,i+1);
                trace.append(sub);
                trace.append(".");
                turn++;
                if(turn==4&&i+1==s.length()){
                    result.add(trace.substring(0,trace.length()-1));
                }
                backtrack(s,i+1,turn,trace,result);
                trace.delete(trace.length()-sub.length(),trace.length());
                trace.deleteCharAt(trace.length()-1);
                turn--;
            }
        }
    }
}
