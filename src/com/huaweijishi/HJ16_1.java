package com.huaweijishi;

import java.util.Scanner;

public class HJ16_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();

        Goods[] goods = new Goods[m+1];
        for(int i = 1; i <= m; i++){
            goods[i] = new Goods();
        }
        for(int i = 1; i <= m; i++){
            int v = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            goods[i].v = v;
            goods[i].p = p * v;  // 直接用p*v，方便后面计算
            if(q==0){
                goods[i].main = true;
            }else if(goods[q].a1 == 0){
                goods[q].a1 = i;
            }else{
                goods[q].a2 = i;
            }
        }

        int[][] dp = new int[m+1][N+1];
        for(int i = 1; i <= m; i++){
            for(int j = 0; j <= N; j++){
                dp[i][j] = dp[i-1][j];
                if(!goods[i].main){
                    continue;
                }
                if(j>=goods[i].v){
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-goods[i].v] + goods[i].p);
                }
                if(goods[i].a1 != 0 && j >= goods[i].v + goods[goods[i].a1].v){
                    dp[i][j] = Math.max(dp[i][j], dp[i-2][j-goods[i].v - goods[goods[i].a1].v] + goods[i].p + goods[goods[i].a1].p);
                }
                if(goods[i].a2 != 0 && j >= goods[i].v + goods[goods[i].a2].v){
                    dp[i][j] = Math.max(dp[i][j], dp[i-2][j-goods[i].v - goods[goods[i].a2].v] + goods[i].p + goods[goods[i].a2].p);
                }
                if(goods[i].a1 != 0 && goods[i].a2 != 0 &&  j >= goods[i].v + goods[goods[i].a1].v + goods[goods[i].a2].v){
                    dp[i][j] = Math.max(dp[i][j], dp[i-3][j-goods[i].v - goods[goods[i].a1].v - goods[goods[i].a2].v] + goods[i].p + goods[goods[i].a1].p + goods[goods[i].a2].p);
                }
            }
        }
        System.out.println(dp[m][N]);
    }
}

class Goods {
    int v;
    int p;
    boolean main = false;

    int a1 = 0;  //定义附件1的编号
    int a2 = 0;  //定义附件2的编号
}

