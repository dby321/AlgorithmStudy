package com.leetcode.greedy;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 需要复习
 * @date 2023/6/5 17:07:32
 */
public class Leetcode45 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        if(nums.length==0||nums.length==1){
            return 0;
        }
        int count = 0;
        int curDistance = 0;
        int nextDistance = 0;
        for (int i = 0; i <= curDistance; i++) {
            nextDistance = Math.max(nextDistance, i + nums[i]);
            if (i == curDistance) {
                count++;
                curDistance = nextDistance;
                if (curDistance >= nums.length - 1) break;
            }
        }
        return count;
    }
}
