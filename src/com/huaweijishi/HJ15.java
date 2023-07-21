package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 16:34:14
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            String s = Integer.toBinaryString(num);
            int count=0;
//            System.out.println(s);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
