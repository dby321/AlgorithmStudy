package com.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 14:56:01
 */
public class Leetcode56 {
    public static void main(String[] args) {
        int[][] intervals=new int[5][2];
        intervals[0]=new int[]{2,3};
        intervals[1]=new int[]{4,5};
        intervals[2]=new int[]{6,7};
        intervals[3]=new int[]{8,9};
        intervals[4]=new int[]{1,10};
        int[][] merge = merge(intervals);
        for(int i=0;i<merge.length;i++){
            System.out.println(merge[i][0]+","+merge[i][1]);
        }

    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        int[] item=intervals[0];
        int count=1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>item[1]){
                count++;
                list.add(new int[]{item[0],item[1]});
                item=intervals[i];
            }else{
                item[1]=Math.max(item[1],intervals[i][1]);
            }
        }
        list.add(new int[]{item[0],item[1]});
        int[][] result=new int[list.size()][2];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
