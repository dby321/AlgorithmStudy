package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 12:53:04
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String lineStr = sc.nextLine();
            if(lineStr.startsWith("0x")){
                lineStr=lineStr.substring(2);
                int result=0;
                StringBuilder sb=new StringBuilder(lineStr);
                lineStr = sb.reverse().toString();
                for(int i=1;i<=lineStr.length();i++){
                    if(lineStr.charAt(i-1)>='A'&&lineStr.charAt(i-1)<='F'){
                        result+=(lineStr.charAt(i-1)-'A'+10)*Math.pow(16,i-1);
                    }else{
                        result+=Integer.valueOf(lineStr.charAt(i-1)+"")*Math.pow(16,i-1);
                    }
                }
                System.out.println(result);
            }
        }
    }
}
