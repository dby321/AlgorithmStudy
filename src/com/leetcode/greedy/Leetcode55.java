package com.leetcode.greedy;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 16:42:56
 */
public class Leetcode55 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,5,0,0};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int coverRange=0;
        for(int i=0;i<=coverRange;i++){
            coverRange=Math.max(coverRange,i+nums[i]);
            if(coverRange>=nums.length-1){
                return true;
            }
        }
        return false;
    }

}
