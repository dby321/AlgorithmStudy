package com.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 11:01:45
 */
public class Leetcode406 {
    public static void main(String[] args) {
        int[][] people = new int[6][2];
        people[0]=new int[]{7,0};
        people[1]=new int[]{4,4};
        people[2]=new int[]{7,1};
        people[3]=new int[]{5,0};
        people[4]=new int[]{6,1};
        people[5]=new int[]{5,2};
        int[][] ints = reconstructQueue(people);
        for(int i=0;i<ints.length;i++){
            for(int j=0;j<ints[0].length;j++){
                System.out.print(ints[i][j]+",");
            }
            System.out.println();
        }
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0])return a[1]-b[1];
            return b[0]-a[0];
        });
        LinkedList<int[]> list=new LinkedList<>();
        for(int[] p:people){
            list.add(p[1],p);
        }
        return list.toArray(new int[people.length][]);
    }
}
