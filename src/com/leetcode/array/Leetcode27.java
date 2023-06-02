package com.leetcode.array;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 移除元素，需要比较和目标不同的元素
 * 2. 由于j++，最后返回数组长度不需要+1
 * @date 2023/5/28 18:52:54
 */
public class Leetcode27 {
    public static void main(String[] args) {
        int[] nums=new int[]{3,2,2,3};
        int val=3;
        System.out.println(removeElement(nums,val));

    }
    public static int removeElement(int[] nums, int val){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
