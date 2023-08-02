package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 15:04:29
 */
public class HJ35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int incr=1;
            // arr[0][0] arr[1][0] arr[0][1] arr[2][0] arr[1][1] arr[0][2]
            int[][] arr=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    arr[i-j][j]=incr++;
                }
            }
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]!=0){
                        System.out.print(arr[i][j]+" ");
                    }else{
                        break;
                    }
                }
                System.out.println();
            }
        }
    }
}
