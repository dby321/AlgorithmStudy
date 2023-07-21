package com.leetcode.dandiaozhan;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/9 10:59:38
 */
public class Leetcode503 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        Stack<Integer> stack=new Stack<>();
        Arrays.fill(result,-1);
        stack.push(0);
        for(int i=1;i<n*2;i++){
            if(nums[i%n]<=nums[stack.peek()]){
                stack.push(i%n);
            }else{
                while(!stack.isEmpty()&&nums[i%n]>nums[stack.peek()]){
                    result[stack.peek()]=nums[i%n];
                    stack.pop();
                }
                stack.push(i%n);
            }
        }
        return result;
    }
}
