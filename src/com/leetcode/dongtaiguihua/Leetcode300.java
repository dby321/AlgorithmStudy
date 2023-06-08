package com.leetcode.dongtaiguihua;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 15:05:48
 */
public class Leetcode300 {
    public static void main(String[] args) {
        int[] nums=new int[]{10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }

            }
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
