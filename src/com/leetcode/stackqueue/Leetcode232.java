package com.leetcode.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 遍历进行删除时，要先记录队列长度
 * @date 2023/6/2 14:38:30
 */
public class Leetcode232 {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek());
    }
}
