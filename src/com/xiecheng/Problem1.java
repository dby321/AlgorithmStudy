package com.xiecheng;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    static int count=0;
    static LinkedList<Integer> trace=new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            boolean[] visited=new boolean[n+1];
            traverse(n,visited,0);
            System.out.println(count);
        }
    }
    public static void traverse(int n,boolean[] visited,int nowCount){
        if(nowCount==n){
            boolean flag=true;
            for(int i=0;i<trace.size()-1;i++){
                if(isHeShu(trace.get(i)+trace.get(i+1))){
                    continue;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
                return;
            }else{
                return ;
            }
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                trace.add(i);
                traverse(n,visited,nowCount+1);
                visited[i]=false;
                trace.removeLast();
            }
        }
    }
    //判断是否是合数
    public static boolean isHeShu(int n){
        if(n==3||n==5||n==7||n==11||n==13||n==17||n==19){
            return false;
        }else{
            return true;
        }

    }
}
