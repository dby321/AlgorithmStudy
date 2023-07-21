package com.leetcode.dandiaozhan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/9 10:52:51
 */
public class Leetcode496 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.fill(result, -1);
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        stack.push(0);
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] <= nums2[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                    if (map.containsKey(nums2[stack.peek()])) {
                        result[map.get(nums2[stack.peek()])] = nums2[i];
                    }
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return result;
    }

}
