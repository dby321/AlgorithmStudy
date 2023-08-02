package com.huaweijishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 15:01:37
 */
public class HJ34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
//            System.out.println(Arrays.toString(chars));
            System.out.println(new String(chars));
        }
    }
}
