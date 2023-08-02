package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 19:34:56
 */
public class HJ41 {
    static HashSet<Integer> set=new HashSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] m=new int[n];
            int[] x=new int[n];
            for(int i=0;i<n;i++){
                m[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
            }
            dp(m,x,0,0);
            System.out.println(set.size());
//            set.forEach(i->System.out.println(i));
        }
    }
    public static void dp(int[] m,int[] x,int turn,int nowSum){
        set.add(nowSum);
        if(turn==m.length){
            return ;
        }
        for(int i=0;i<=x[turn];i++){
            int incr=m[turn]*i;
            set.add(incr);
            dp(m,x,turn+1,nowSum+incr);
        }
    }
}
