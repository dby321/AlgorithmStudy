package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 当两个while循环完成时，是可以算sum的
 * @date 2023/5/28 20:35:27
 */
public class Leetcode904 {
    public static void main(String[] args) {
        int[] fruits=new int[]{1,2,1};
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxFruits=0;
        while(right<fruits.length){
            int fruitOne=fruits[right];
            if(map.size()<=2){
                map.put(fruitOne,map.getOrDefault(fruitOne,0)+1);
            }
            right++;
            while(map.size()>2){
                int fruitTwo=fruits[left];
                map.put(fruitTwo,map.get(fruitTwo)-1);
                if(map.get(fruitTwo)==0){
                    map.remove(fruitTwo);
                }
                left++;
            }
            maxFruits=Math.max(maxFruits,right-left);
        }
        return maxFruits;
    }
}
