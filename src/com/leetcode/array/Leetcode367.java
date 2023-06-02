package com.leetcode.array;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 涉及两个整数相乘的记得用long来存
 * @date 2023/5/28 17:08:09
 */
public class Leetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
    public static boolean isPerfectSquare(int num){
        int left=1;
        int right=num;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(num==mid*mid){
                return true;
            }else if(num<mid*mid){
                right=(int)mid-1;
            }else{
                left=(int)mid+1;
            }
        }
        return false;
    }
}
