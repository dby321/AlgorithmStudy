package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 19:21:52
 */
public class Leetcode46 {
    public static void main(String[] args) {
        int[] nums=new int[]{0,1};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> trace=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        backtrack(nums,0,visited,trace,result);
        return result;
    }
    public static void backtrack(int[] nums,int turn,boolean[] visited,List<Integer> trace,List<List<Integer>> result){
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
                trace.remove((Object)nums[i]);
                visited[i]=false;
                turn--;
            }
        }
    }
}
