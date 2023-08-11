package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/9 16:29:44
 */
public class HJ69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = Integer.parseInt(sc.nextLine());
            int y = Integer.parseInt(sc.nextLine());
            int z = Integer.parseInt(sc.nextLine());
            int[][] arr1=new int[x][y];
            int[][] arr2=new int[y][z];
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<y;i++){
                for(int j=0;j<z;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }
            int[][] result=new int[x][z];
            for(int i=0;i<x;i++){
                for(int j=0;j<z;j++){
                    result[i][j]=0;
                    for(int k=0;k<y;k++){
                        result[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for(int i=0;i<x;i++){
                for(int j=0;j<z;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
