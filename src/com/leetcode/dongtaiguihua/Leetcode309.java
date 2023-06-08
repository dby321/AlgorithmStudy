package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 14:29:29
 */
public class Leetcode309 {
    public static void main(String[] args) {
        int[] prices=new int[]{1,2,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int dp_i_0=0;
        int dp_i_1=Integer.MIN_VALUE;
        int dp_pre_i_0=0;
        for(int i=0;i<n;i++){
            if(i==0){
                dp_i_0=0;
                dp_i_1=-prices[i];
                continue;
            }
            if(i==1){
                dp_i_0=prices[i]>prices[i-1]?prices[i]-prices[i-1]:0;
                dp_i_1=Math.max(-prices[i-1],-prices[i]);
                continue;
            }
            int temp=dp_i_0;
            dp_i_0=Math.max(dp_i_0,dp_i_1+prices[i]);
            dp_i_1=Math.max(dp_i_1,dp_pre_i_0-prices[i]);
            dp_pre_i_0=temp;
        }
        return dp_i_0;
    }
}
