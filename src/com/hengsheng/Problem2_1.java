package com.hengsheng;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/22 18:56:20
 */
public class Problem2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] split = sc.nextLine().split(",");
            int[] arr=new int[split.length];
            for(int i=0;i<split.length;i++){
                arr[i]=Integer.parseInt(split[i]);
            }
            int n=arr.length;
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                }else if(arr[i]-min>max){
                    max=arr[i]-min;
                }
            }
            System.out.println(max);
        }
    }
}
