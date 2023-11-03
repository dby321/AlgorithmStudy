package com.jianxinjinke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/10/14 18:56:54
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


    }
    public int countSeq(String myStr){
        String s=myStr.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        String target="ccbft";
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<target.length();i++){
            map2.put(target.charAt(i),map2.getOrDefault(target.charAt(i),0)+1);
        }
        int count=0;
        while(true){
            boolean flag=true;
            for(Map.Entry<Character,Integer> entry:map2.entrySet()){
                if(map.containsKey(entry.getKey())&&map.get(entry.getKey())>=entry.getValue()){
                    continue;
                }else{
                    flag=false;
                    break;
                }
            }

            if(flag){
                for(Map.Entry<Character,Integer> entry:map2.entrySet()){
                    map.put(entry.getKey(),map.get(entry.getKey())-entry.getValue());
                }
                count++;
            }else{
                break;
            }
        }
       return count ;
    }
}
