package com.huaweijishi;

import sun.misc.Regexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 14:25:11
 */
public class HJ31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] split = s.split("[^a-zA-Z]+");
//            System.out.println(Arrays.toString(split));
            List<String> list=Arrays.stream(split).filter(item->!item.isEmpty()).collect(Collectors.toList());
            Collections.reverse(list);
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
