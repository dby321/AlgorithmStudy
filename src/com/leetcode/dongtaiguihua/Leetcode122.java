package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 14:02:52
 */
public class Leetcode122 {
    public static void main(String[] args) {
        int[] prices=new int[]{1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int k=n/2;
        int dp_i_j_0=Integer.MIN_VALUE;
        int dp_i_j_1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i-1==-1){
                dp_i_j_0=0;
                dp_i_j_1=-prices[i];
                continue;
            }
            int temp=dp_i_j_0;
            dp_i_j_0=Math.max(temp,dp_i_j_1+prices[i]);
            dp_i_j_1=Math.max(dp_i_j_1,temp-prices[i]);

        }
        return dp_i_j_0;
    }
}
