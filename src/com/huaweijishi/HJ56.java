package com.huaweijishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i++){
                if(isWanquanshu(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static boolean isWanquanshu(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        Integer count=0;
        for (Integer integer : list) {
            count+=integer;
        }
        return count==n;
    }
}
