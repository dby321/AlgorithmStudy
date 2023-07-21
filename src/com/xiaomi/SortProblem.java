package com.xiaomi;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/13 14:42:33
 */
public class SortProblem {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 9, 23, 14, 5, 7, 20};
        // 方式1
         Arrays.sort(nums);
        // 方式2
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        sort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int start, int end) {
        if (end - start <= 0) return;
        if (end - start == 1) {
            if (nums[start] < nums[end]) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            return;
        }
        int mid = (start + end) / 2;
        sort(nums, start, mid);
        sort(nums, mid, end);
    }
}

