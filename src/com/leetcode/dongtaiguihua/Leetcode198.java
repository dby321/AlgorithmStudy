package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 11:07:23
 */
public class Leetcode198 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
