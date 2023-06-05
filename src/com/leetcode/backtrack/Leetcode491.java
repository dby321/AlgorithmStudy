package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 19:11:36
 */
public class Leetcode491 {
    public static void main(String[] args) {
        int[] nums=new int[]{4,4};
        System.out.println(findSubsequences(nums));
    }
    public static List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> trace=new ArrayList<>();
        backtrack(nums,0,trace,result);
        return new ArrayList<>(result);
    }
    public static void backtrack(int[] nums,int start,List<Integer> trace,Set<List<Integer>> result){
        if(start>=nums.length)return ;
        for(int i=start;i<nums.length;i++){
            if(trace.size()==0||trace.get(trace.size()-1)<=nums[i]){
                trace.add(nums[i]);
                if(trace.size()>=2){
                    result.add(new ArrayList<>(trace));
                }
                backtrack(nums,i+1,trace,result);
                trace.remove((Object)nums[i]);
            }
        }
    }
}
