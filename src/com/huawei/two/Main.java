package com.huawei.two;


import java.util.*;

public class Main {
    static int MAX_VALUE=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.valueOf(sc.nextLine());
        boolean[] visited=new boolean[num];
        List<Integer[]> list=new ArrayList<>();

        for(int i=0;i<num;i++){
            String str=sc.nextLine();
            Integer[] arr= Arrays.stream(str.split(" ")).map(x->Integer.valueOf(x)).toArray(Integer[]::new);
            list.add(arr);
        }

        for(int i=0;i<list.size();i++){
            MAX_VALUE=Math.max(MAX_VALUE,list.get(i)[2]);
            if(list.get(i)[2]>0&&!list.get(i)[1].equals(-1)){


                traverse(list, visited,list.get(i)[2],i);
            }

        }
        System.out.println(MAX_VALUE);

    }
    public static void traverse(List<Integer[]> list,boolean[] visited,int nowSum,Integer nowIndex) {
        if ( nowIndex < list.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (nowIndex.equals(list.get(i)[1]) && !visited[i] ) {
                    nowSum += list.get(i)[2];
                    visited[i] = true;
                    MAX_VALUE = Math.max(MAX_VALUE, nowSum);
                    traverse(list, visited, nowSum, list.get(i)[0]);
                    nowSum -= list.get(i)[2];
                    visited[i] = false;
                }
            }
        }
    }

}