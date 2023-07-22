package com.huaweijishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/22 15:13:08
 */
public class HJ20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            String s = sc.nextLine();
            String result="";
            if(s.length()<=8){
                result="NG";
                System.out.println(result);
                continue;
            }
            boolean[] visited=new boolean[4];
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isUpperCase(c)){
                    visited[0]=true;
                }
                if(Character.isLowerCase(c)){
                    visited[1]=true;
                }
                if(Character.isDigit(c)){
                    visited[2]=true;
                }
                if(!Character.isLetterOrDigit(c)){
                    visited[3]=true;
                }
            }
            int count=0;
            for(int i=0;i<visited.length;i++){
                if(visited[i]){
                    count++;
                }
            }
            if(count<3){
                result="NG";
                System.out.println(result);
                continue;
            }
            boolean flag=true;
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<s.length();j++){
                    if(flag&&j-i>2){
                        String sub = s.substring(i, j);
                        if(s.indexOf(sub)!=s.lastIndexOf(sub)){
                            result="NG";
                            System.out.println(result);
                            flag=false;
                        }
                    }
                }
            }
            if(flag){
                result="OK";
                System.out.println(result);
            }
        }
    }
}
