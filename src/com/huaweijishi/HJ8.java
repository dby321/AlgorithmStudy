package com.huaweijishi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 13:54:06
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        while(sc.hasNext()){
            int num=sc.nextInt();
            for(int i=0;i<num;i++){
                int i1 = sc.nextInt();
                int i2 = sc.nextInt();
                map.put(i1,map.getOrDefault(i1,0)+i2);
            }
            map.entrySet().stream().sorted((e1,e2)->e1.getKey()-e2.getKey()).forEach(entry->{
                System.out.println(entry.getKey()+" "+ entry.getValue());
            });
        }
    }
}
