package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 17:15:02
 */
public class Leetcode474 {
    public static void main(String[] args) {
        String[] strs=new String[]{"10", "0001", "111001", "1", "0"};
        int m=5;
        int n=3;
        System.out.println(findMaxForm(strs,m,n));
    }
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] arr=new int[strs.length][2];
        for(int i=0;i<strs.length;i++){
            for(char c:strs[i].toCharArray()){
                if(c=='1'){
                    arr[i][1]++;
                }else if(c=='0'){
                    arr[i][0]++;
                }
            }
        }
        // 背包是两个维度 m,n
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<strs.length;i++){
            for(int j=m;j>=arr[i][0];j--){
                for(int k=n;k>=arr[i][1];k--){
                    dp[j][k]=Math.max(dp[j][k],dp[j-arr[i][0]][k-arr[i][1]]+1);
                }
            }
        }
        return dp[m][n];
    }
}
