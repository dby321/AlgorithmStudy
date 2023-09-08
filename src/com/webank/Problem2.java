package com.webank;

import java.util.*;

public class Problem2 {
    static int MIN_SIZE=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            HashSet<Integer> set=new HashSet<>();
            traverse(arr,set);
            System.out.println(MIN_SIZE);
        }
    }
    public static void traverse(int[] arr,HashSet<Integer> set){
        List<Integer> otherList=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                otherList.add(arr[i]);
            }
        }
        for(int i=0;i<otherList.size();i++){
            for(int j=1;j<100000;j++){
                if(!set.contains(otherList.get(i)+j)){
                    MIN_SIZE+=j;
                    set.add(otherList.get(i)+j);
                    break;
                }
            }
        }
    }
}
