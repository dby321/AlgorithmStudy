package com.leetcode.dongtaiguihua;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/6 20:16:00
 */
public class Leetcode63 {
    public static void main(String[] args) {
        int[][] obstacleGrid=new int[3][3];
        obstacleGrid[0]=new int[]{0,0,0};
        obstacleGrid[1]=new int[]{0,1,0};
        obstacleGrid[2]=new int[]{0,0,0};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1){
                break;
            }else{
                dp[i][0]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==1){
                break;
            }else{
                dp[0][i]=1;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
