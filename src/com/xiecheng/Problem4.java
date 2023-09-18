package com.xiecheng;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        //前缀和
        int[] oneArr=new int[s.length()];
        int[] zeroArr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(i==0){
                if(s.charAt(i)=='1'){
                    oneArr[i]=1;
                }
                if(s.charAt(i)=='0'){
                    zeroArr[i]=1;
                }
                continue;
            }
            if(s.charAt(i)=='1'){
                oneArr[i]=oneArr[i-1]+1;
            }
            if(s.charAt(i)=='0'){
                zeroArr[i]=zeroArr[i-1]+1;
            }
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(zeroArr[j]-zeroArr[i]>oneArr[j]-oneArr[i]){
                    boolean flag=true;
                    for(int k=i+1;k<=j;k++){
                        if(zeroArr[k]-zeroArr[i]>oneArr[k]-oneArr[i]){
                            continue;
                        }else{
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
