package com.weizhong.one;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project HuaweiJishi
 * @description
 * @date 2023/4/23 18:49:33
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
        Scanner scanner =new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int[] arrA=new int[N];
            int[] arrB=new int[N];
            boolean flag=false;
            for(int i=0;i<N;i++){
                if(scanner.hasNextInt()){
                    arrA[i]=scanner.nextInt();
                }else{
                    flag=true;
                }
            }
            for(int j=0;j<N;j++){
                if(scanner.hasNextInt()){
                    arrB[j]=scanner.nextInt();
                }else {
                    flag = true;
                }
            }
            int L_A=0;
            if(scanner.hasNextLong()){
                L_A=scanner.nextInt();
            }
            else{
                flag=true;
            }
            int R_A=0;
            if(scanner.hasNextLong()){
                R_A=scanner.nextInt();
            }
            else{
                flag=true;
            }
            int L_B=0;
            if(scanner.hasNextLong()){
                L_B=scanner.nextInt();
            }
            else{
                flag=true;
            }
            int R_B=0;
            if(scanner.hasNextLong()){
                R_B=scanner.nextInt();
            }else{
                flag=true;
            }
            if(flag){
                System.out.println(0);
                return ;
            }
            // 遍历所有A的区间，判断是否在[L_A,R_A]
            int count=0;
            int sum1=0;
            int sum2=0;
            for(int i=0;i<N;i++){
                for(int j=i;j<N;j++){
                   sum1=sum1+arrA[j];
                   sum2=sum2+arrB[j];
                    if(sum1>=L_A&&sum1<=R_A&&sum2>=L_B&&sum2<=R_B){
                        count++;
                    }
                }
                sum1=0;
                sum2=0;
            }

            System.out.println(count);
        }
    }

    private static long sum(long[] arrA, int i, int j) {
        long count=0;
        for(int k=i;k<=j;k++){
            count+=arrA[k];
        }
        return count;
    }
}
