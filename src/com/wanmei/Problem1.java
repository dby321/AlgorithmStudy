package com.wanmei;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/26 17:55:58
 */
public class Problem1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,3,3,3};
        System.out.println(findStone(arr));
    }
    public static int findStone (int[] arr) {
        if(arr.length==0){
            return -1;
        }
        // write code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        TreeMap<Integer,Integer> map2=new TreeMap<>((a,b)->{
            return b-a;
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet() ){
            if(entry.getKey().equals(entry.getValue())){
                map2.put(entry.getKey(),entry.getValue());
            }
        }
        if(map2.size()==0){
            return -1;
        }
        List<Map.Entry<Integer, Integer>> collect = map2.entrySet().stream().limit(1).collect(Collectors.toList());
        return collect.get(0).getKey();
    }
}
