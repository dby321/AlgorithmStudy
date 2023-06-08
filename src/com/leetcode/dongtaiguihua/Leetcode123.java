package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 14:19:11
 */
public class Leetcode123 {
    public static void main(String[] args) {
        int[] prices=new int[]{1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int k=2;
        int[][][] dp=new int[n][k+1][2];
        for(int i=0;i<n;i++){
            for(int j=k;j>=1;j--){
                if(i-1==-1){
                    dp[i][j][0]=0;
                    dp[i][j][1]=-prices[i];
                    continue;
                }
                dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[n-1][k][0];
    }
}
