package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/5/28 20:10:03
 */
public class Leetcode54 {
    public static void main(String[] args) {
        int m=3;
        int n=4;
        int num=1;
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=num++;
            }
        }
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix){
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        int turn=Math.min(matrix.length,matrix[0].length)/2;
        List<Integer> list=new ArrayList<>();
        while(turn>0){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            turn--;
        }
        if(Math.min(matrix.length,matrix[0].length)%2==1){
            if(matrix.length> matrix[0].length){
                for(int i=top;i<=bottom;i++){
                    list.add(matrix[i][left]);
                }
            }else{
                for(int i=left;i<=right;i++){
                    list.add(matrix[bottom][i]);
                }
            }
        }
        return list;
    }
}
