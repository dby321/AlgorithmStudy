package com.xiaohongshu;

import java.util.*;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n= Integer.parseInt(sc.nextLine());
            String[] arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLine();
            }
            HashMap<String,Integer> map=new HashMap<>();
            int begin=1;
            int wordCount=0;
            HashSet<String> visited=new HashSet<>();
            for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                if(map.get(arr[i])==begin&&!visited.contains(arr[i])){
                    begin++;
                    wordCount++;
                    visited.add(arr[i]);
                }
            }
            System.out.println(wordCount);
        }
    }
}
