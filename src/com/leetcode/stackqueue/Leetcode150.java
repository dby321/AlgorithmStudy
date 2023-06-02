package com.leetcode.stackqueue;

import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 注意计算顺序
 * @date 2023/6/2 16:01:09
 */
public class Leetcode150 {
    public static void main(String[] args) {
        String[] tokens=new String[]{"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                Integer num1=Integer.valueOf(stack.pop());
                Integer num2=Integer.valueOf(stack.pop());
                stack.push(String.valueOf(num2+num1));
            }else if(token.equals("-")){
                Integer num1=Integer.valueOf(stack.pop());
                Integer num2=Integer.valueOf(stack.pop());
                stack.push(String.valueOf(num2-num1));
            }
            else if(token.equals("/")){
                Integer num1=Integer.valueOf(stack.pop());
                Integer num2=Integer.valueOf(stack.pop());
                stack.push(String.valueOf(num2/num1));
            }
            else if(token.equals("*")){
                Integer num1=Integer.valueOf(stack.pop());
                Integer num2=Integer.valueOf(stack.pop());
                stack.push(String.valueOf(num2*num1));
            }else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }
}
