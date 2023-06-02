package com.leetcode.array;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 返回的是left还是right可以测试得出
 * @date 2023/5/28 13:42:53
 */
public class Leetcode35 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums,target));
    }
    public  static int searchInsert(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
