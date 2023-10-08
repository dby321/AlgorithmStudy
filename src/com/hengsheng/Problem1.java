package com.hengsheng;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/22 18:56:11
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            s1.replaceAll("\\.","[a-z]");
            s1.replaceAll("\\*","[a-z]*");
            if(s.matches(s1)){
                System.out.println(1);
            }else{ 
                System.out.println(0);
            }
        }
    }
}
