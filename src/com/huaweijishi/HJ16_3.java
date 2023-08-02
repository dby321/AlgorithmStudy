package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/1 10:59:53
 */

public class HJ16_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int m=sc.nextInt();
            Goods[] goods=new Goods[m+1];
            for(int i=1;i<=m;i++){
                if(goods[i]==null){
                    goods[i]=new Goods();
                }
                goods[i].v=sc.nextInt();
                goods[i].p=sc.nextInt();
                goods[i].q=sc.nextInt();
                if(goods[i].q!=0){
                    if(goods[goods[i].q]==null){
                        goods[goods[i].q]=new Goods();
                    }
                    if(goods[goods[i].q].a1==0) {
                        goods[goods[i].q].a1=i;
                    }else{
                        goods[goods[i].q].a2=i;
                    }
                }
            }
            // 1. 确定问题：01背包问题
            // 2. dp定义：dp[i][j] 用前i个主件和附件及其和j钱数能获得的最大满意度
            // 3. dp初始化：dp初始化为0
            int[][] dp=new int[m+1][N+1];
            // 4. 确定遍历顺序：先遍历物品
            for(int i=1;i<=m;i++){
                // 再遍历背包
                for(int j=0;j<=N;j++){
                    // 5. 确定递推公式和目标：求最值
                    dp[i][j]=dp[i-1][j];
                    if(goods[i].q==0){
                        if(j-goods[i].v>=0){
                            dp[i][j]=Math.max(dp[i][j],dp[i-1][j-goods[i].v]+goods[i].v*goods[i].p);
                        }
                        if(goods[i].a1!=0&&j-goods[i].v-goods[goods[i].a1].v>=0){
                            dp[i][j]=Math.max(dp[i][j],dp[i-1][j-goods[i].v-goods[goods[i].a1].v]+goods[i].v*goods[i].p+goods[goods[i].a1].v*goods[goods[i].a1].p);
                        }
                        if(goods[i].a2!=0&&j-goods[i].v-goods[goods[i].a2].v>=0){
                            dp[i][j]=Math.max(dp[i][j],dp[i-1][j-goods[i].v-goods[goods[i].a2].v]+goods[i].v*goods[i].p+goods[goods[i].a2].v*goods[goods[i].a2].p);
                        }
                        if(goods[i].a1!=0&&goods[i].a2!=0&&j-goods[i].v-goods[goods[i].a1].v-goods[goods[i].a2].v>=0){
                            dp[i][j]=Math.max(dp[i][j],dp[i-1][j-goods[i].v-goods[goods[i].a1].v-goods[goods[i].a2].v]+goods[i].v*goods[i].p+goods[goods[i].a1].v*goods[goods[i].a1].p+goods[goods[i].a2].v*goods[goods[i].a2].p);
                        }
                    }
                }
            }
            System.out.println(dp[m][N]);
        }
    }
    static class Goods{
        public int v;
        public int p;
        public int q;
        public int a1=0;
        public int a2=0;
    }
}
