package com.huawei.seven;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/27 18:39:56
 */
public class Problem3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long[] mArr = new long[m];
            long[] nArr = new long[n];
            for (int i = 0; i < m; i++) {
                mArr[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                nArr[i] = sc.nextLong();
            }
            Arrays.sort(mArr);
            Arrays.sort(nArr);
            int res=0;
            int i=0;
            int j=n-1;
            while(i<m&&j>=0){
                if(mArr[i]<=nArr[j]){
                    res++;
                    i++;
                    j--;
                    continue;
                }
                if(x>0){
                    if(mArr[i]<=nArr[j]+y){
                        res++;
                        x--;
                        i++;
                        j--;
                        continue;
                    }
                }
                i++;
            }
            System.out.println(res);
        }


    }
}
