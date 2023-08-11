package com.huaweijishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String next = sc.next();
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<next.toCharArray().length;i++){
                map.put(next.charAt(i),map.getOrDefault(next.charAt(i),0)+1);
            }
            boolean notExist=true;
            for(int i=0;i<next.toCharArray().length;i++){
                char c=next.charAt(i);
                if(map.get(c)==1){
                    System.out.println(c);
                    notExist=false;
                    break;
                }
            }
            if(notExist){
                System.out.println(-1);
            }
        }
    }
}
