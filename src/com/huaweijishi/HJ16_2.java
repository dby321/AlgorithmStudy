package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/21 11:02:18
 */
public class HJ16_2 {
    public static void main(String[] args) {
        // 1. 确定dp定义
        // dp[i][j]表示用可买i个物品，最多j价格，达到的最大满意度
        // 2. 确定初始化
        // dp[0][j]=0,dp[i][0]=0
        // 3. 确定遍历顺序
        // 先遍历物品,再遍历背包
        // 4. 确定递推公式
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int m=sc.nextInt();
            Goods[] goods=new Goods[m+1];
            for(int i=1;i<m+1;i++){
                goods[i]=new Goods();
            }
            for(int i=1;i<=m;i++){
                int v=sc.nextInt();
                int p=sc.nextInt();
                int q=sc.nextInt();
                goods[i].v=v;
                goods[i].p=p;
                goods[i].q=q;
                if(q!=0){
                    if(goods[q].a1==0){
                        goods[q].a1=i;
                    }else{
                        goods[q].a2=i;
                    }
                }
            }
            int[][] dp=new int[m+1][N+1];
            for(int i=1;i<=m;i++){
                for(int j=0;j<=N;j++){
                    dp[i][j]=dp[i-1][j];
                    if(goods[i].q!=0){
                        continue;
                    }
                    if(goods[i].a1!=0&&j>=(goods[goods[i].a1].v+goods[i].v)) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[goods[i].a1].v - goods[i].v] + goods[goods[i].a1].v * goods[goods[i].a1].p + goods[i].v * goods[i].p);
                    }
                    if(goods[i].a2!=0&&j>=(goods[goods[i].a2].v+goods[i].v)){
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[goods[i].a2].v - goods[i].v] + goods[goods[i].a2].v * goods[goods[i].a2].p + goods[i].v * goods[i].p);
                    }
                    if(goods[i].a1!=0&&goods[i].a2!=0&&j>=(goods[goods[i].a1].v+goods[goods[i].a2].v+goods[i].v)){
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - goods[goods[i].a1].v -goods[goods[i].a2].v- goods[i].v] + goods[goods[i].a1].v * goods[goods[i].a1].p+goods[goods[i].a2].v * goods[goods[i].a2].p + goods[i].v * goods[i].p);
                    }
                    if(j>=goods[i].v){
                        dp[i][j]=Math.max(dp[i][j],dp[i-1][j-goods[i].v]+goods[i].v*goods[i].p);
                    }
                }
            }
            System.out.println(dp[m][N]);
        }
    }
    static class Goods{
        private int v;
        private int p;
        private int q;
        private int a1=0;
        private int a2=0;
        public Goods(int v,int p,int q){
            this.v=v;
            this.p=p;
            this.q=q;
        }
        public Goods(){

        }
    }
}
