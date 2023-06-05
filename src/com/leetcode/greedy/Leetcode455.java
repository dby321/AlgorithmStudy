package com.leetcode.greedy;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 饼干在外层循环
 * 2. 内层循环没找到一个就break,并且start++
 * @date 2023/6/5 15:47:42
 */
public class Leetcode455 {
    public static void main(String[] args) {
        int[] g=new int[]{1,2};
        int[] s=new int[]{1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int start=0;
        for(int i=0;i<s.length;i++){
            for(int j=start;j<g.length;j++){
                if(s[i]>=g[j]){
                    count++;
                    start++;
                    break;
                }
            }
        }
        return count;
    }
}
