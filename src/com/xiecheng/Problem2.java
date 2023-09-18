package com.xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    static List<Point> yList=new ArrayList<>();
    static List<Point> oList=new ArrayList<>();
    static List<Point> uList=new ArrayList<>();
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            char[][] chars=new char[n][m];
            for(int i=0;i<n;i++){
                chars[i]=sc.nextLine().toCharArray();
            }
            findYou(chars);
            traverse();
            System.out.println(count);
        }
    }
    public static void findYou(char[][] chars){
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<chars[0].length;j++){
                if(chars[i][j]=='y'){
                    yList.add(new Point(i,j));
                    continue;
                }
                if(chars[i][j]=='o'){
                    oList.add(new Point(i,j));
                    continue;
                }
                if(chars[i][j]=='u'){
                    uList.add(new Point(i,j));
                    continue;
                }
            }
        }
    }
    public static void traverse(){
        for(int i=0;i<yList.size();i++){
            for(int j=0;j<uList.size();j++){
                for(int k=0;k<oList.size();k++){
                    if((yList.get(i).x==uList.get(j).x)&&(yList.get(i).y==oList.get(k).y)){
                        count++;
                        continue;
                    }
                    if((yList.get(i).y==uList.get(j).y)&&(yList.get(i).x==oList.get(k).x)){
                        count++;
                        continue;
                    }
                    if(uList.get(j).x==yList.get(i).x&&uList.get(j).y==oList.get(k).y){
                        count++;
                        continue;
                    }
                    if(uList.get(j).y==yList.get(i).y&&uList.get(j).x==oList.get(k).x){
                        count++;
                        continue;
                    }
                    if(oList.get(k).x==yList.get(i).x&&oList.get(k).y==uList.get(j).y){
                        count++;
                        continue;
                    }
                    if(oList.get(k).y==yList.get(i).y&&oList.get(k).x==uList.get(j).x){
                        count++;
                        continue;
                    }
                }
            }
        }
    }
    static class Point{
        int x;
        int y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
