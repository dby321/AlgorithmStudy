package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 13:44:26
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            double v = Double.parseDouble(str);
            double num=Math.floor(v);
            if(v-num>=0.5){
                System.out.println((int)Math.ceil(v));
            }else{
                System.out.println((int)Math.floor(v));
            }
        }
    }
}
