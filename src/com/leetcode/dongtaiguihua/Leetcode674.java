package com.leetcode.dongtaiguihua;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 15:16:22
 */
public class Leetcode674 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            if(nums[i]>nums[j]){
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
