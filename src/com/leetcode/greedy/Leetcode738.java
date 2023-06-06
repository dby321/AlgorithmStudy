package com.leetcode.greedy;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 15:20:18
 */
public class Leetcode738 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(monotoneIncreasingDigits(n));
        System.out.println(Integer.parseInt("009"));
    }
    public static int monotoneIncreasingDigits(int n) {
        String[] strs=String.valueOf(n).split("");
        int start= strs.length;
        for(int i=strs.length-1;i>0;i--){
            if(strs[i].compareTo(strs[i-1])<0){
                strs[i-1]=(Integer.parseInt(strs[i-1])-1)+"";
                start=i;
            }
        }
        for (int i = start; i < strs.length; i++) {
            strs[i] = "9";
        }
        return Integer.parseInt(String.join("",strs));
    }
}
