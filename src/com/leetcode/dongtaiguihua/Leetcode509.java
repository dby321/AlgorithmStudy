package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 19:54:45
 */
public class Leetcode509 {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
    }
}
