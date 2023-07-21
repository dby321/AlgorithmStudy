package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 19:43:40
 */
public class Leetcode583 {
    public static void main(String[] args) {
        String word1="sea";
        String word2="eat";
        System.out.println(minDistance(word1,word2));
    }
    public static int minDistance(String word1, String word2) {
    // 最长公共子序列
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int res=word1.length()+word2.length()-2*dp[word1.length()][word2.length()];
        return res;
    }
}
