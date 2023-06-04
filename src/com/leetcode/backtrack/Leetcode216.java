package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/4 15:37:34
 */
public class Leetcode216 {
    public static void main(String[] args) {
        int k=3;
        int n=9;
        System.out.println(combinationSum3(k, n));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> trace = new ArrayList<>();
        backtrack(k, 0, n, 1, trace, list);
        return list;
    }

    public static void backtrack(int k, int nowSum, int n, int start, List<Integer> trace, List<List<Integer>> list) {
        if (k == -1 || start > 9) return;
        for (int i = start; i <= 9; i++) {
            if (trace.size()==0||trace.get(trace.size()-1)<i) {
                nowSum += i;
                k--;
                trace.add(i);
                if (k == 0 && nowSum == n) {
                    list.add(new ArrayList<>(trace));
                }
                backtrack(k, nowSum, n, start + 1, trace, list);
                nowSum -= i;
                k++;
                trace.remove((Object) i);
            }
        }
    }
}
