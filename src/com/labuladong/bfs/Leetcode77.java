package com.labuladong.bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dongbinyu
 * 组合问题，元素无重不可重复选
 */
public class Leetcode77 {
    static List<List<Integer>> list=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        backTrack(arr,k,0,0,new ArrayList<>());
        return list;
    }
    public static void backTrack(int[] arr,int k,int start,int nowCount,List<Integer> trace){
        if(nowCount==k){
            list.add(new ArrayList<>(trace));
            return ;
        }
        for(int i=start;i<arr.length;i++){
            trace.add(arr[i]);
            backTrack(arr,k,i+1,nowCount+1,trace);
            trace.remove(trace.size()-1);
        }
    }
}
