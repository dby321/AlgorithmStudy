package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/3 19:45:22
 */
public class HJ52 {
    public static void main(String[] args) {
        // 经典题目
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            int len1 = str1.length();
            int len2 = str2.length();
            int[][] dp=new int[len1+1][len2+1];
            for(int i=0;i<=len1;i++){
                dp[i][0]=i;
            }
            for(int i=0;i<=len2;i++){
                dp[0][i]=i;
            }
            for(int i=1;i<=len1;i++){
                for(int j=1;j<=len2;j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }else{
                        dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    }
                }
            }
            System.out.println(dp[len1][len2]);
        }
    }
}
