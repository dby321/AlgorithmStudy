package com.huawei.five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/26 15:51:08
 */
public class Problem1 {
    static int count=0;
    public static void main(String[] args) {
        String str="aabbbaccccdddeff";
        int k=4;
        System.out.println(regex(str,k));
        System.out.println(count);
//        System.out.println(traverse(str, k));
//        System.out.println(count);

    }
    public static String regex(String str,int k){
        int tempCount=0;
        String s = str.replaceAll("(.)\\1{"+(k-1)+"}", "#");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                tempCount++;
            }
        }
        count+=tempCount;
        s = s.replaceAll("#", "");
        if(tempCount==0){
            return s;
        }
        return regex(s,k);
    }

//    public static String traverse(String str,int k){
//        int tempCount=0;
//        StringBuilder sb=new StringBuilder(str);
//        List<Integer> list=new ArrayList<>();
//        for(int i=0;i<str.length()-k;i++){
//            boolean flag=true;
//            for(int j=i;j<i+k-1;j++){
//                if(str.charAt(j)!=str.charAt(j+1)){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                for(int j=i;j<i+k;j++){
//                    list.add(j);
//                }
//                tempCount++;
//                i=i+k;
//            }
//        }
//
//        count+=tempCount;
//        for(int i=0;i<list.size();i++){
//            sb.setCharAt(list.get(i),' ');
//        }
//        String string = sb.toString();
//        String s = string.replaceAll(" ", "");
//        if(tempCount==0){
//            return string;
//        }
//        String str2=traverse(s,k);
//        return str2;
//    }
}
