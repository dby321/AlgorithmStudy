package com.kedaxunfei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/26 14:58:36
 */
public class Problem3 {
    static int count=0;
    static BigInteger p=new BigInteger("0");
    static BigInteger one=new BigInteger("1");
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            p = new BigInteger(s1);

            backTrack(s,0);
            System.out.println(count);
            count=0;
        }
    }
    public static void backTrack(String s,int start){
        if(start>=s.length()){
            BigInteger l = new BigInteger(s);
            if(l.mod(p).intValue()==0){
                count+=1;
                if(count>1000000007){
                    count=count%1000000007;
                }
            }
            return ;
        }
        if(s.charAt(start)=='?'){
            StringBuilder sb=new StringBuilder(s);
            for(char i='0';i<='9';i++){
                sb.setCharAt(start,i);
                backTrack(sb.toString(),start+1);
            }
        }else{
            backTrack(s,start+1);
        }
    }
}
