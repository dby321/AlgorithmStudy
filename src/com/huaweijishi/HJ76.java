package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/11 19:22:00
 */
public class HJ76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int i = sc.nextInt();
            int start = i * i - i + 1;
            for(int j=0;j<i-1;j++){
                String s = start + "+";
                System.out.print(s);
                start+=2;
            }
            System.out.print(start);
        }
    }
}
