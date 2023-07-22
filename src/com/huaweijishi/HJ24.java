package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/22 16:07:39
 */
public class HJ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }
            //任意分割，要前面的队列严格递增，后面的队列严格递减
            int max=0;
            int[] lts1 = LTS(list);
            Collections.reverse(list);
            int[] lts2 = LTS(list);
            for(int i=0;i<num;i++){
                max=Math.max(max,lts1[i]+lts2[num-i-1]-1);
            }
            System.out.println(num-max);
        }
    }
    public static int[] LTS(List<Integer> list){
        int[] dp=new int[list.size()];
        Arrays.fill(dp,1);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<i;j++){
                if(list.get(i)>list.get(j)){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }
}
