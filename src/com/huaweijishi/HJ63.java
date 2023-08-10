package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/5 12:48:34
 */
public class HJ63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            int num = sc.nextInt();
            double maxRatio=0;
            String maxStr=str.substring(0,num);
            for(int i=0;i<str.length()-num;i++){
                String substring = str.substring(i, i + num);
                int count=0;
                for(int j=0;j<substring.length();j++){
                    if(substring.charAt(j)=='C'||substring.charAt(j)=='G'){
                        count++;
                    }
                }
                if(count*1.0/substring.length()>maxRatio){
                    maxRatio=count*1.0/substring.length();
                    maxStr=substring;
                }
            }
            System.out.println(maxStr);
        }
    }
}
