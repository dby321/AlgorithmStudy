package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 12:10:46
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String lineStr = sc.nextLine();
            lineStr = lineStr.toLowerCase();
            String charStr = sc.nextLine();
            char c1 = charStr.toLowerCase().toCharArray()[0];
            int num=0;
            for(char c:lineStr.toCharArray()){
                if(c1==c){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
