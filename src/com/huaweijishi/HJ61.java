package com.huaweijishi;

import java.util.Scanner;

/**
 * 要复习
 */
public class HJ61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int apple = in.nextInt();
            int dish = in.nextInt();


            if (apple == 0 || apple == 1 || dish == 1) {
                System.out.println(1);
                return;
            }

            int[][] dp = new int[apple + 1][dish + 1];

            // 边界条件
            // 1. dp[0][j] = 0;
            // 2. dp[i][0] = 0;
            // 3. dp[i][1] = 1;   只有一个盘子，分配方案只有1种
            for (int i = 0; i <= apple; i++) {
                dp[i][1] = 1;
            }
            for (int j = 0; j <= dish; j++) {
                dp[0][j] = 1;
                dp[1][j] = 1;
            }

            for (int i = 2; i <= apple; i++) {
                for (int j = 2; j <= dish; j++) {
                    if (i < j) {
                        //苹果比盘子数小
                        //比如将2个苹果放入3个盘子，必然会有一个盘子为空，即 {0,x,y}，即其中一位固定为0，不会影响最终的方案数
                        //这和将2个苹果放入2个盘子的方案数目是一样的，即 {x,y}
                        dp[i][j] = dp[i][i];
                    } else {
                        //苹果数目 >= 盘子数, 考虑是否每个盘子都要装苹果
                        //比如将4个苹果放入3个盘子，即 {x,y,z} -> dp[i][j]
                        //如果不装满所有的盘子，相当于盘子数量少一个，即 {x,y,0} -> dp[i][j-1]
                        //如果装满所有的盘子，则所有盘子里面至少有一个苹果，相当于所有盘子里面都去掉一个苹果再进行分配 -> dp[i−j][j]
                        dp[i][j] = dp[i][j - 1] + dp[i - j][j];

                    }
                }
            }

            System.out.println(dp[apple][dish]);
        }
    }
}
