package com.huaweijishi;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 15:59:32
 */
public class HJ38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            BigDecimal num=new BigDecimal(sc.nextInt()+"");
            BigDecimal temp=num;
            BigDecimal total=num;
            for(int i=0;i<4;i++){
                temp=temp.divide(new BigDecimal("2"));
                total=total.add(temp.multiply(new BigDecimal("2")));
            }
            System.out.println(total.doubleValue());
            System.out.println(temp.divide(new BigDecimal("2")).doubleValue());
        }
    }
}
