package com.webank;

import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    static List<List<Integer>> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            double u=Integer.parseInt(s[1]);
            double v=Integer.parseInt(s[2]);
            String[] s1 = sc.nextLine().split(" ");
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(s1[i]);
            }
            traverse(arr);
//            System.out.println(list);
//            System.out.println(list.size());
            int count=0;

            for(List<Integer> item:list){
                double sum=0;
                for(int j=0;j<item.size();j++){
                    sum+=item.get(j);
                }
                double size=item.size();
                if(sum/size==u/v){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void traverse(int[] arr){
        List<Integer> allList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            allList.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                list.add(allList.subList(i,j));
            }
        }
    }
}
