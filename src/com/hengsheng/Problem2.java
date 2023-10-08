package com.hengsheng;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/22 18:56:20
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] split = sc.nextLine().split(",");
            int[] arr=new int[split.length];
            for(int i=0;i<split.length;i++){
                arr[i]=Integer.parseInt(split[i]);
            }
            int max=0;
            for(int i=0;i<split.length;i++){
                int start=arr[i];
                for(int j=i+1;j<split.length;j++){
                    if(arr[j]>start){
                        max=Math.max(max,arr[j]-start);
                    }
                }
            }
            System.out.println(max);
        }
    }
}
