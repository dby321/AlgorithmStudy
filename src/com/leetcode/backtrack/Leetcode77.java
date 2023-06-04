package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

import static com.huawei.two.Main.traverse;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 14:25:21
 */
public class Leetcode77 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> trace=new ArrayList<>();
        backtrack(1,n,k,trace,list);
        return list;
    }
    public static void backtrack(int start,int end,int k,List<Integer> trace,List<List<Integer>> list){
        if(start>end)return ;
        for(int i=start;i<=end;i++){
            if(!trace.contains(i)){
                if(trace.size()==0||((trace.get(trace.size()-1)<i))) {
                    trace.add(i);
                    k--;
                    if (k == 0) {
                        list.add(new ArrayList<>(trace));
                    }
                    backtrack(start + 1, end, k, trace, list);
                    trace.remove((Object) i);
                    k++;
                }
            }
        }
    }
}
