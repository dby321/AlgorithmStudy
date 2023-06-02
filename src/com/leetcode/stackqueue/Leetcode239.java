package com.leetcode.stackqueue;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 优先级队列不能全部AC
 * 2. 自定义单调队列是最重要的
 * @date 2023/6/2 16:18:11
 */
class MyQueue{
    Deque<Integer> deque=new LinkedList<>();
    void poll(int val){
        if(!deque.isEmpty()&&deque.getFirst()==val){
            deque.removeFirst();
        }
    }
    void add(int val){
        while(!deque.isEmpty()&&deque.getLast()<val){
            deque.removeLast();
        }
        deque.addLast(val);
    }
    int peek(){
        return deque.getFirst();
    }
}
public class Leetcode239 {
    public static void main(String[] args) {
        int[] nums =new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k){
        MyQueue myQueue=new MyQueue();
        for(int i=0;i<k;i++){
            myQueue.add(nums[i]);
        }
        int[] result=new int[nums.length-k+1];
        result[0]=myQueue.peek();
        for(int i=0;i<nums.length-k;i++){
            myQueue.poll(nums[i]);
            myQueue.add(nums[i+k]);
            result[i+1]=myQueue.peek();
        }
        return result;
    }
}
