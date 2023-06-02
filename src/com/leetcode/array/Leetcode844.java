package com.leetcode.array;

import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 弹栈时记得判空
 * 2. 遍历栈时，先记录栈大小
 * @date 2023/5/28 19:18:28
 */
public class Leetcode844 {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t){
        Stack<Character> stackS=new Stack<>();
        Stack<Character> stackT=new Stack<>();
        int indexS=0;
        while(indexS<s.length()){
            if(s.charAt(indexS)!='#'){
                stackS.push(s.charAt(indexS));
            }else{
                if(!stackS.isEmpty()){
                    stackS.pop();
                }
            }
            indexS++;
        }
        int indexT=0;
        while(indexT<t.length()){
            if(t.charAt(indexT)!='#'){
                stackT.push(t.charAt(indexT));
            }else{
                if(!stackT.isEmpty()) {
                    stackT.pop();
                }
            }
            indexT++;
        }
        if(stackS.size()!=stackT.size()){
            return false;
        }
        int len=stackS.size();
        for(int i=0;i<len;i++){
            if(stackS.pop()!=stackT.pop()){
                return false;
            }
        }
        return true;
    }
}
