package com.mi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/2 16:23:53
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int freq = Integer.parseInt(sc.nextLine());
            String[] split = sc.nextLine().split(",");
            int[][] secondGroup=new int[split.length][2];
            for(int i=0;i<split.length;i++){
                String[] split1 = split[i].split(":");
                secondGroup[i][0]=Integer.parseInt(split1[0]);
                secondGroup[i][1]=Integer.parseInt(split1[1]);
            }
            double MIN_VALUE=Double.MAX_VALUE;
            double result=0;
            int resultCount=1;
            for(int i=0;i<split.length;i++){
                if(Math.abs(freq-secondGroup[i][0])<MIN_VALUE){
                    result=secondGroup[i][1];
                    resultCount=1;
                    MIN_VALUE=Math.abs(freq-secondGroup[i][0]);
                }else if(Math.abs(freq-secondGroup[i][0])==MIN_VALUE){
                    result+=secondGroup[i][1];
                    resultCount=2;
                }
            }
            System.out.println(result/resultCount);
        }
    }
}
