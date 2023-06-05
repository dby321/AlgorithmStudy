package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 18:56:10
 */
public class Leetcode78 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> trace=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        result.add(new ArrayList<>());
        backtrack(nums,0,used,trace,result);
        return result;
    }
    public static void backtrack(int[] nums,int start,boolean[] used, List<Integer> trace,List<List<Integer>> result){
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
