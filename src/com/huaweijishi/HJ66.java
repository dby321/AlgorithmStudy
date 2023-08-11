package com.huaweijishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/5 14:31:21
 */
public class HJ66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String[],String> map=new HashMap<>();
        String[] reset = {"reset"};
        map.put(reset,"reset what");
        map.put(new String[]{"reset","board"},"board fault");
        map.put(new String[]{"board","add"},"where to add");
        map.put(new String[]{"board","delete"},"no board at all");
        map.put(new String[]{"reboot","backplane"},"impossible");
        map.put(new String[]{"backplane","abort"},"install first");
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            if(s1.length==1){
                if("reset".startsWith(s1[0])){
                    System.out.println(map.get(reset));
                }else{
                    System.out.println("unknown command");
                }
            }
            if(s1.length==2){
                // 满足匹配的个数
                int count=0;
                // 满足匹配的String[]
                String[] strs=null;
                for (String[] strings : map.keySet()) {
                    if(strings.length==1){
                        continue;
                    }
                    if(strings[0].startsWith(s1[0])&&strings[1].startsWith(s1[1])){
                        count++;
                        strs=strings;
                    }
                }
                if(count==1){
                    System.out.println(map.get(strs));
                }else{
                    System.out.println("unknown command");
                }
            }
        }
    }
}
