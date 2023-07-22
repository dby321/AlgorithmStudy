package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/21 20:29:43
 */
public class HJ19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.nextLine();
            if(s.contains("\\")){
                list.add(s);
            }else{
                break;
            }
        }
        TreeMap<String,Integer> map=new TreeMap<>();
        List<String> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String[] split = list.get(i).split(" ");
            String fileName=split[0];
            String lineNo=split[1];
            String[] fileNameSplit = fileName.split("\\\\");
            String lastStr=fileNameSplit[fileNameSplit.length-1];
            if(fileNameSplit[fileNameSplit.length-1].length()>16){
                lastStr=fileNameSplit[fileNameSplit.length-1].substring(fileNameSplit[fileNameSplit.length-1].length()-16);
            }
            String key=lastStr+","+lineNo;
            if(!map.containsKey(key)){
                map.put(key,1);
                list2.add(key);
            }else{
                map.put(key,map.get(key)+1);
            }
        }
        if(list2.size()>8){
            for(int i=list2.size()-8;i<list2.size();i++){
                String s= list2.get(i);
                String[] split = s.split(",");
                Integer integer = map.get(s);
                System.out.println(split[0]+" "+split[1]+" "+integer);
            }
        }else{
            for(int i=0;i<list2.size();i++){
                String s= list2.get(i);
                String[] split = s.split(",");
                Integer integer = map.get(s);
                System.out.println(split[0]+" "+split[1]+" "+integer);
            }
        }

    }
}
