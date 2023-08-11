package com.huaweijishi;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/9 15:55:30
 */
public class HJ68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            int sortType = Integer.parseInt(sc.nextLine());
            LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
            for(int i=0;i<n;i++){
                String s = sc.nextLine();
                String[] split = s.split(" ");
                map.put(split[0]+"_"+i,Integer.valueOf(split[1]));
            }
            map.entrySet().stream().sorted((entry1, entry2) -> {
                if (sortType == 1) {
                    return entry1.getValue() - entry2.getValue();
                } else {
                    return entry2.getValue() - entry1.getValue();
                }
            }).collect(Collectors.toList()).stream().forEach(e -> {
                System.out.println(e.getKey().split("_")[0] + " " + e.getValue());
            });

        }
    }
}
