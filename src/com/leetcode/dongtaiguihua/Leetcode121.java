package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 13:10:06
 */
public class Leetcode121 {
    public static void main(String[] args) {
        int[] prices=new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        // n=prices.length,k=1,0-1
        int n=prices.length;
        int k=1;
        int[][][] dp=new int[n][k+1][2];

        for(int i=0;i<n;i++){
            for(int j = k; j >= 1; j--){
                if(i-1==-1){
                    dp[i][k][0]=0;
                    dp[i][k][1]=-prices[i];
                    continue;
                }
                dp[i][k][0]=Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1]=Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
            }
        }
        return dp[n-1][k][0];
    }
}
