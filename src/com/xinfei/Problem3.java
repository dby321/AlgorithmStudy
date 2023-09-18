package com.xinfei;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/30 16:52:10
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.nextLine().split(" ");
            LocalDateTime startTime=LocalDateTime.of(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]),0,0);
            String[] s1 = sc.nextLine().split(" ");
            LocalDateTime judgeTime=LocalDateTime.of(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]),Integer.parseInt(s1[2]),0,0);
            if(judgeTime.isAfter(startTime)||judgeTime.isEqual(startTime)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
