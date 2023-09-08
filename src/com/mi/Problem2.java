package com.mi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/2 16:43:25
 */
@SuppressWarnings("ALL")
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] split = sc.nextLine().split(",");
            if(split.length==0){
                System.out.println(0);
                continue;
            }
            int[][] arr=new int[split.length][2];
            for(int i=0;i<split.length;i++){
                String[] split1 = split[i].split(":");
                arr[i][0]=Integer.parseInt(split1[0]);
                arr[i][1]=Integer.parseInt(split1[1]);
            }
            Arrays.sort(arr,(a,b)->{
                if(a[1]==b[1]){
                    return a[0]-b[0];
                }
                return b[1]-a[1];
            });
            // 翻转
            arr= reverse(arr);
            int start=arr[0][1];
            for(int i=1;i<arr.length;i++){
                if(start+arr[i][0]>=arr[i][1]){
                    start=start+arr[i][0];
                }else{
                    start=arr[i][0];
                }
            }
            if(start>4800){
                System.out.println(-1);
            }else{
                System.out.println(start);
            }
        }
    }
    public static int[][] reverse(int[][] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int[] temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
}
