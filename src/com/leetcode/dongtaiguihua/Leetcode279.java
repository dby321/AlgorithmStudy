package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 19:12:46
 */
public class Leetcode279 {
    public static void main(String[] args) {
        int n=13;
        System.out.println(numSquares(n));
    }
    public static int numSquares(int n) {
        int[] dp=new int[n+1];
        int max=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            dp[i]=max;
        }
        dp[1]=1;
        dp[0]=0;
        int nums=(int)Math.sqrt(n);
        for(int i=1;i<=nums;i++){
            for(int j=i*i;j<=n;j++){
                if(dp[j-i*i]!=max){
                    dp[j]=Math.min(dp[j],dp[j-i*i]+1);
                }
            }
        }
        return dp[n]==max?-1:dp[n];
    }
}
