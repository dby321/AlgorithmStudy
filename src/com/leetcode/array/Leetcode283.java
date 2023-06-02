package com.leetcode.array;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/5/28 19:13:51
 */
public class Leetcode283 {
    public static void main(String[] args) {
        int[] nums=new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums){
        int slow=0;
        int fast=0;
        while(fast<nums.length){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
                fast++;
            }else{
                fast++;
            }
        }
        for(int i=slow;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
