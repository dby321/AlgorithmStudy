package com.huaweijishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 16:25:58
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            for(int i=s.length-1;i>=0;i--){
                System.out.print(s[i]+" ");
            }
        }
    }
}
