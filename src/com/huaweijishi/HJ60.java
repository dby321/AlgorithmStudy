package com.huaweijishi;

import java.util.Scanner;

public class HJ60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int half=n/2;
            for(int i=half;i>=1;i--){
                if(isSushu(i)&&isSushu(n-i)){
                    System.out.println(i);
                    System.out.println(n-i);
                    break;
                }
            }
        }
    }
    public static boolean isSushu(int n){
        for(int i=2;i<=n/2;i++){
            if((n%i)==0){
                return false;
            }
        }
        return true;
    }
}
