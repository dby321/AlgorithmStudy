package com.xinfei;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/30 16:50:32
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int r = sc.nextInt();
            double result=4/3.0*3.14*Math.pow(r,3);
            System.out.println(result);
        }
    }
}
