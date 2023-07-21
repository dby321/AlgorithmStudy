package com.huaweijishi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 16:29:30
 */
public class HJ14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num = Integer.parseInt(sc.nextLine());
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<num;i++){
                list.add(sc.nextLine());
            }
            list.stream().sorted((i1,i2)->i1.compareTo(i2)).forEach(i->{
                System.out.println(i);
            });
        }
    }
}
