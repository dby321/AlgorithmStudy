package com.huaweijishi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/9 14:42:55
 */
public class HJ67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String next = sc.nextLine();
            String[] arr = next.split("\\s");
//            System.out.println(Arrays.toString(arr));
            List<Integer> list = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toList());
//            System.out.println(list);
            boolean[] visited=new boolean[4];
            System.out.println(backTrack(list,visited,0));;
        }
    }
    public static boolean backTrack(List<Integer> list,boolean[] visited,int nowSum){
        if(nowSum==24){
            int count=0;
            for(int i=0;i<4;i++){
                if(visited[i]){
                    count++;
                }
            }
            if(count==4){
                return true;
            }
        }
        boolean result=false;
        for(int i=0;i<4;i++){
            if(!visited[i]){
                visited[i]=true;
                boolean add=backTrack(list,visited,nowSum+list.get(i));
                boolean multiply=backTrack(list,visited,nowSum*list.get(i));
                boolean decrease=backTrack(list,visited,nowSum-list.get(i));
                boolean divide=false;
                if(nowSum%list.get(i)==0){
                    divide=backTrack(list,visited,nowSum/list.get(i));
                }
                result=result||add||multiply||decrease||divide;
                visited[i]=false;
            }
        }
        return result;
    }
}
