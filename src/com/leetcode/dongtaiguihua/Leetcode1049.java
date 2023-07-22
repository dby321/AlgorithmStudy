package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 16:09:47
 */
public class Leetcode1049 {
    public static void main(String[] args) {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeightII(stones));
    }

        public static int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int i=0;i<stones.length;i++){
            sum+=stones[i];
        }
        int target=sum/2;
        int[] dp=new int[target+1];
        for(int i=0;i<stones.length;i++){
            for(int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-2*dp[target];
    }

}
