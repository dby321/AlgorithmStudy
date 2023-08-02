package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/1 18:50:29
 */
public class HJ29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(encode(s));
            String s1 = sc.nextLine();
            System.out.println(decode(s1));
        }
    }
    public static String encode(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.toCharArray().length; i++) {
            if(Character.isLetter(str.charAt(i))){
                if(Character.toLowerCase(str.charAt(i))<='y') {
                    if (Character.isUpperCase(str.charAt(i))) {
                        sb.append((char)Character.toLowerCase(str.charAt(i)+1));
                    } else {
                        sb.append((char)Character.toUpperCase(str.charAt(i) + 1));
                    }
                }else{
                    if (Character.isUpperCase(str.charAt(i))) {
                        sb.append((char)Character.toLowerCase('a'));
                    } else {
                        sb.append(Character.toUpperCase('a'));
                    }
                }
            }else{
                if(str.charAt(i)<='8') {
                    sb.append((char)(str.charAt(i)+1));
                }else{
                    sb.append("0");
                }
            }
        }
        return sb.toString();
    }
    public static String decode(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.toCharArray().length; i++) {
            if(Character.isLetter(str.charAt(i))){
                if(Character.toLowerCase(str.charAt(i))>='b') {
                    if (Character.isUpperCase(str.charAt(i))) {
                        sb.append((char)Character.toLowerCase(str.charAt(i)-1));
                    } else {
                        sb.append((char)Character.toUpperCase(str.charAt(i) -1));
                    }
                }else{
                    if (Character.isUpperCase(str.charAt(i))) {
                        sb.append((char)Character.toLowerCase('z'));
                    } else {
                        sb.append(Character.toUpperCase('z'));
                    }
                }
            }else{
                if(str.charAt(i)>='1') {
                    sb.append((char)(str.charAt(i)-1));
                }else{
                    sb.append("9");
                }
            }
        }
        return sb.toString();
    }
}
