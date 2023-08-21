package com.meituan;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] s = sc.nextLine().split(" ");
            Long[] arr=new Long[s.length];
            for(int i=0;i<s.length;i++){
                arr[i]=Long.parseLong(s[i]);
            }
            long max=Integer.MIN_VALUE;
            long sum = sum(arr);
            for(int i=0;i<arr.length-1;i++){
                max=Math.max(max,sum(arr,i,i+1,sum));
            }
            max=Math.max(max,sum);
            System.out.println(max);
        }
    }
    public static long sum(Long[] arr,int one,int two,long sum){
        return sum-arr[one]-arr[two]+arr[one]*arr[two];
    }
    public static long sum(Long[] arr){
        long sum=0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        }
        return sum;
    }
}
