package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/1 15:14:27
 */
public class HJ26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            StringBuilder result=new StringBuilder();
            Deque<Character> list=new LinkedList<>();
            int count=0;
            for(char i='a';i<='z';i++){
                List<Character> nestList=new LinkedList<>();
                for(int j=0;j<s.length();j++){
                    if((Character.toLowerCase(s.charAt(j))==i)){
                        nestList.add(s.charAt(j));
                    }
                }
                list.addAll(nestList);
                count+=nestList.size();
            }
            for(int i=0;i<s.length();i++){
                if(!Character.isLetter(s.charAt(i))){
                    result.append(s.charAt(i));
                }else{
                    result.append(list.pollFirst());
                }
            }
            System.out.println(result.toString());
        }
    }
}
