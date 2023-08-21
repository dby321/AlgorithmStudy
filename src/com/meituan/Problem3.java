package com.meituan;

import java.util.HashMap;
import java.util.Scanner;

public class Problem3 {
    static HashMap<String,Integer> memo=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            Integer sum=0;
            for(int i=2;i<=s.length();i++){
                for(int j=0;j<=s.length()-i;j++){
                    String substring = s.substring(j, j + i);
                    if(memo.containsKey(substring)){
                        sum+=memo.get(substring);
                    }else{
                        sum+= quanzhi(substring);
                    }
                }
            }
            System.out.println(sum);
        }
    }
    public static Integer quanzhi(String string){
       int count1=0;
       int count2=0;
        for(int i=0;i<string.length();i++){
            if(i%2==0){
                if(string.charAt(i)!='0'){
                    count1++;
                }
                if(string.charAt(i)!='1'){
                    count2++;
                }
            }else{
                if(string.charAt(i)!='1'){
                    count1++;
                }
                if(string.charAt(i)!='0'){
                    count2++;
                }
            }
        }
        Integer min = Math.min(count1, count2);
        memo.put(string,min);
        return min;
    }

}
