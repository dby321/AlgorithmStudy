package com.huaweijishi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/22 15:55:31
 */
public class HJ23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            HashMap<Character,Integer> map=new HashMap<>();
            String s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            List<Map.Entry<Character, Integer>> list = map.entrySet().stream().sorted((e1, e2) -> {
                return e1.getValue() - e2.getValue();
            }).collect(Collectors.toList());
            Integer value = list.get(0).getValue();
            List<Character> collect = list.stream().filter(e -> {
                return !e.getValue().equals(value);
            }).map(e -> e.getKey()).collect(Collectors.toList());
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(collect.contains(s.charAt(i))){
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
