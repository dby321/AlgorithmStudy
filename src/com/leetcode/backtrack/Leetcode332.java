package com.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * 1. 先排序
 * @date 2023/6/4 19:51:40
 */
public class Leetcode332 {
    public static void main(String[] args) {
        List<List<String>> tickets=new ArrayList<>();
        tickets.add(Arrays.asList("JFK","SFO"));
        tickets.add(Arrays.asList("JFK","ATL"));
        tickets.add(Arrays.asList("SFO","ATL"));
        tickets.add(Arrays.asList("ATL","JFK"));
        tickets.add(Arrays.asList("ATL","SFO"));
        System.out.println(findItinerary(tickets));
    }
    public static List<String> findItinerary(List<List<String>> tickets) {
        List<List<String>> trace=new ArrayList<>();
        List<String> result=new ArrayList<>();
        boolean[] visited=new boolean[tickets.size()];
        tickets.sort((list1, list2) -> {
            return list1.get(1).compareTo(list2.get(1));
        });
        backtrack(tickets,0,visited,trace,result);
        return result;
    }
    public static boolean backtrack(List<List<String>> tickets,int index,boolean[] visited,List<List<String>> trace,List<String> result){
        if(index>=tickets.size()+1) return false;
        for(int i=0;i<tickets.size();i++){
            if(!visited[i]){
                if((index==0&&tickets.get(i).get(0).equals("JFK"))||trace.size()!=0&&trace.get(trace.size()-1).get(1).equals(tickets.get(i).get(0))){
                    trace.add(tickets.get(i));
                    visited[i]=true;
                    index++;
                    if(index== tickets.size()){
                        result.add(trace.get(0).get(0));
                        for(int j=0;j<trace.size();j++){
                            result.add(trace.get(j).get(1));
                        }
                        return true;
                    }
                    if(backtrack(tickets,index,visited,trace,result)){
                        return true;
                    }
                    trace.remove(trace.size()-1);
                    visited[i]=false;
                    index--;
                }
            }
        }
        return false;
    }
}
