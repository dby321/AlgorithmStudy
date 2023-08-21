package com.meituan;

import java.util.Scanner;

public class Problem4 {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            int[] arr=new int[n];
            String[] s = sc.nextLine().split(" ");
            for(int i=0;i<s.length;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            int sum = sum(arr);
            handle(sum,arr,0,0);
            System.out.println(count);
        }
    }
    public static void handle(int sum,int[] arr,int start,int nowSum){
        if(nowSum==sum&&start==arr.length){
            count++;
            return ;
        }
        if(start==arr.length){
            return ;
        }
        for(int j=1;j<=sum-2;j++){
            if(arr[start]!=j&&nowSum+j<=sum){
                // 可行，
                handle(sum,arr,start+1,nowSum+j);
            }
        }
    }
    private static int sum(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
