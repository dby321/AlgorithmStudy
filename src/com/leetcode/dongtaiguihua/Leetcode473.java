package com.leetcode.dongtaiguihua;

import java.util.HashMap;

import static com.leetcode.dongtaiguihua.Leetcode698.memo;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 15:58:38
 */
public class Leetcode473 {
    public static void main(String[] args) {
        int[] matchsticks=new int[]{3,3,3,3,4};
        System.out.println(makesquare(matchsticks));
    }
    public static boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int i=0;i<matchsticks.length;i++){
            sum+=matchsticks[i];
        }
        int k=4;
        if(sum%k!=0)return false;
        int target=sum/k;
        return backtrack(matchsticks,0,target,0,0,k);
    }
    static HashMap<Integer,Boolean> memo=new HashMap<>();
    public static boolean backtrack(int[] matchsticks,int used,int target,int start,int bucket,int k){
        if(k==0)return true;
        if(bucket==target){
            return backtrack(matchsticks,used,target,0,0,k-1);
        }
        if(memo.containsKey(used)){
            return memo.get(used);
        }
        for(int i=start;i<matchsticks.length;i++){
            if(((used>>i)&1)==1){
                continue;
            }
            if(bucket+matchsticks[i]>target){
                continue;
            }
            bucket+=matchsticks[i];
            used|=1<<i;
            if(backtrack(matchsticks,used,target,i+1,bucket,k)){
                return true;
            }
            bucket-=matchsticks[i];
            used^=1<<i;
        }
        return false;
    }
}
