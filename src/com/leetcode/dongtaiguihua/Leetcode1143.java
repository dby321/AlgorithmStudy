package com.leetcode.dongtaiguihua;

import java.nio.file.ClosedWatchServiceException;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 15:48:07
 */
public class Leetcode1143 {
    public static void main(String[] args) {
        String text1="abc";
        String text2="def";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int text1_len = text1.length();
        int text2_len=text2.length();
        int[][] dp=new int[text1_len+1][text2_len+1];
        int res=0;
        for(int i=1;i<=text1_len;i++){
            for(int j=1;j<=text2_len;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    res=Math.max(res,dp[i][j]);
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return res;
    }
}
