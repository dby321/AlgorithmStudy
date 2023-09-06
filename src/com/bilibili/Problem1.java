package com.bilibili;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(DoubleNumber(25));
    }
    public static int DoubleNumber(long n){
        int count=0;
        for(long i=1;i<=n;i++){
            if(isDoubleNumber(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isDoubleNumber(long i){
        String s = String.valueOf(i);
        if(s.length()%2==1){
            return false;
        }
        for(int j=0;j<s.length()/2;j++){
            if(s.charAt(j)!=s.charAt(j+s.length()/2)){
                return false;
            }
        }
        return true;
    }
}
