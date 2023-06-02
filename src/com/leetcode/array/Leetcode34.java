package com.leetcode.array;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 分别求左边界和右边界，没有左边界或没有右边界都属于没找到，返回new int[]{-1,-1},左右边界可以初始化为-2
 * 2. 求出的边界是开区间，如果相差大于1，才算找到了，返回时要变换成闭区间
 * 3. 如果相差小于1，说明没找到，返回new int[]{-1,-1}
 * @date 2023/5/28 13:50:37
 */
public class Leetcode34 {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        int target = 0;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        if (leftBorder == -2 || rightBorder == -2) return new int[]{-1, -1};
        if(rightBorder-leftBorder>1)return new int[]{leftBorder+1,rightBorder-1};
        return new int[]{-1,-1};
    }

    private static int getRightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int rightBorder = -2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                left = mid + 1;
                rightBorder = left;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
                rightBorder = left;
            }
        }
        return rightBorder;
    }

    private static int getLeftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                right = mid - 1;
                leftBorder = right;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
                leftBorder = right;
            }
        }
        return leftBorder;
    }


}
