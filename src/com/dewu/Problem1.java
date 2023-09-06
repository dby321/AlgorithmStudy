package com.dewu;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            int totalLen=Integer.parseInt(s[0]);
            int strLen=Integer.parseInt(s[1]);
            String str = sc.nextLine();
            boolean flag=false;
            for(int i=0;i<=str.length()-strLen;i++){
                String substring = str.substring(i, i + strLen);
                StringBuilder sb=new StringBuilder(substring);
                if(sb.reverse().toString().equals(substring)){
                    System.out.println(1);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(0);
            }
        }

    }
}
