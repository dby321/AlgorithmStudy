package com.leetcode.backtrack;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 剪枝需要小心
 * @date 2023/6/4 16:25:24
 */
public class Leetcode40 {
    public static void main(String[] args) {
       int[] candidates = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
       int target = 27;

        System.out.println(combinationSum2(candidates,target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> trace=new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] visited=new boolean[candidates.length];
        backtrack(candidates,target,0,0,visited,trace,result);
        return new ArrayList<>(result);
    }
    public static void backtrack(int[] candidates, int target,int index,int sum,boolean[] visited,List<Integer> trace,Set<List<Integer>> result){
        if(index>=candidates.length)return ;
        for(int i=index;i<candidates.length;i++){
            if(!visited[i]&&(trace.size()==0||trace.get(trace.size()-1)<=candidates[i])){
                if(sum+candidates[i]>target){
                    return ;
                }
                if(i>0&&candidates[i]==candidates[i-1]&&!visited[i-1]){
                    continue;
                }
                sum+=candidates[i];
                trace.add(candidates[i]);
                visited[i]=true;
                if(sum==target){
                    result.add(new ArrayList<>(trace));
                }

                backtrack(candidates,target,index+1,sum,visited,trace,result);
                sum-=candidates[i];
                trace.remove((Object)candidates[i]);
                visited[i]=false;
            }
        }
    }
}
