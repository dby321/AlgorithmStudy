package com.leetcode.greedy;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 16:31:44
 */
public class Leetcode122 {
    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int count=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                count+=prices[i+1]-prices[i];
            }
        }
        return count;
    }
}
