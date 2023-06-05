package com.leetcode.backtrack;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 19:08:56
 */
public class Leetcode90 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> trace=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        backtrack(nums,0,used,trace,result);
        return new ArrayList<>(result);
    }
    public static void backtrack(int[] nums,int start,boolean[] used, List<Integer> trace,Set<List<Integer>> result){
        if(start>=nums.length)return ;
        for(int i=start;i<nums.length;i++){
            if(!used[i]){
                trace.add(nums[i]);
                used[i]=true;
                result.add(new ArrayList<>(trace));
                backtrack(nums,i+1,used,trace,result);
                trace.remove((Object)nums[i]);
                used[i]=false;
            }
        }
    }
}
