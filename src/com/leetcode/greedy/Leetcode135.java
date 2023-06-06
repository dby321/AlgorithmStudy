package com.leetcode.greedy;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 19:41:15
 */
public class Leetcode135 {
    public static void main(String[] args) {
        int[] ratings=new int[]{1};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings) {
        int len=ratings.length;
        int[] candyVec=new int[len];
        candyVec[0]=1;
        for(int i=0;i<len-1;i++){
            if(ratings[i]<ratings[i+1]){
                candyVec[i+1]=candyVec[i]+1;
            }else{
                candyVec[i+1]=1;
            }
        }
        for(int i=len-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candyVec[i]=Math.max(candyVec[i],candyVec[i+1]+1);
            }
        }
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=candyVec[i];
        }
        return sum;
    }
}
