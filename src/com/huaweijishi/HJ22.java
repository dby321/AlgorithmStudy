package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/22 15:51:53
 */
public class HJ22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int i = sc.nextInt();
            if(i==0){
                break;
            }else{
                System.out.println(i / 2);
            }
        }
    }
}
