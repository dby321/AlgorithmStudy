package com.leetcode.dongtaiguihua;

import java.util.PriorityQueue;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 11:13:35
 */
public class Leetcode213 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int[] dp=new int[nums.length];
        return Math.max(robRange(nums,0,nums.length-2),robRange(nums,1,nums.length-1));
    }
    public static int robRange(int[] nums,int start,int end){
        int[] dp=new int[nums.length];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}
