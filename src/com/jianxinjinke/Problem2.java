package com.jianxinjinke;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/10/14 18:57:01
 */
public class Problem2 {
    public static void main(String[] args) {
        String s="aaaabbbbccccddddeeee";
        System.out.println(Delete_character(s));
    }
    public static int Delete_character (String s) {
        // write code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> list = map.entrySet().stream().sorted((entry1, entry2) -> {
            return entry2.getValue() - entry1.getValue();
        }).collect(Collectors.toList());
        int count=0;
        while(true){
            boolean flag=false;
            int index=0;
            for(int i = 0; i< list.size()-1; i++){
                if(list.get(i).getValue().equals(list.get(i+1).getValue())){
                    list.get(i+1).setValue(list.get(i+1).getValue()-1);
                    index=i+1;
                    flag=true;
                    break;
                }
            }
            if(flag){
                if(list.get(index).getValue()==0){
                    list.remove((int)index);
                }
                count++;
                list=list.stream().sorted((entry1, entry2) -> {
                    return entry2.getValue() - entry1.getValue();
                }).collect(Collectors.toList());
            }else{
                break;
            }
        }
        return count;

    }
}
