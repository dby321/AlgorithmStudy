package com.leetcode.backtrack;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 19:31:24
 */
public class Leetcode47 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,2,1,1};
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> trace=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited=new boolean[nums.length];
        backtrack(nums,0,visited,trace,result);
        return new ArrayList<>(result);
    }
    public static void backtrack(int[] nums,int turn,boolean[] visited,List<Integer> trace,Set<List<Integer>> result){
        if(turn>=nums.length+1)return ;
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                trace.add(nums[i]);
                visited[i]=true;
                turn++;
                if(turn==nums.length){
                    result.add(new ArrayList<>(trace));
                }
                backtrack(nums,turn,visited,trace,result);
                trace.remove(trace.size()-1);
                visited[i]=false;
                turn--;
            }
        }
    }
}
