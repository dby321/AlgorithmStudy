package com.huawei.seven;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/27 18:39:56
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            String t1 = s1.substring(1, s1.length() - 1);
            String t2 = s2.substring(1, s2.length() - 1);
            String[] strings1 = t1.split(" ");
            String[] strings2 = t2.split(" ");
            int[] arr1=new int[strings1.length];
            int[] arr2=new int[strings2.length];
            for(int i=0;i<strings1.length;i++){
                arr1[i]=Integer.parseInt(strings1[i]);
            }
            for(int i=0;i<strings2.length;i++){
                arr2[i]=Integer.parseInt(strings2[i]);
            }
            int len1=strings1.length;
            int len2=strings2.length;
            int cur=0;
            int max=Math.max(len1,len2);
            int[] res=new int[max];
            if(s3.equals("+")){
                res=new int[max];
                for(int i=0;i<max;i++){
                    cur=0;
                    if(i<=len1-1){
                        cur+=arr1[len1-1-i];
                    }
                    if(i<=len2-1){
                        cur+=arr2[len2-1-i];
                    }
                    res[max-1-i]=cur;
                }
            }else if(s3.equals("-")){
                res=new int[max];
                for(int i=0;i<max;i++){
                    cur=0;
                    if(i<=len1-1){
                        cur+=arr1[len1-1-i];
                    }
                    if(i<=len2-1){
                        cur-=arr2[len2-1-i];
                    }
                    res[max-1-i]=cur;
                }
            }else if(s3.equals("*")){
                res=new int[len1+len2-1];
                for(int i=0;i<len1+len2-1;i++){
                    cur=0;
                    if(i==0){
                        cur=arr1[len1-1]*arr2[len2-1];
                    }else{
                        for(int j=i;j>=0;j--){
                            if(j<=len1-1&&i-j<=len2-1){
                                cur+=arr1[len1-1-j]*arr2[len2-1-(i-j)];
                            }
                        }
                    }
                    res[len1+len2-2-i]=cur;
                }
            }
            System.out.print("[");
            boolean flag=true;
            for(int i=0;i<res.length;i++) {
                if(res[i]!=0){
                    if(!flag){
                        System.out.print(" "+res[i]);
                    }else{
                        System.out.print(res[i]);
                    }
                    flag=false;
                }
                else if(res[i]==0){
                    if(!flag){
                        System.out.print(" "+res[i]);
                    }
                }
            }
            System.out.print("]");
        }

    }
}
