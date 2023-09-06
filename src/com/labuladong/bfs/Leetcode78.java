package com.labuladong.bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集问题，元素无重不可复选
 */
public class Leetcode78 {
    static List<List<Integer>> list=new ArrayList<>();
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        backTrack(nums,0,new ArrayList<>());
        return list;
    }
    public static void backTrack(int[] nums,int start,List<Integer> trace){
        list.add(new ArrayList<>(trace));
        for(int i=start;i<nums.length;i++){
            trace.add(nums[i]);
            backTrack(nums,i+1,trace);
            trace.remove(trace.size()-1);
        }
    }
}
