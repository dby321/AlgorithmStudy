package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 19:56:43
 */
public class Leetcode70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        if(n<=2)return -1;
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
