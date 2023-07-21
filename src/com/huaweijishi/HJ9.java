package com.huaweijishi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 16:12:18
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            StringBuilder sb=new StringBuilder(s);
            s=sb.reverse().toString();
            ArrayList<Character> list=new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if(!list.contains(s.charAt(i))){
                    list.add(s.charAt(i));
                }
            }
            list.stream().forEach(c->{
                System.out.print(Integer.valueOf(c+""));
            });
        }
    }
}
