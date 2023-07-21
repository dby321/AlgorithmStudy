package com.leetcode.dandiaozhan;

import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/9 11:04:14
 */
public class Leetcode42 {
    public static void main(String[] args) {
        int[] height=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int result=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<height.length;i++){
            if(height[i]<=height[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                    int mid=stack.peek();
                    stack.pop();
                    if(!stack.isEmpty()){
                        int h=Math.min(height[i],height[stack.peek()])-height[mid];
                        int w=i-stack.peek()-1;
                        result+=h*w;
                    }
                }
                stack.push(i);
            }
        }
        return result;
    }
}
