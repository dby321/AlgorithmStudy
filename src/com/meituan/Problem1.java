package com.meituan;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
           int q=Integer.parseInt(sc.nextLine());
           for(int i=0;i<q;i++){
               String[] s = sc.nextLine().split(" ");
               int m=Integer.parseInt(s[0]);
               int x=Integer.parseInt(s[1]);
               System.out.println((x-1)%m+1);
           }
        }
    }
}
