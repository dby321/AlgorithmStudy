package com.dewu;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int x=Integer.parseInt(s[2]);
            // m-n就是可以活动的大小
            int moveSize=m-n;
            if(x==1||x==n){
                double y1;
                // 方程y^2+y-(m-n)=0
                int a=1;
                int b=1;
                int c=-2*moveSize;
                y1=a*c/4.0+Math.sqrt(Math.pow(b,2)-4*a*c)/2.0;
                String[] split = (y1 + 1 + "").split("\\.");
                System.out.println(split[0]);
            }
            else{

            }
        }
    }
}
