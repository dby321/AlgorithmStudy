package com.leetcode.string;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/2 11:15:19
 */
public class Offer58 {
    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;
        System.out.println(reverseLeftWords(s,k));
    }
    public static String reverseLeftWords(String s, int n){
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb1=new StringBuilder(sb.substring(0,n));
        sb1=sb1.reverse();
        StringBuilder sb2=new StringBuilder(sb.substring(n,s.length()));
        sb2=sb2.reverse();
        return sb1.append(sb2).reverse().toString();
    }

}
