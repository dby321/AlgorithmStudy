package com.huaweijishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/1 15:51:57
 */
public class HJ27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            Integer n = sc.nextInt();
            List<String> list=new ArrayList<>(n);
            for(int i=0;i<n;i++){
                list.add(sc.next());
            }
            String x=sc.next();
            Integer k=sc.nextInt();
            String encodeX=encode(x);
            for(int i=0;i<n;i++){
                if(encode(list.get(i)).equals(encodeX)&&!list.get(i).equals(encodeX)){

                }
            }
        }
    }
    public static String encode(String str){
        int[] chars=new int[26];
        for (int i = 0; i < str.toCharArray().length; i++) {
            chars[i]++;
        }
        return Arrays.toString(chars);
    }
}
