package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 14:42:12
 */
public class HJ33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] split = s.split("\\.");
            StringBuilder bigSb=new StringBuilder();
            for(int i=0;i<split.length;i++){
                String binaryString = Long.toBinaryString(Long.parseLong(split[i]));
                StringBuilder sb=new StringBuilder(binaryString);
                for(int j=0;j<8-binaryString.length();j++){
                    sb.insert(0,"0");
                }
                bigSb.append(sb);
            }
            System.out.println(Long.parseLong(bigSb.toString(), 2));
            String s2 = sc.nextLine();
            String binaryString2 = Long.toBinaryString(Long.parseLong(s2));
            StringBuilder bigSb2=new StringBuilder(binaryString2);
            for(int i=0;i<32-binaryString2.length();i++){
                bigSb2.insert(0,"0");
            }
            String temp = bigSb2.toString();
            StringBuilder result=new StringBuilder();
            for(int i=0;i<4;i++){
                String substring=temp.substring(i*8,i*8+8);
//                System.out.println(substring);
                int i1 = Integer.parseInt(substring, 2);
                result.append(i1+".");
            }
            String s1 = result.toString();
            System.out.println(s1.substring(0,s1.length()-1));
        }
    }
}
