package com.leetcode.array;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/5/28 13:31:35
 */
public class Leetcode704 {
    public static void main(String[] args) {
        int[] nums=new int[]{5};
        int target=5;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
}
