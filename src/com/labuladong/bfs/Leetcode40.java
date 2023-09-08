package com.labuladong.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode40 {
    static List<List<Integer>> list=new ArrayList<>();
    static LinkedList<Integer> trace=new LinkedList<>();
    public static void main(String[] args) {
        int[] candidates=new int[]{10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(candidates,target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int nowSum=0;
        boolean[] visited=new boolean[candidates.length];
        int start=0;
        backTrack(candidates,target,visited,nowSum,start);
        return list;
    }
    public static void backTrack(int[] candidates,int target,boolean[] visited,int nowSum,int start){
        if(nowSum>target){
            return ;
        }
        if(nowSum==target){
            list.add(new ArrayList<>(trace));
        }
        for(int i=start;i<candidates.length;i++){
            if(i>0&&candidates[i]==candidates[i-1]&&!visited[i-1]){
                continue;
            }
            visited[i]=true;
            trace.add(candidates[i]);
            backTrack(candidates,target,visited,nowSum+candidates[i],i+1);
            trace.removeLast();
            visited[i]=false;
        }
    }
}
