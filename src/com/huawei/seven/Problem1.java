package com.huawei.seven;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/27 18:39:56
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            long     count=0;
            for(int i=1;i<N;i++){
                for(int j=i-1;j>=0;j--){
                    if(arr[j]<=arr[i]){
                        count+=arr[j];
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
