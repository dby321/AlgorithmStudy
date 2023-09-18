package com.kedaxunfei;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/26 13:51:56
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int n=Integer.parseInt(s1[0]);
            int l=Integer.parseInt(s1[1]);
            int r=Integer.parseInt(s1[2]);
            int[] arr=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]>=l&&arr[i]<=r&&arr[i]%2==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
