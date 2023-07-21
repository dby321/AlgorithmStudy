package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/8 19:59:30
 */
public class Leetcode647 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(countSubstrings(s));
    }
    public static int countSubstrings(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        int result=0;
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
        }
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j-i<=1){
                        dp[i][j]=true;
                        result++;
                    }else if(dp[i+1][j-1]){
                        dp[i][j]=true;
                        result++;
                    }
                }else{
                    dp[i][j]=false;
                }
            }
        }
        return result;
    }
}
