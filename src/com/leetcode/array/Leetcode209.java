package com.leetcode.array;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 最小长度大于数组长度时返回0
 * @date 2023/5/28 19:49:22
 */
public class Leetcode209 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums){
        int left=0;
        int right=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            right++;
            while(sum>=target){
                minLen=Math.min(minLen,right-left);
                sum-=nums[left];
                left++;
            }
        }
        return minLen>nums.length?0:minLen;
    }
}
