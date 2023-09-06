package com.webank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    static int MAX_LENGTH=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=Integer.parseInt(sc.nextLine());
            int[] arr=new int[n];
            String[] s = sc.nextLine().split(" ");
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            List<Integer> list=new ArrayList<>();
            findMaxLength(arr,list);
            System.out.println(MAX_LENGTH);
        }
    }
    public static void findMaxLength(int[] arr,List<Integer> list){
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                if(list.size()>MAX_LENGTH){
                    MAX_LENGTH=list.size();
                }
            }else{
               break;
            }
        }
    }
}
