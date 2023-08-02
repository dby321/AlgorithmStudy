package com.huaweijishi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/1 19:13:16
 */
public class HJ30_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String next = sc.next();
            String next1 = sc.next();
            //1.合并
            String str=next+next1;
            //2.排序
            ArrayList<Character> list1 = new ArrayList<>();//存放偶数位字符
            ArrayList<Character> list2 = new ArrayList<>();//存放奇数位字符
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    list1.add(str.charAt(i));
                } else {
                    list2.add(str.charAt(i));
                }
            }
            Collections.sort(list1);
            Collections.sort(list2);
            //重新拼接
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < list1.size();i++) { //list1.size()>=list2.size()
                builder.append(list1.get(i));
                if(i<= list2.size()-1){ //防止越界
                    builder.append(list2.get(i));
                }
            }
            //3.对字符进行转换操作
            for (int i = 0; i < builder.length(); i++) {
                String s = builder.substring(i,i+1);
                if(s.matches("[0-9a-fA-F]")){
                    //把16进制转成10进制，再转成二进制
                    StringBuilder binary = new StringBuilder(Integer.toBinaryString(Integer.parseInt(s,16)));
                    int len = binary.length();
                    for (int j = 0; j <4-len ; j++) { //补零
                        binary.insert(0, "0");
                    }
                    binary = binary.reverse();//翻转
                    int n = Integer.parseInt(binary.toString(), 2); //把二进制转成10进制
                    String hexString = Integer.toHexString(n).toUpperCase();//转成16进制字符串大写
                    builder.replace(i,i+1,hexString);//替换
                }
            }
            System.out.println(builder);
        }
    }
}
