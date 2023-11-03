package com.jianxinjinke;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/10/16 11:12:07
 */
public class Problem2_2 {
    public static void main(String[] args) {
        String s="aaaabbbbccccddddeeee";
        System.out.println(Delete_character(s));
    }
    public static int Delete_character(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        HashSet<Integer> set=new HashSet<>();
        int result=0;// 删除字符个数
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                if(!set.contains(count)){
                    set.add(count);
                    count=1;
                }else{
                    while(set.contains(count)){
                        count--;
                        result++;
                    }
                    if(count>0){
                        set.add(count);
                    }
                    count=1;
                }
            }else{
                count++;
            }
        }
        if(count>0){
            while(set.contains(count)){
                count--;
                result++;
            }
        }
        return result;
    }
}
