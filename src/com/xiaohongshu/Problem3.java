package com.xiaohongshu;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int k=Integer.parseInt(s[2]);
            String[] aStr = sc.nextLine().split(" ");
            Integer[] a=new Integer[aStr.length];
            for(int i=0;i<a.length;i++){
                a[i]=Integer.parseInt(aStr[i]);
            }
            String[] hStr = sc.nextLine().split(" ");
            Integer[] h=new Integer[aStr.length];
            for(int i=0;i<a.length;i++){
                h[i]=Integer.parseInt(hStr[i]);
            }

            for (int i=0;i<m;i++){
                String[] s1 = sc.nextLine().split(" ");

            }
        }
    }
}
