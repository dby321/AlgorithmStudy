package com.leetcode.stackqueue;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. map和PriorityQueue结合使用
 * @date 2023/6/2 17:08:49
 */
public class Leetcode347 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
    public static int[] topKFrequent(int[] nums, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((a,b)->{
            return b[1]-a[1];
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            priorityQueue.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=priorityQueue.poll()[0];
        }
        return result;
    }
}
