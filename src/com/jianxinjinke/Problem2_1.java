package com.jianxinjinke;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/10/14 18:57:01
 */
public class Problem2_1 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(Delete_character(s));
    }

    public static int Delete_character(String s) {
        Map<Integer, Character> map = new HashMap<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);//aabbcc
        int index = 1, count = 1;//
        int res = 0;

        for (; index < s.length(); index++) {
            if (chars[index] != chars[index - 1]) {
                if (!map.containsKey(count)) {
                    map.put(count, chars[index - 1]);
                    count = 1;
                } else {
                    while (map.containsKey(count)) {
                        count--;
                        res++;
                    }
                    if (count != 0) {
                        map.put(count, chars[index - 1]);
                    }
                    count = 1;
                }
            } else {
                count++;
            }
        }
        if (count > 0) {
            while (map.containsKey(count)) {
                count--;
                res++;
            }
        }
        return res;
    }
}
