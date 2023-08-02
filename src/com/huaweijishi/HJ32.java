package com.huaweijishi;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 14:32:27
 */
public class HJ32 {
    public static void main(String[] args) {
        // 最长回文子串
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            int maxLength=1;
            for(int i=0;i<s.length()-1;i++){
                maxLength=Math.max(maxLength,maxHuiwen(s,i,i));
                maxLength=Math.max(maxLength,maxHuiwen(s,i,i+1));
            }
            System.out.println(maxLength);
        }
    }
    public static int maxHuiwen(String s,int left,int right){
        while(left>=0&&right<s.length()){
            if(s.charAt(left)!=s.charAt(right)){
                break;
            }
            left--;
            right++;
        }
        return s.substring(left+1,right).length();
    }
}
