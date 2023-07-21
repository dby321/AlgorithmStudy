package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/20 16:23:56
 */
public class HJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (sc.hasNext()) { // 注意 while 处理多个 case
            String str=sc.nextLine();
            StringBuilder sb=new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }
    }
}
