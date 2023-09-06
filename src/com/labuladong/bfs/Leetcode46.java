package com.labuladong.bfs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {
    static List<List<Integer>> list=new ArrayList<>();
    static List<Integer> trace=new ArrayList<>();
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
        boolean[] visited=new boolean[nums.length];
        backTrack(nums,visited,0);
        return list;
    }
    public static void backTrack(int[] nums,boolean[] visited,int nowCount){
        if(nowCount==nums.length){
            list.add(new ArrayList<>(trace));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                trace.add(nums[i]);
                backTrack(nums,visited,nowCount+1);
                visited[i]=false;
                trace.remove(trace.size()-1);
            }
        }
    }
}
