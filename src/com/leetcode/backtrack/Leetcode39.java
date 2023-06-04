package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 16:10:06
 */
public class Leetcode39 {
    public static void main(String[] args) {
        int[] candidates=new int[]{2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> trace=new ArrayList<>();
        Set<List<Integer>> result=new HashSet<>();
        backtrack(candidates,target,0,0,trace,result);
        return new ArrayList<>(result);
    }
    public static void backtrack(int[] candidates, int target,int sum,int start,List<Integer> trace,Set<List<Integer>> result){
        if(sum>target)return;
        for(int i=start;i<candidates.length;i++){
            if(trace.size()==0||trace.get(trace.size()-1)<=candidates[i]){
                sum+=candidates[i];
                trace.add(candidates[i]);
                if(target==sum){
                    result.add(new ArrayList<>(trace));
                }
                backtrack(candidates,target,sum,start,trace,result);
                backtrack(candidates,target,sum,start+1,trace,result);
                sum-=candidates[i];
                trace.remove((Object)candidates[i]);
            }
        }
    }
}
