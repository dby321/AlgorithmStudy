package com.huawei.four;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/20 20:11:26
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[][] arr=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int[][] dp=new int[m][n];
            for(int i=0;i<m;i++){
                Arrays.fill(dp[i],m*n);
            }
            for(int i=0;i<m;i++){
                if(arr[i][0]==1){
                    dp[i][0]=0;
                }
            }
            int a=0;
            for(int i=0;i<n;i++){
                if(arr[0][i]==1){
                    dp[0][i]=a;
                    a++;
                }else{
                    // 设为不可达
                    break;
                }
            }
            for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    if(arr[i][j]==1){
                        if(arr[i][j-1]==1){
                            dp[i][j]=Math.min(dp[i][j-1]+1,dp[i][j]);
                        }
                    }else{
                        dp[i][j]=m*n;
                    }
                }
            }
            int minValue=m*n;
            for(int i=0;i<m;i++){
                minValue=Math.min(minValue,dp[i][n-1]);
            }
            if(minValue==m*n){
                System.out.println(-1);
            }else{
                System.out.println(minValue);
            }
        }
    }
}
