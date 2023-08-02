package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 19:05:57
 */
public class HJ40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int letterSum=0;
            int whitespaceSum=0;
            int digitSum=0;
            int otherSum=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(Character.isLetter(c)){
                    letterSum++;
                }else if(Character.isWhitespace(c)){
                    whitespaceSum++;
                }else if(Character.isDigit(c)){
                    digitSum++;
                }else {
                    otherSum++;
                }
            }
            System.out.println(letterSum);
            System.out.println(whitespaceSum);
            System.out.println(digitSum);
            System.out.println(otherSum);
        }
    }
}
