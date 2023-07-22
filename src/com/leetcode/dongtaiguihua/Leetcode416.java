package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 14:16:54
 */
public class Leetcode416 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,5,10,6};
        System.out.println(canPartition(nums));
    }

    /**
     * 方法1
     * @param nums
     * @return
     */
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1)return false;
        int target=sum/2;
        int[] dp=new int[target+1];
        for(int i=0;i<nums.length;i++){
            for(int j=target;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        return dp[target]==target;
    }

    /**
     * 方法2
     * @param nums
     * @return
     */
//    public static boolean canPartition(int[] nums){
//        int sum=0;
//        for(int i=0;i<nums.length;i++){
//            sum+=nums[i];
//        }
//        if(sum%2==1)return false;
//        int target=sum/2;
//        int[][] dp=new int[nums.length][target+1];
//        for(int i=nums[0];i<=target;i++){
//            dp[0][i]=nums[0];
//        }
//        for(int i=1;i<nums.length;i++){
//            for(int j=0;j<=target;j++){
//                if(j>=nums[i]){
//                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-nums[i]]+nums[i]);
//                }else{
//                    dp[i][j]=dp[i-1][j];
//                }
//            }
//        }
//        return dp[nums.length-1][target]==target;
//    }
}
