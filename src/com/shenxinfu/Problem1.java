package com.shenxinfu;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] split = sc.nextLine().split(",");
            int[] arr=new int[split.length];
            for(int i=0;i<split.length;i++){
                arr[i]=Integer.parseInt(split[i]);
            }
            int sum=0;
            int start=1;
            while(start<=arr.length){
                for(int i=0;i+start<=arr.length;i+=1){
                    sum+=sum(arr,i,i+start);
                }
                start+=2;
            }
            System.out.println(sum);
        }
    }
    public static int sum(int[] arr,int start,int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
