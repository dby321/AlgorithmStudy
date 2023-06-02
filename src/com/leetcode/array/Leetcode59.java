package com.leetcode.array;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/5/28 19:57:51
 */
public class Leetcode59 {
    public static void main(String[] args) {
        int[][] arr = generateMatrix(4);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int turn = n / 2;
        int num = 1;
        int[][] arr = new int[n][n];
        while (turn > 0) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = num++;
            }
            left++;
            turn--;
        }
        if(n%2==1){
            arr[n/2][n/2]=num++;
        }
        return arr;
    }

}
