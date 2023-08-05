package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/5 14:02:11
 */
public class HJ65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            String temp="";
            if (str1.length() > str2.length()) {
                temp = str1;
                str1 = str2;
                str2 = temp;
            }
            int[][] dp=new int[str1.length()+1][str2.length()+1];
            int max=0;
            int maxIndex=0;
            for(int i=1;i<str1.length()+1;i++){
                for(int j=1;j<str2.length()+1;j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1]+1;
                        if(dp[i][j]>max){
                            max=dp[i][j];
                            maxIndex=i;
                        }
                    }
                }
            }
            System.out.println(str1.substring(maxIndex-max,maxIndex));
        }
    }
}
