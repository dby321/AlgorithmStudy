package com.leetcode.greedy;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 18:49:52
 */
public class Leetcode1005 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,-3,-1,5,-4};
        int k=2;
        System.out.println(largestSumAfterKNegations(nums,k));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        boolean zero=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero=true;
            }
            if(nums[i]<0&&k>0){
                nums[i]=-nums[i];
                k--;
            }
            sum+=nums[i];
        }
        if(k!=0&&k%2==0){
            return sum;
        }else if(k!=0&&k%2==1){
            if(zero)return sum;
            else{
                Arrays.sort(nums);
                for(int i=0;i<nums.length;i++){
                    if(nums[i]!=0){
                        sum-=nums[i]*2;
                        return sum;
                    }
                }
            }
        }
        return sum;
    }
}
