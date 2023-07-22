package com.huaweijishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/21 18:59:31
 */
public class HJ17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] split = sc.nextLine().split(";");
            int[] result=new int[2];
//            System.out.println(Arrays.toString(split));
            for(int i=0;i<split.length;i++){
                if(split[i].length()>=2&&(split[i].charAt(0)=='A'||split[i].charAt(0)=='W'||split[i].charAt(0)=='S'||split[i].charAt(0)=='D')){
                    if((split[i].length()==3&&Character.isDigit(split[i].charAt(1))&&Character.isDigit(split[i].charAt(2)))||(split[i].length()==2&&Character.isDigit(split[i].charAt(1)))){
                        if(split[i].charAt(0)=='A'){
                            result[0]-=Integer.parseInt(split[i].substring(1));
                        }else if(split[i].charAt(0)=='W'){
                            result[1]+=Integer.parseInt(split[i].substring(1));
                        }else if(split[i].charAt(0)=='S'){
                            result[1]-=Integer.parseInt(split[i].substring(1));
                        }else {
                            result[0]+=Integer.parseInt(split[i].substring(1));
                        }
                    }
                }
            }
            System.out.println(result[0]+","+result[1]);
        }
    }
}
