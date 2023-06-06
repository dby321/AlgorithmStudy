package com.leetcode.greedy;

import java.util.HashMap;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 20:08:51
 */
public class Leetcode860 {
    public static void main(String[] args) {
        int[] bills=new int[]{5,5,10,10,20};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(5,map.getOrDefault(5,0)+1);
            }else if(bills[i]==10){
                if(map.containsKey(5)){
                    map.put(5,map.get(5)-1);
                    if(map.get(5)==0){
                        map.remove(5);
                    }
                    map.put(10,map.getOrDefault(10,0)+1);
                }else{
                    return false;
                }
            }else if(bills[i]==20){
                if(map.containsKey(5)&&map.containsKey(10)){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)-1);
                    if(map.get(5)==0){
                        map.remove(5);
                    }
                    if(map.get(10)==0){
                        map.remove(10);
                    }
                    map.put(20,map.getOrDefault(20,0)+1);
                }
                else if(map.containsKey(5)&&map.get(5)>=3){
                    map.put(5,map.get(5)-3);
                    if(map.get(5)==0){
                        map.remove(5);
                    }
                    map.put(20,map.getOrDefault(20,0)+1);
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
