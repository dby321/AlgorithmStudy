package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 15:59:42
 */
public class Leetcode1035 {
    public static void main(String[] args) {
        int[] nums1=new int[]{1,4,2};
        int[] nums2=new int[]{1,2,4};
        System.out.println(maxUncrossedLines(nums1,nums2));
    }
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2=nums2.length;
        int[][] dp=new int[len1+1][len2+1];
        int res=0;
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    res=Math.max(res,dp[i][j]);
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
