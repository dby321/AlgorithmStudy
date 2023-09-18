package com.shenxinfu;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            if(s.matches(s1)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
