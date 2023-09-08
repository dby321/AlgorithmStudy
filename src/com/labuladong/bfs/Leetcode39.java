package com.labuladong.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode39 {
    static List<List<Integer>> list=new ArrayList<>();
    static LinkedList<Integer> trace=new LinkedList<>();
    public static void main(String[] args) {
        int[] candidates=new int[]{2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates,target,0,0);
        return list;
    }
    public static void backTrack(int[] candidates,int target,int start,int nowSum){
        if(nowSum>target){
            return ;
        }
        if(nowSum==target){
            list.add(new ArrayList<>(trace));
        }
        for(int i=start;i<candidates.length;i++){
            trace.add(candidates[i]);
            backTrack(candidates,target,i,nowSum+candidates[i]);
            trace.removeLast();
        }
    }
}
