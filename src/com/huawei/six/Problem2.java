package com.huawei.six;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/27 11:27:03
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int M=sc.nextInt();
            int N=sc.nextInt();
            int[][] arr=new int[N][2];
            for(int i=0;i<N;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            boolean[] visited=new boolean[M];
            int count=0;
            int[][] arr2=new int[M][M];
            for(int i=0;i<N;i++){
                arr2[arr[i][0]][arr[i][1]] = 1;
                arr2[arr[i][1]][arr[i][0]] = 1;
            }
            for(int i=0;i<M;i++){
                if(visited[i]){
                    continue;
                }
                visited[i]=true;
                dfs(visited,arr2,i);
                count++;
            }
            System.out.println(count);
        }
    }
    public static void dfs(boolean[] visited,int[][] arr2,int i){
        for(int j=0;j<arr2.length;j++){
            if(arr2[i][j]==1&&!visited[j]){
                visited[j]=true;
                dfs(visited,arr2,j);
            }
        }
    }

}
