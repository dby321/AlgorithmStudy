package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/3 18:19:03
 */
public class HJ44 {
    static int[][] arr=new int[9][9];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            for(int i=0;i<9;i++){
                for (int j = 0; j < 9; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            backTrack(0,0);
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static boolean backTrack(int startRow,int startCol){
        if(startRow==9&&startCol==0){
            return true;
        }
        if(arr[startRow][startCol]!=0){
            boolean flag=false;
            if(startCol==8){
                startCol=0;
                startRow+=1;
                flag=backTrack(startRow,startCol);
            }else{
                startCol+=1;
                flag=backTrack(startRow,startCol);
            }
            return flag ;
        }
        for(int i=1;i<=9;i++){
            if(judge(arr,startRow,startCol,i)){
                arr[startRow][startCol]=i;
                boolean flag=false;
                if(startCol==8){
                    flag=backTrack(startRow+1,0);
                }else{
                    flag=backTrack(startRow,startCol+1);
                }
                if(flag){
                    return true;
                }
                arr[startRow][startCol]=0;
            }
        }
        return false;
    }
    public static boolean judge(int[][] arr,int row,int col,int num){
        for(int i=0;i<9;i++){
            if(arr[row][i]==num){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(arr[i][col]==num){
                return false;
            }
        }
        int divRow=row/3;
        int divCol=col/3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[divRow*3+i][divCol*3+j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
