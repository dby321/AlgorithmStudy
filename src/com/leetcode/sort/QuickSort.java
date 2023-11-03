package com.leetcode.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/10/15 13:01:12
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 3, 2, 5 };
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] arr,int left,int right){
        if(left>=right)return;
        int i=patition(arr,left,right);
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
    public static int patition(int[] arr,int left,int right){
        int i=left,j=right;
        while(i<j){
            while(i<j&&arr[j]>=arr[left])j--;
            while(i<j&&arr[i]<=arr[left])i++;
            swap(arr,i,j);
        }
        swap(arr,i,left);
        return i;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
