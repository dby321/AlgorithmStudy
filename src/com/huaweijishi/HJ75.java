package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/11 19:14:24
 */
public class HJ75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String m = sc.nextLine();
            String n = sc.nextLine();
            int[][] dp=new int[m.length()+1][n.length()+1];
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(m.charAt(i-1)==n.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                }
            }
            int max=0;
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    if(dp[i][j]>max){
                        max=dp[i][j];
                    }
                }
            }
            System.out.println(max);
        }
    }
}
