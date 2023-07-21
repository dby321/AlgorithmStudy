package com.huaweijishi;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 12:16:20
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            TreeSet<Integer> set=new TreeSet<>();
            int num = sc.nextInt();
            for(int i=0;i<num;i++){
                int i1 = sc.nextInt();
                set.add(i1);
            }
            set.stream().forEach(System.out::println);
        }
    }
}
