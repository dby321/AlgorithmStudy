package com.huawei.one;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static  void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String firstLine=sc.nextLine();
            String secondLine=sc.nextLine();
            Integer target=Integer.valueOf(secondLine);
            String[] rArr = firstLine.split(" ");
            Integer[] rIntArr=new Integer[rArr.length];
            for(int i=0;i<rIntArr.length;i++){
                rIntArr[i]=Integer.valueOf(rArr[i]);
            }
        System.out.println(Arrays.toString(rIntArr));
            BigInteger sum=new BigInteger("0");
            long max=Integer.MIN_VALUE;
            for(int i=0;i<rIntArr.length;i++){
                sum=sum.add(new BigInteger(String.valueOf(rIntArr[i])));
                max=Math.max(max,rIntArr[i]);
            }
//        System.out.println(sum.intValue());
            if(sum.compareTo(new BigInteger(target+""))<=0){
                System.out.println(-1);
            }else{
                boolean flag=true;
                while(flag){
                    BigInteger sum2=new BigInteger("0");
                    for(int i=0;i<rIntArr.length;i++){
                        if(rIntArr[i]>max){
                            sum2=sum2.add(new BigInteger(max+""));
                        }else{
                            sum2=sum2.add(new BigInteger(rIntArr[i]+""));
                        }
                    }
                    if(max>=0&&sum2.compareTo(new BigInteger(target+""))<0){
                        System.out.println(max);
                        flag=false;
                    }
                    max--;
                }
            }
        }
    }
}