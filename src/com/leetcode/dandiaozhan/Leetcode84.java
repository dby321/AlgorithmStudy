package com.leetcode.dandiaozhan;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/9 14:51:22
 */
public class Leetcode84 {
    public static void main(String[] args) {
        int[] heights=new int[]{2,4};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {
        int result=0;
        Stack<Integer> stack=new Stack<>();
        int[] newHeights=new int[heights.length+2];
        System.arraycopy(heights,0,newHeights,1,heights.length);
        stack.push(0);
        for(int i=1;i<newHeights.length;i++){
            if(newHeights[i]>=newHeights[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()&&newHeights[i]<newHeights[stack.peek()]){
                    int mid=stack.peek();
                    stack.pop();
                    if(!stack.isEmpty()){
                        int h=newHeights[mid];
                        int w=i-stack.peek()-1;
                        result=Math.max(result,h*w);
                    }
                }
                stack.push(i);
            }
        }
        return result;
    }
}
