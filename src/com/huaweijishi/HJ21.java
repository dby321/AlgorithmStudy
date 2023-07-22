package com.huaweijishi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/22 15:36:11
 */
public class HJ21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',2);
        map.put('b',2);
        map.put('c',2);
        map.put('d',3);
        map.put('e',3);
        map.put('f',3);
        map.put('g',4);
        map.put('h',4);
        map.put('i',4);
        map.put('j',5);
        map.put('k',5);
        map.put('l',5);
        map.put('m',6);
        map.put('n',6);
        map.put('o',6);
        map.put('p',7);
        map.put('q',7);
        map.put('r',7);
        map.put('s',7);
        map.put('t',8);
        map.put('u',8);
        map.put('v',8);
        map.put('w',9);
        map.put('x',9);
        map.put('y',9);
        map.put('z',9);
        while(sc.hasNext()){
            String s = sc.nextLine();
            StringBuilder result=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(Character.isUpperCase(c)){
                    if(c!='Z'){
                        char temp=Character.toLowerCase(c);
                        c=(char)((int)temp+1);
                    }else{
                        c='a';
                    }
                    result.append(c);
                }else if(Character.isLowerCase(c)){
                    result.append(map.get(c));
                }else{
                    result.append(c);
                }
            }
            System.out.println(result.toString());
        }
    }
}
