package com.leetcode.stackqueue;

import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/2 15:20:45
 */
public class Leetcode1047 {
    public static void main(String[] args) {
        String str="abbaca";
        System.out.println(removeDuplicates(str));
    }
    public static String removeDuplicates(String s) {
        char[] chars=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<chars.length;i++){
            if(!stack.isEmpty()&&stack.peek()==chars[i]){
                stack.pop();
            }else if(stack.isEmpty()|| stack.peek()!=chars[i]){
                stack.push(chars[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
