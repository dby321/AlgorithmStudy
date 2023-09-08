package com.xinfei;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/30 16:14:14
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            Integer[] arr=new Integer[2];
            String[] s = sc.nextLine().split(" ");
            arr[0]=Integer.parseInt(s[0]);
            arr[1]=Integer.parseInt(s[1]);
            double capacity=3.14*arr[0]*arr[1]*arr[1];
            if(10000%capacity!=0){
                String s1 = String.valueOf(Math.floor(10000 / capacity)).split("\\.")[0];
                System.out.println(Integer.parseInt(s1)+1);
            }else{
                System.out.println(10000/capacity);
            }

        }
    }
}
