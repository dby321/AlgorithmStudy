package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 15:48:48
 */
public class HJ37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(f(n));
        }
    }
    public static int f(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return  f(n-1)+f(n-2);
    }
}
