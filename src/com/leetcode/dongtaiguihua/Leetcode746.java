package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 20:02:24
 */
public class Leetcode746 {
    public static void main(String[] args) {
        int[] cost=new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        if(cost.length==0)return 0;
        if(cost.length==1)return cost[0];
        if(cost.length==2)return Math.min(cost[0],cost[1]);
        int[] dp=new int[cost.length+1];
        for(int i=2;i<cost.length+1;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }
}
