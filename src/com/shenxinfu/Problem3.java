package com.shenxinfu;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger maxValue=new BigInteger("0");
        while(sc.hasNext()){
            String s = sc.nextLine();
            List<Integer> index=new ArrayList<>();
            findMaxNumber(s,index);
            BigInteger zero=new BigInteger("0");
            for(int i=0;i<index.size();i++){
                String str=s.substring(index.get(i))+s.substring(0,index.get(i));
                BigInteger nowInteger=new BigInteger(str);

                if(nowInteger.compareTo(maxValue)>0){
                    maxValue=nowInteger;
                }
            }
            System.out.println(maxValue);
        }
    }
    public static void findMaxNumber(String s,List<Integer> index){
        char maxChar='0';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>maxChar){
                maxChar=s.charAt(i);
                index.clear();
                index.add(i);
            }else if(s.charAt(i)==maxChar){
                index.add(i);
            }
        }
    }
}
