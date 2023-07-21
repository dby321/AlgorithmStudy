package com.huaweijishi;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 16:20:26
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i))){
                    set.add(s.charAt(i));
                }
            }
            System.out.println(set.size());
        }
    }
}
