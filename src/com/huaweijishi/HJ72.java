package com.huaweijishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/9 17:56:03
 */
public class HJ72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            //100 元 100只鸡
            for(int i=0;i<=100;i++){
                for(int j=0;j<=100;j++){
                    for(int k=0;k<=100;k++){
                        if(i+j+k==100){
                            if(k%3==0&&5*i+3*j+k/3==100){
                                System.out.println(i+" "+j+" "+k);
                            }
                        }
                    }
                }
            }
            break;
        }
    }
}
