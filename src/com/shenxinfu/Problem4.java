package com.shenxinfu;

import java.util.Scanner;

public class Problem4 {
    static int MIN=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            traverse(s,0,0);
            System.out.println(MIN);
        }
    }
    public static void traverse(String s,int start,int nowCount){
        if(start>=s.length()){
            MIN=Math.min(MIN,nowCount-1);
            return ;
        }
        for(int step=1;start+step<=s.length();step++){
            if(isHuiwen(s.substring(start,start+step))){
                traverse(s,start+step,nowCount+1);
            }
        }
    }
    public static boolean isHuiwen(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
