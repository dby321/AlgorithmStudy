package com.leetcode.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 用到正则表达式
 * @date 2023/6/2 10:57:48
 */
public class Leetcode151 {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s=s.trim();
        List<String> list= Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ",list);
    }
}
