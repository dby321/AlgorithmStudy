package com.huaweijishi;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 12:43:24
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            int num = str.length() / 8;
            for(int i=0;i<num;i++){
                String substr=str.substring(i*8,i*8+8);
                System.out.println(substr);
            }
            //余数
            int yushu = str.length() % 8;
            if(yushu==0){
                continue;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<8-yushu;i++){
                sb.append("0");
            }
            System.out.println(str.substring(num*8)+sb.toString() );
        }
    }
}
