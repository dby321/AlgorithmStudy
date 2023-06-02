package com.leetcode.stackqueue;

import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/2 15:10:19
 */
public class Leetcode20 {
    public static void main(String[] args) {
        String s="";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        char[] chars=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:chars){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else if(c==')'){
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(c==']'){
                if(!stack.isEmpty()&&stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
            else if(c=='}'){
                if(!stack.isEmpty()&&stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
