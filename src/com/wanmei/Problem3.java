package com.wanmei;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/26 17:55:58
 */
public class Problem3 {
    static int Max=0;
    public static void main(String[] args) {
        int[] arr=new int[]{6,2,3,4,5,5,5};
        System.out.println(treasureGame(arr));
    }
    public static int treasureGame (int[] treasureValue) {
        // write code here
       treasureGame(treasureValue,0,treasureValue.length);
       return Max;
    }
    public static void treasureGame (int[] treasureValue,int left,int right) {
        if(left+1==right){
            return ;
        }
        // write code here
        int sum=0;
        for(int i=left;i<right;i++){
            sum+=treasureValue[i];
        }
        int othersum=0;
        int min=Integer.MAX_VALUE;
        int mid=0;
        for(int i=left;i<right;i++){
            othersum+=treasureValue[i];
            if(Math.abs(othersum-sum/2.0)<min){
                min=Math.abs(othersum-sum/2);
                mid=i+1;
            }
        }
        int sum1=0;
        for(int j=left;j<mid;j++){
            sum1+=treasureValue[j];
        }
        int sum2=0;
        for(int j=mid;j<right;j++){
            sum2+=treasureValue[j];
        }


        if(sum1>sum2){
            treasureGame(treasureValue, mid, right);
            Max+=sum2;
        }else if(sum2>sum1){
            treasureGame(treasureValue, left, mid);
            Max+=sum1;
        }else{
            int temp=Max;
            treasureGame(treasureValue, mid, right);
            int t1 = Max + sum1;
            Max=temp;
            treasureGame(treasureValue,left,mid);
            int t2=Max+sum2;
            if(t1>t2){
                Max=t1;
            }else{
                Max=t2;
            }
        }
    }
}
