package com.labuladong.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode90 {
    static List<List<Integer>> list=new ArrayList<>();
    static List<Integer> trace=new ArrayList<>();
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums,visited,0);
        return list;
    }
    public static void backTrack(int[] nums,boolean[] visited,int start){
        list.add(new ArrayList<>(trace));
        for(int i=start;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]){
                continue;
            }
            if(!visited[i]){
                visited[i]=true;
                trace.add(nums[i]);
                backTrack(nums,visited,i+1);
                visited[i]=false;
                trace.remove(trace.size()-1);
            }
        }
    }
}
