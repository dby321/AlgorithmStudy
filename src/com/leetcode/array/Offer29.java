package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 数组长度要判断是否为0
 * @date 2023/5/28 20:27:58
 */
public class Offer29 {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int num=1;
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=num++;
            }
        }
        System.out.println(Arrays.toString(spiralOrder(matrix)));
    }
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0){
            return new int[]{};
        }
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        int turn=Math.min(matrix.length,matrix[0].length)/2;
        int[] arr=new int[matrix.length*matrix[0].length];
        int num=0;
        while(turn>0){
            for(int i=left;i<=right;i++){
                arr[num++]=matrix[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[num++]=matrix[i][right];
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[num++]=matrix[bottom][i];
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[num++]=matrix[i][left];
            }
            left++;
            turn--;
        }
        if(Math.min(matrix.length,matrix[0].length)%2==1){
            if(matrix.length> matrix[0].length){
                for(int i=top;i<=bottom;i++){
                    arr[num++]=matrix[i][left];
                }
            }else{
                for(int i=left;i<=right;i++){
                    arr[num++]=matrix[bottom][i];
                }
            }
        }
        return arr;
    }
}
