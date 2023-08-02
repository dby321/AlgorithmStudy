package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 16:10:52
 */
public class HJ39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String yanma = sc.nextLine();
            String ip1 = sc.nextLine();
            String ip2 = sc.nextLine();
//            System.out.println(judgeYanma(yanma));
//            System.out.println(judgeIp(ip1));
//            System.out.println(judgeIp(ip2));
            if(judgeYanma(yanma)&&judgeIp(ip1)&&judgeIp(ip2)){
                String yanmaBinaryString = toBinaryString(yanma);
                String ip1BinaryString = toBinaryString(ip1);
                String ip2BinaryString=toBinaryString(ip2);
                // 按位与
                StringBuilder sb1=new StringBuilder();
                StringBuilder sb2=new StringBuilder();
                for (int i = 0; i < yanmaBinaryString.toCharArray().length; i++) {
                    sb1.append((Integer.parseInt(yanmaBinaryString.charAt(i)+""))&(Integer.parseInt(ip1BinaryString.charAt(i)+"")));
                }
                for (int i = 0; i < yanmaBinaryString.toCharArray().length; i++) {
                    sb2.append((Integer.parseInt(yanmaBinaryString.charAt(i)+""))&(Integer.parseInt(ip2BinaryString.charAt(i)+"")));
                }
                if(sb1.toString().equals(sb2.toString())){
                    System.out.println(0);
                }else{
                    System.out.println(2);
                }

            }else{
                System.out.println(1);
            }
        }
    }
    public static boolean judgeYanma(String yanma){
        String[] split = yanma.split("\\.");
        if(split.length!=4){
            return false;
        }
        for(int i=0;i<split.length;i++){
            int i1 = Integer.parseInt(split[i]);
            if(i1<0||i1>255){
                return false;
            }
        }
        String s = toBinaryString(yanma);
        int count=0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            if(s.charAt(i)=='0'){
                return false;
            }
        }
        return true;
    }
    public static boolean judgeIp(String ip){
        String[] split = ip.split("\\.");
        if(split.length!=4){
            return false;
        }
        for(int i=0;i<split.length;i++){
            int i1 = Integer.parseInt(split[i]);
            if(i1<0||i1>255){
                return false;
            }
        }
        return true;
    }
    public static String toBinaryString(String s){
        String[] split = s.split("\\.");
        StringBuilder bigSb=new StringBuilder();
        for(int i=0;i<split.length;i++){
            String binaryString = Integer.toBinaryString(Integer.parseInt(split[i]));
            StringBuilder sb=new StringBuilder(binaryString);
            for(int j=0;j<8-binaryString.length();j++){
                sb.insert(0,"0");
            }
            bigSb.append(sb);
        }
        return bigSb.toString();
    }
}
