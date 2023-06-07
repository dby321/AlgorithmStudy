package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 18:59:57
 */
public class Leetcode322 {
    public static void main(String[] args) {
        int[] coins=new int[]{1,2,5};
        int amount=11;
        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        // 完全背包
        int max=Integer.MAX_VALUE;
        int[] dp=new int[amount+1];
        for(int i=0;i<=amount;i++){
            dp[i]=max;
        }
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
               if(dp[j-coins[i]]!=max){
                   dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
               }
            }
        }
        return dp[amount]==max?-1:dp[amount];
    }
}
