package com.huaweijishi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 15:22:24
 */
public class HJ36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            List<Character> list=new ArrayList<>();
            String s=sc.nextLine();
            for(int i=0;i<s.toCharArray().length;i++){
                if(!list.contains(s.charAt(i))){
                    list.add(s.charAt(i));
                }
            }
            List<Character> upperList = list.stream().filter(item -> Character.isUpperCase(item)).collect(Collectors.toList());
            List<Character> lowerList = list.stream().filter(item -> Character.isLowerCase(item)).collect(Collectors.toList());
            HashMap<Character,Character> upperMap=new HashMap<>();
            HashMap<Character,Character> lowerMap=new HashMap<>();
            int i=0;
            for(char c='A';c<='Z';c++){
                if(i<upperList.size()){
                    upperMap.put(c,upperList.get(i));
                    i++;
                }else{
                    for(char d='A';d<='Z';d++){
                        if(!upperMap.containsValue(d)){
                            upperMap.put(c,d);
                            break;
                        }
                    }
                }
            }
            int j=0;
            for(char c='a';c<='z';c++){
                if(j<lowerList.size()){
                    lowerMap.put(c,lowerList.get(j));
                    j++;
                }else{
                    for(char d='a';d<='z';d++){
                        if(!lowerMap.containsValue(d)){
                            lowerMap.put(c,d);
                            break;
                        }
                    }
                }
            }
//            System.out.println(upperMap);
//            System.out.println(lowerMap);
            String str = sc.next();
            StringBuilder result=new StringBuilder();
            for(int k=0;k<str.length();k++){
                if(Character.isLowerCase(str.charAt(k))){
                    result.append(lowerMap.get(str.charAt(k)));
                }else{
                    result.append(upperMap.get(str.charAt(k)));
                }
            }
            System.out.println(result);
        }
    }
}
