package com.bilibili;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=Integer.parseInt(sc.nextLine());
            int[] arr=new int[n];
            String[] s = sc.nextLine().split(" ");
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            int[] time=new int[2];
            int waitTime=0;
            if(n==1){
                System.out.println(arr[0]);
            }else if(n==2){
                System.out.println(Math.max(arr[0],arr[1]));
            }
            time[0]=arr[0];
            time[1]=arr[1];
            int i=2;
            while(i!=n){
                time[0]--;
                time[1]--;
                waitTime++;
                if(time[0]==0){
                    time[0]=arr[i];
                    i++;
                }
                if(time[1]==0&&i!=n){
                    time[1]=arr[i];
                    i++;
                }
            }
            waitTime+=Math.max(time[0],time[1]);
            System.out.println(waitTime);

        }
    }
}
