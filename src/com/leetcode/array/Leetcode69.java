package com.leetcode.array;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 返回的是left还是right可以测试得出
 * @date 2023/5/28 16:58:31
 */
public class Leetcode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }
    public static int mySqrt(int x){
        int left=1;
        int right=x;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==x){
                return (int)mid;
            }else if(x<mid*mid){
                right=(int)mid-1;
            }else {
                left=(int)mid+1;
            }
        }
        return right;
    }
}
