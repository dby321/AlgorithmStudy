package com.huaweijishi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 16:49:24
 */
public class HJ16 {
    static Integer max=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int money=sc.nextInt();
            int N=sc.nextInt();
            List<int[]> list= new ArrayList<>();
            for(int i=0;i<N;i++){
                list.add(new int[]{sc.nextInt(),sc.nextInt(), sc.nextInt()});
            }
            List<Integer> trace=new ArrayList<>();
            HashMap<Integer,Integer> map=new HashMap<>();
            Integer follow=0;
            traverse(list,money,trace,map,follow);
            System.out.println(max);
        }
    }
    public static void traverse(List<int[]> list,int money,List<Integer> trace,HashMap<Integer,Integer> map,int follow){
        for(int i=0;i<list.size();i++){
            if(!trace.contains(i+1)){
                if(list.get(i)[2]==0&&money-list.get(i)[0]>=0){
                    trace.add(i+1);
                    map.put(i+1,0);
                    money-=list.get(i)[0];
                    follow+=list.get(i)[0]*list.get(i)[1];
                    max=Math.max(max,follow);
                    traverse(list,money,trace,map,follow);
                    trace.remove((Object)(i+1));
                    map.put(i+1,0);
                    money+=list.get(i)[0];
                    follow-=list.get(i)[0]*list.get(i)[1];
                }else if(list.get(i)[2]!=0&&trace.contains((Object)list.get(i)[2])&&map.get(list.get(i)[2])<2&&money-list.get(i)[0]>=0){
                    trace.add(i+1);
                    map.put(list.get(i)[2],map.get(list.get(i)[2])+1);
                    money-=list.get(i)[0];
                    follow+=list.get(i)[0]*list.get(i)[1];
                    max=Math.max(max,follow);
                    traverse(list,money,trace,map,follow);
                    trace.remove((Object)(i+1));
                    map.put(list.get(i)[2],map.get(list.get(i)[2])-1);
                    money+=list.get(i)[0];
                    follow-=list.get(i)[0]*list.get(i)[1];
                }
            }
        }
    }
}
