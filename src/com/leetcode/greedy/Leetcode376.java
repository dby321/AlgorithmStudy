package com.leetcode.greedy;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 15:58:40
 */
public class Leetcode376 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(wiggleMaxLength(nums));
    }
    public static int wiggleMaxLength(int[] nums) {
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            int start=i;
            int count=1;
            boolean upDown=true;
            for(int j=start;j<nums.length-1;j++){
                if(upDown&&nums[j+1]>nums[j]){
                    count++;
                    upDown=!upDown;
                }else if(!upDown&&nums[j+1]<nums[j]){
                    count++;
                    upDown=!upDown;
                }
            }
            maxCount=Math.max(maxCount,count);
            upDown=false;
            count=1;
            for(int j=start;j<nums.length-1;j++){
                if(!upDown&&nums[j+1]<nums[j]){
                    count++;
                    upDown=!upDown;
                }else if(upDown&&nums[j+1]>nums[j]){
                    count++;
                    upDown=!upDown;
                }
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
