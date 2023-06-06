package com.leetcode.greedy;

import java.util.Arrays;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 11:18:29
 */
public class Leetcode452 {
    public static void main(String[] args) {
        int[][] points=new int[4][2];
        points[0]=new int[]{10,16};
        points[1]=new int[]{2,8};
        points[2]=new int[]{1,6};
        points[3]=new int[]{7,12};
        System.out.println(findMinArrowShots(points));
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        int count=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>points[i-1][1]){
                count++;
            }else{
                points[i][1]=Math.min(points[i-1][1],points[i][1]);
            }
        }
        return count;
    }
}
