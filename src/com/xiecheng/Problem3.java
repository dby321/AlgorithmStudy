package com.xiecheng;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int t = Integer.parseInt(sc.nextLine());
            for(int i=0;i<t;i++){
                String[] s = sc.nextLine().split(" ");
                int n = Integer.parseInt(s[0]);
                int l=Integer.parseInt(s[1]);
                int r=Integer.parseInt(s[2]);
                String[] s1 = sc.nextLine().split(" ");
                int[] arr=new int[n];
                for(int j=0;j<n;j++){
                    arr[j]=Integer.parseInt(s1[j]);
                }
//                System.out.println(Arrays.toString(arr));
                double avg =avg(arr);
                if(avg>=l&&avg<=r){
                    //统计小于l的数有哪些
                    // 加到l需要多少
                    long count=0;
                    for(int k=0;k<n;k++){
                        if(arr[k]<l){
                            count+=l-arr[k];
                        }
                    }
                    System.out.println(count);
                }else{
                    System.out.println(-1);
                }
            }

        }
    }
    public static double avg(int[] arr){
        long count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        return count/(arr.length*1.0);
    }
}
