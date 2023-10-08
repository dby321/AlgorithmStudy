package com.huawei.six;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/27 11:27:03
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int remainder=0;
            int count=0;
            for(int i=0;i<n;i++){
                int tempCarCount=(arr[i]+remainder)/k;
                int newRemainder = (arr[i] + remainder) % k;
                if (tempCarCount == 0 && remainder != 0) {
                    tempCarCount++;
                    newRemainder = 0;
                }
                count+=tempCarCount;
                remainder=newRemainder;
            }
            if(remainder!=0){
                count++;
            }
            System.out.println(count);
        }
    }
}
