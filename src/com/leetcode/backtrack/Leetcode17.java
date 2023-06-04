package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 15:49:44
 */
public class Leetcode17 {
    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Integer,char[]> map=new HashMap<>();
        map.put(2,new char[]{'a','b','c'});
        map.put(3,new char[]{'d','e','f'});
        map.put(4,new char[]{'g','h','i'});
        map.put(5,new char[]{'j','k','l'});
        map.put(6,new char[]{'m','n','o'});
        map.put(7,new char[]{'p','q','r','s'});
        map.put(8,new char[]{'t','u','v'});
        map.put(9,new char[]{'w','x','y','z'});
        List<String> list=new ArrayList<>();
        StringBuilder trace=new StringBuilder();
        backtrack(map,digits,0,trace,list);
        return list;
    }
    public static void backtrack(HashMap<Integer,char[]> map,String digits,int index,StringBuilder trace,List<String> list){
        if(index>=digits.length())return ;
        Integer key=Integer.valueOf(digits.charAt(index)+"");
        char[] chars=map.get(key);
        for(int i=0;i<chars.length;i++){
            trace.append(chars[i]);
            index++;
            if(index==digits.length()){
                list.add(trace.toString());
            }
            backtrack(map,digits,index,trace,list);
            trace.deleteCharAt(trace.length()-1);
            index--;
        }
    }
}
