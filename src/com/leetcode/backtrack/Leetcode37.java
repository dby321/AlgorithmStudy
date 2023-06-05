package com.leetcode.backtrack;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 12:25:05
 */
public class Leetcode37 {
    public static void main(String[] args) {
        char[][] board=new char[9][9];
        board[0]=new char[]{'5','3','.','.','7','.','.','.','.'};
        board[1]=new char[]{'6','.','.','1','9','5','.','.','.'};
        board[2]=new char[]{'.','9','8','.','.','.','.','6','.'};
        board[3]=new char[]{'8','.','.','.','6','.','.','.','3'};
        board[4]=new char[]{'4','.','.','8','.','3','.','.','1'};
        board[5]=new char[]{'7','.','.','.','2','.','.','.','6'};
        board[6]=new char[]{'.','6','.','.','.','.','2','8','.'};
        board[7]=new char[]{'.','.','.','4','1','9','.','.','5'};
        board[8]=new char[]{'.','.','.','.','8','.','.','7','9'};
        boolean[][] visited=new boolean[9][9];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    visited[i][j]=true;
                }
            }
        }
        solveSudoku(board);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solveSudoku(char[][] board) {
        backtrack(board,0,0);
    }
    public static boolean backtrack(char[][] board,int row,int col){
        if(row==9&&col==0) {
            return true;
        }
        int i=row;
        int j=col;
        if(board[i][j]=='.'){
            for(int k=1;k<=9;k++){
                if(isValid(board,i,j,k)){
                    board[i][j]=Character.forDigit(k,10);
                    if(j<8){
                        j++;
                    }else{
                        i++;
                        j=0;
                    }
                    if(backtrack(board,i,j)){
                        return true;
                    }
                    if(j>=1){
                        j--;
                    }else{
                        i--;
                        j=8;
                    }
                    board[i][j]='.';
                }
            }
            return false;
        }
        else{
            if(j<8){
                j++;
            }else{
                i++;
                j=0;
            }
            if(backtrack(board,i,j)){
                return true;
            }
            return false;
        }
    }
    public static boolean isValid(char[][] board,int row,int col,int k){

        for(int i=0;i<9;i++){
            if(board[row][i]!='.'&&Integer.parseInt(board[row][i]+"")==k){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[i][col]!='.'&&Integer.parseInt(board[i][col]+"")==k){
                return false;
            }
        }
        int ROW=row/3;
        int COL=col/3;
        for(int i=ROW*3;i<ROW*3+3;i++){
            for(int j=COL*3;j<COL*3+3;j++){
                if(board[i][j]!='.'&&Integer.parseInt(board[i][j]+"")==k){
                    return false;
                }
            }
        }
        return true;
    }
}
