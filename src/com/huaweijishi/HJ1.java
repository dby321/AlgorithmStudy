package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 12:06:34
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            String[] split = str.split(" ");
            System.out.println(split[split.length-1].length());
        }
    }
}
