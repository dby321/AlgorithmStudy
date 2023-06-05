package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 11:47:05
 */
public class Leetcode51 {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<Integer> trace = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        backtrack(0, n,visited, trace, result);
        return result;
    }

    public static void backtrack(int row, int n, boolean[][] visited, List<Integer> trace, List<List<String>> result) {
        if (row == n) return;
        for (int col = 0; col < n; col++) {
            if (isValid(visited,row,col,n)) {
                visited[row][col] = true;
                row++;
                trace.add(col);
                if (row == n ) {
                    // 满足条件
                    List<String> list = buildQueen(n, trace);
                    result.add(list);
                }
                backtrack(row, n, visited, trace, result);
                row--;
                visited[row][col] = false;
                trace.remove(trace.size() - 1);
            }
        }
    }
    public static boolean isValid(boolean[][] visited,int row,int col,int n){
        int tempRow=row;
        int tempCol=col;
        while(tempRow>=1&&tempCol>=1){
            tempRow--;
            tempCol--;
            if(visited[tempRow][tempCol]){
                return false;
            }
        }
        tempRow=row;
        tempCol=col;
        while(tempRow>=1&&tempCol<n-1){
            tempRow--;
            tempCol++;
            if(visited[tempRow][tempCol]){
                return false;
            }
        }

        for(int i=0;i<row;i++){
            if(visited[i][col]){
                return false;
            }
        }
        return true;
    }

    public static List<String> buildQueen(int n, List<Integer> trace) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if(trace.get(i)==j){
                    sb.append("Q");
                }else{
                    sb.append(".");
                }
            }
            list.add(sb.toString());
        }
        return list;
    }

}
