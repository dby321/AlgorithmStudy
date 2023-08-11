package com.huaweijishi;

import java.math.BigInteger;
import java.util.Scanner;

public class HJ57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String next = sc.next();
            String next1 = sc.next();
            BigInteger bigInteger=new BigInteger(next);
            BigInteger bigInteger1=new BigInteger(next1);
            BigInteger result = bigInteger.add(bigInteger1);
            System.out.println(result.toString());
        }
    }
}
