package com.labuladong.bfs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode216 {
    static List<List<Integer>> list=new ArrayList<>();
    static LinkedList<Integer> trace=new LinkedList<>();
    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[9];
        for(int i=1;i<=9;i++){
            arr[i-1]=i;
        }
        backTrack(arr,0,k,n,0,0);
        return list;
    }
    public static void backTrack(int[] arr,int start,int k,int n,int nowCount,int nowSum){
        if(nowCount>k){
            return;
        }
        if(nowSum>n){
            return ;
        }
        if(nowCount==k&&nowSum==n){
            list.add(new ArrayList<>(trace));
            return ;
        }
        for(int i=start;i<arr.length;i++){
            trace.add(arr[i]);
            backTrack(arr,i+1,k,n,nowCount+1,nowSum+arr[i]);
            trace.removeLast();
        }
    }
}
