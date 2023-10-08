package com.huawei.four;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/20 19:02:07
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=Integer.parseInt(sc.nextLine());
            String[] s = sc.nextLine().split(" ");
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
               arr[i]=Integer.parseInt(s[i]);
            }
            int target=Integer.parseInt(sc.nextLine());
            int flag=-1;
            for(int i=1;i<n;i++){
                if(arr[i]>=arr[i-1]){
                    continue;
                }else{
                    flag=i;
                    break;
                }
            }
            int start=-1;
            int end=-1;
            //无覆盖
            if(flag==-1){
                //
                int i;
                for(i=0;i<n;i++){
                    if(arr[i]==target){
                        start=i;
                        end=i;
                        break;
                    }
                }
                for(int j=i;j<n;j++){
                    if(arr[j]==target){
                        end=j;
                    }
                }
                System.out.println(start+" "+end);
            }
            // 有覆盖
            else{
                int i;
                for(i=flag;i<n;i++){
                    if(arr[i]==target){
                        start=i;
                        end=i;
                        break;
                    }
                }
                for(int j=i+1;j<n;j++){
                    if(arr[j]==target){
                        end=j;
                    }else{
                        break;
                    }
                }
                if(end==n-1){
                    for(int j=0;j<flag;j++){
                        if(arr[j]==target){
                            end=j;
                        }else{
                            break;
                        }
                    }
                }
                System.out.println(start+" "+end);

            }
        }
    }
}
