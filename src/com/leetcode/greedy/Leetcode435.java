package com.leetcode.greedy;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 11:50:45
 */
public class Leetcode435 {
    public static void main(String[] args) {
        int[][] intervals=new int[4][2];
        intervals[0]=new int[]{1,2};
        intervals[1]=new int[]{2,3};
        intervals[2]=new int[]{3,4};
        intervals[3]=new int[]{1,3};
        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals){
        Arrays.sort(intervals,(a, b)->{
            return Integer.compare(a[0],b[0]);
        });
        int count=1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[i-1][1]){
                count++;
            }else{
                intervals[i][1]=Math.min(intervals[i-1][1],intervals[i][1]);
            }
        }
        return intervals.length-count;
    }
}
