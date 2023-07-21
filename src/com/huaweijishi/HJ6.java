package com.huaweijishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 13:14:26
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            List<Integer> list=new ArrayList<>();
            traverse(num,list);
            if(list.size()==0){
                System.out.println(num);
            }else{
                list.stream().forEach(i->{
                    System.out.print(i+" ");
                });
            }

        }
    }
    public static void traverse(int num,List<Integer> list){
        if(num<=2){
            return ;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(list.contains((Object)num)) {
                    list.remove((Object) num);
                }
                list.add(i);
                list.add(num/i);
                traverse(num/i,list);
                traverse(i,list);
                return ;
            }
        }
    }
}
