package com.huaweijishi;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/11 18:47:07
 */
public class HJ73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day=sc.nextInt();
            LocalDateTime localDateTime=LocalDateTime.of(year,month,day,0,0);
            System.out.println(localDateTime.getDayOfYear());
        }
    }
}
