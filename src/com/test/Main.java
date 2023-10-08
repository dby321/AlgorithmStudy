package com.test;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/21 15:06:15
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void shuffle(int[] arr){
        if(arr==null||arr.length==0||arr.length==1){
            return ;
        }
        for(int i=0;i<arr.length;i++){
            int random = (int) (Math.random()*arr.length);
            swap(arr,i,random);
        }
    }
    // 最好情况O(N) 最坏情况O(N^2) 平均情况O(N^2) 稳定算法
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length==0||arr.length==1){
            return ;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // 不稳定，最好O(nlogn) 最差O(n^2)
    public static void quickSort(int[] arr,int start,int end){
        if(start<0||end>=arr.length){
            return ;
        }
        if(start>=end){
            return ;
        }
        int left=start;
        int right=end;
        int temp=arr[left];
        while(left<right){
            while(left<right&&arr[right]>=temp){
                right--;
            }
            arr[left]=arr[right];
            while(left<right&&arr[left]<=temp){
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=temp;
        quickSort(arr,start,left-1);
        quickSort(arr,left+1,end);
    }
    // 不稳定，O(n^2)
     public static void insertSort(int[] arr) {
         if (arr == null || arr.length == 0 || arr.length == 1) {
             return;
         }
         for (int i = 1; i < arr.length; i++) {
             int temp = arr[i];
             int j = i - 1;
             while (j >= 0 && temp < arr[j]) {
                 arr[j + 1] = arr[j];
                 j--;
             }
             arr[j + 1] = temp;
         }
     }
     

}
