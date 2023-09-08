package com.labuladong.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode47 {
    static List<List<Integer>> list=new ArrayList<>();
    static LinkedList<Integer> trace=new LinkedList<>();
    public static void main(String[] args) {
        int[] nums=new int[]{1,1,2};
        System.out.println(permuteUnique(nums));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited=new boolean[nums.length];
        backTrack(nums,visited);
        return list;
    }
    public static void backTrack(int[] nums,boolean[] visited){
        if(trace.size()==nums.length){
            list.add(new ArrayList<>(trace));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]){
                continue;
            }
            visited[i]=true;
            trace.add(nums[i]);
            backTrack(nums,visited);
            visited[i]=false;
            trace.removeLast();
        }
    }
}
