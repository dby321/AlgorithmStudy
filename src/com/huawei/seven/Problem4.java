package com.huawei.seven;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/10/18 12:27:27
 */
public class Problem4 {
    public static void main(String[] args) {
        String s="522347222876222";
        int count=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='2'){
                count++;
            } else {
                if(count>0){
                    res+=(count-1)*3;
                    count=0;
                }
            }
            if(s.charAt(i)=='3'||s.charAt(i)=='6'||s.charAt(i)=='9'){
                res+=2;
            }
        }
        if(count>0){
            res+=(count-1)*3;
        }
        int a=1;
        int b=1;
        for(int i=1;i<s.length();i++){
            if(Integer.parseInt(s.charAt(i)+"")==Integer.parseInt(s.charAt(i-1)+"")+1){
                a++;
            }else {
               if(a>1){
                   res+=a*a;
                   a=1;
               }
            }
            if(Integer.parseInt(s.charAt(i)+"")==Integer.parseInt(s.charAt(i-1)+"")-1){
                b++;
            }else {
                if(b>1){
                    res+=b*b;
                    b=1;
                }
            }
        }
        if(a>1){
            res+=a*a;
        }
        if(b>1){
            res+=b*b;
        }
        System.out.println(res);
    }
}
