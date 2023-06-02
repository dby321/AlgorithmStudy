package com.leetcode.string;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/2 12:16:02
 */
public class Leetcode459 {
    public static void main(String[] args) {
        String s="aa";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s){
        int n=1;
        for(int i=n;i<=s.length()/2;i++){
            if(s.length()%i==0){
                String substring1=s.substring(0,i);
                boolean flag=true;
                for(int j=1;j<s.length()/i;j++){
                    String substring2=s.substring(0+j*i,(j+1)*i);
                    if(!substring1.equals(substring2)){
                        flag=false;
                    }
                }
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }
}
