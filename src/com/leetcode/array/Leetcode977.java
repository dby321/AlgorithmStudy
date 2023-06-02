package com.leetcode.array;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/5/28 19:46:22
 */
public class Leetcode977 {
    public static void main(String[] args) {
        int[] nums=new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
