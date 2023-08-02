package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/1 19:13:16
 */
public class HJ30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String next = sc.next();
            String next1 = sc.next();
            String str=next+next1;
            char[] chars = str.toCharArray();
            LinkedList<Character> evenList=new LinkedList<>();
            LinkedList<Character> oddList=new LinkedList<>();
            boolean flag=true;
            for(int i=0;i<chars.length;i++){
                if(flag){
                    oddList.add(chars[i]);
                    flag=false;
                }else{
                    evenList.add(chars[i]);
                    flag=true;
                }
            }
            Collections.sort(evenList);
            Collections.sort(oddList);
            flag=true;
            for(int i=0;i<chars.length;i++){
                if(flag){
                    if(!oddList.isEmpty()){
                        chars[i]=oddList.pollFirst();
                        flag=false;
                    }
                }else{
                    if(!evenList.isEmpty()){
                        chars[i]=evenList.pollFirst();
                        flag=true;
                    }
                }
            }
//            System.out.println(Arrays.toString(chars));
            StringBuilder sb=new StringBuilder();

            for(int i=0;i<chars.length;i++){
                if(Character.isDigit(chars[i])||(Character.toUpperCase(chars[i])<='F'&&Character.toUpperCase(chars[i])>='A')){
                    if(Character.isDigit(chars[i])){
                        String s = Integer.toBinaryString(chars[i] - '0');
                        StringBuilder sb1=new StringBuilder();
                        for(int j=0;j<4-s.length();j++){
                            sb1.append("0");
                        }
                        StringBuilder reverse = sb1.append(s).reverse();
                        int i1 = Integer.parseInt(reverse.toString(), 2);
                        if(i1<10){
                            sb.append(i1+"");
                        }else{
                            sb.append((char)('A'+(i1-10)));
                        }
                    }else{
                        String s = Integer.toBinaryString((Character.toLowerCase(chars[i]) - 'a')+10);
                        StringBuilder sb1=new StringBuilder(s);
                        int i1 = Integer.parseInt(sb1.reverse().toString(), 2);
                        if(i1<10){
                            sb.append(i1+"");
                        }else{
                            sb.append((char)('A'+(i1-10)));
                        }
                    }
                }else{
                    sb.append(chars[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
