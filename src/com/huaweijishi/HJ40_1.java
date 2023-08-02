package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 19:05:57
 */
public class HJ40_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int letterSum = 0;
            int whitespaceSum = 0;
            int digitSum = 0;
            int otherSum = 0;
            for (int i = 0; i < s.length(); i++) {
                String substring = s.substring(i, i + 1);
                if (substring.matches("[a-zA-Z]")) {
                    letterSum++;
                } else if (substring.matches(" ")) {
                    whitespaceSum++;
                } else if(substring.matches("\\d")){
                   digitSum++;
                }else if(substring.matches("[^a-zA-Z0-9 ]")){
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
