package com.huaweijishi;

import java.util.Scanner;

public class HJ55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i++){
                if(String.valueOf(i).contains("7")){
                    count++;
                }else if(i%7==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
