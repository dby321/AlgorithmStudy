package com.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 12:03:11
 */
public class Leetcode763 {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }

    public static List<Integer> partitionLabels(String s) {
        int[] edge = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            edge[chars[i] - 'a'] = i;
        }
        int left=0;
        int right=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            right=Math.max(right,edge[chars[i]-'a']);
            if(i==right){
                list.add(right-left+1);
                left=i+1;
            }
        }
        return list;
    }
}
