package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/5 12:45:17
 */
public class HJ62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String binaryString = Integer.toBinaryString(sc.nextInt());
            int count=0;
            for(int i=0;i<binaryString.length();i++){
                if(binaryString.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
