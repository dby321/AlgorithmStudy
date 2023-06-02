package com.weizhong.two;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project HuaweiJishi
 * @description
 * @date 2023/4/23 20:05:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int[] energy=new int[n];
            for(int i=0;i<n;i++){
                energy[i]= scanner.nextInt();
            }
            Integer[] score=new Integer[n];
            for(int i=0;i<n;i++){
                score[i]=scanner.nextInt();
            }
            List<Integer[]> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new Integer[]{energy[i],score[i],i});
            }
            Collections.sort(list,(a,b)->b[1].compareTo(a[1]));

            int[] result=new int[n];
            for(int i=0;i<n;i++){
                // 第i个球球
                int score_i=0;
                int m_i=0;
                for(int j=0;j<n;j++){
                    if(j!=i){
                      if(list.get(i)[0]>list.get(j)[0]){
                          score_i+=list.get(j)[1];
                          m_i++;
                          if(m_i==m){
                              break;
                          }
                      }
                    }
                }
               result[list.get(i)[2]]=score_i;
            }
           for(int i=0;i<n;i++){
               System.out.print(result[i]+" ");
           }
        }
    }
}
