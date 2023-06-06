package com.leetcode.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/5 19:18:26
 */
public class Leetcode134 {
    public static void main(String[] args) {
        int[] gas=new int[]{2,3,4};
        int[] cost=new int[]{3,4,3};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int start=0;
        int curSum=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            curSum+=gas[i]-cost[i];
            if(curSum<0){
                start=i+1;
                curSum=0;
            }
        }
        if(total<0)return -1;
        return start;
    }
}
