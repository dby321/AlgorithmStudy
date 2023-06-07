package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 16:32:25
 */
public class Leetcode494 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums,target));
    }
    public static int findTargetSumWays(int[] nums, int target) {
//        假设加法的总和为x，那么减法对应的总和就是sum - x。
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(Math.abs(sum)<Math.abs(target))return 0;
        if((target+sum)%2!=0)return 0;
        int size=(target+sum)/2;
        int[] dp=new int[size+1];
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            for(int j=size;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[size];
    }

}
