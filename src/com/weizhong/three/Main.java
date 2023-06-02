package com.weizhong.three;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project HuaweiJishi
 * @description
 * @date 2023/4/23 20:33:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int k= scanner.nextInt();
            int[][] ab=new int[n][2];
            for(int i=0;i<n;i++){
                ab[i][0]=scanner.nextInt();
                ab[i][1]=scanner.nextInt();
            }
            List<Integer> newList=new ArrayList<>();
            int index=0;
//            for(int i=0;i<n-1;i++){
//                newList.add(ab[i][1]);
//                if(ab[i][0]==ab[i+1][0]){
//                    Integer integer = newList.get(index);
//                    integer+=ab[i+1][1];
//                    newList.set(index,integer);
//                }else{
//                    index++;
//                }
//            }
//            newList.forEach(a-> System.out.println(a));
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                // 第i个键位
                int count=0;
                if(ab[i][1]<=4){
                    // 正常敲击
                    count+=ab[i][1];
                    map.put(ab[i][0],map.getOrDefault(map.get(ab[i][0]),0)+count);
                }else{
                    int num=ab[i][1];
                    while(num>=k){
                        count+=2*k;
                        num-=k;
                    }
                    map.put(ab[i][0],map.getOrDefault(map.get(ab[i][0]),0)+count);
                }
            }
            map.forEach((key,value)-> System.out.println(key+" "+value));
        }
    }
}
