package com.duxiaoman;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            String s1 = sc.nextLine();
            int totalCount=0;
            int Acount=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='A'){
                    Acount++;
                }
            }
            if(k>Acount){
                totalCount+=(k/Acount)*s1.length();
            }
            k=k%Acount;
            if(k==0){
                System.out.println(totalCount);
            }else{
                int count=0;
                for(int i=0;i<s1.length();i++){
                    totalCount++;
                    if(s1.charAt(i)=='A'){
                        count++;
                        if(count==k){
                            break;
                        }
                    }
                }

                System.out.println(totalCount);
            }
        }
    }
}
