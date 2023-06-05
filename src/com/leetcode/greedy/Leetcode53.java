package com.leetcode.greedy;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 16:14:04
 */
public class Leetcode53 {
    public static void main(String[] args) {
        int[] nums=new int[]{5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
            max=Math.max(count,max);
            if(count<=0){
                count=0;
            }
        }
        return max;
    }
}
