package com.leetcode.array;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 前一个和后一个比较时，遍历只能遍历到倒数第二个
 * 2. 前一个和后一个不同时，只记录了前一个，循环完后需要处理最后一个
 * 3. 返回数组长度注意是否+1
 * @date 2023/5/28 18:58:27
 */
public class Leetcode26 {
    public static void main(String[] args) {
        int[] nums=new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int slow=0;
        int fast=0;
        while(fast<nums.length-1){
            if(nums[fast]==nums[fast+1]){
                fast++;
            }else{
                nums[slow]=nums[fast];
                slow++;
                fast++;
            }
        }
        nums[slow]=nums[fast];
        return slow+1;
    }
}
