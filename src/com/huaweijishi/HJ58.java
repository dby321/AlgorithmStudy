package com.huaweijishi;

import java.util.*;

public class HJ58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            List<Integer> list=new ArrayList<>(n);
            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            for(int i=0;i<k;i++){
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
