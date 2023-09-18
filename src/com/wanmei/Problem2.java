package com.wanmei;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/26 17:55:58
 */
public class Problem2 {
    int MAX=0;

    public static void main(String[] args) {

    }
    public  int maxScore (int[] cards, int cnt) {
        // write code here
        boolean[] visited=new boolean[cards.length];
        backTrack(cards,cnt,0,0,0,visited);
        return MAX;
    }
    public  void backTrack(int[] cards,int cnt,int start,int nowCnt,int nowSum,boolean[] visited){
        if(nowCnt==cnt){
            if(nowSum%2==0){
                MAX=Math.max(MAX,nowSum);
            }
            return ;
        }
        if(start==cards.length){
            return;
        }
        for(int i=start;i<cards.length;i++){
            if(visited[i]==false){
                visited[i]=true;
                backTrack(cards,cnt,start+1,nowCnt+1,nowSum+cards[i],visited);
                visited[i]=false;
            }
        }
    }

}
