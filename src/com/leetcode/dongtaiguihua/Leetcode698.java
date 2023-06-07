package com.leetcode.dongtaiguihua;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 14:28:57
 */
public class Leetcode698 {
    public static void main(String[] args) {
        int[] nums=new int[]{4, 3, 2, 3, 5, 2, 1};
        int k=4;
        System.out.println(canPartitionKSubsets(nums,k));
    }
    public static boolean canPartitionKSubsets(int[] nums, int k) {

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k!=0)return false;
        int target=sum/k;

        return backtrack(k,nums,0,target,0,0);
    }
    static HashMap<Integer,Boolean> memo=new HashMap<>();
    public static boolean backtrack(int k,int[] nums,int used,int target,int bucket,int start){
        if(k==0){
            return true;
        }
        if(bucket==target){
            boolean res=backtrack(k-1,nums,0,target,0,0);
            memo.put(used,res);
            return res;
        }
        for(int i=start;i<nums.length;i++){
            if((used>>i&1)==1){
                continue;
            }
            if(bucket+nums[i]>target){
                continue;
            }
            bucket+=nums[i];
            used|=1<<i;
            if(backtrack(k,nums,used,target,bucket,i+1)){
                return true;
            }
            used^=1<<i;
            bucket-=nums[i];
        }
        return false;
    }

}
