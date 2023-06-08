package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 14:50:02
 */
public class Leetcode714 {
    public static void main(String[] args) {
        int[] prices=new int[]{1, 3, 2, 8, 4, 9};
        int fee=2;
        System.out.println(maxProfit(prices,fee));
    }
    public static int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp_i_0=0;
        int dp_i_1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i-1==-1){
                dp_i_0=0;
                dp_i_1=-prices[i]-fee;
                continue;
            }
            int temp=dp_i_0;
            dp_i_0=Math.max(temp,dp_i_1+prices[i]);
            dp_i_1=Math.max(dp_i_1,temp-prices[i]-fee);
        }
        return dp_i_0;
    }
}
