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
 * @date 2023/8/3 18:52:54
 */
public class HJ45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                String str = sc.next();
                int piaoliang=calPiaoliang(str);
                System.out.println(piaoliang);
            }
        }
    }
    public static int calPiaoliang(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> list = map.entrySet().stream().sorted((entry1, entry2) -> {
            return entry2.getValue() - entry1.getValue();
        }).collect(Collectors.toList());
        int piaoliang=26;
        int count=0;
        for(Map.Entry<Character,Integer> entry:list){
            int i = entry.getValue() * piaoliang;
//            System.out.println(i);
            count+=i;
            piaoliang--;
        }
        return count;
    }
}
