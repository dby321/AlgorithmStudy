package com.huaweijishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/11 18:49:45
 */
public class HJ74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
//            System.out.println(Arrays.toString(s1));
            StringBuilder sb=new StringBuilder();
            List<String> list=new ArrayList<>();
            int count=0;
            for(int i=0;i<s1.length;i++){
                if(s1[i].contains("\"")&&s1[i].indexOf("\"")==s1[i].lastIndexOf("\"")&&count==0){
                    sb.append(s1[i]);
                    count++;
                } else if(count==1){
                    sb.append(" "+s1[i]);
                    if(s1[i].contains("\"")&&s1[i].indexOf("\"")==s1[i].lastIndexOf("\"")){
                        count=0;
                        list.add(sb.toString().replace('"',' ').trim());
                        sb=new StringBuilder();
                    }
                }else if(s1[i].contains("\"")&&s1[i].indexOf("\"")!=s1[i].lastIndexOf("\"")){
                    list.add(s1[i].substring(1,s1[i].length()-1));
                }
                else{
                    list.add(s1[i]);
                }
            }
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }
}
