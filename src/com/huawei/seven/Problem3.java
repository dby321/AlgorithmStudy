package com.huawei.seven;

import com.apple.eawt.AppEvent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/27 18:39:56
 */
public class Problem3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            long  x=sc.nextLong();
            long y=sc.nextLong();
            long[] mArr=new long[m];
            long[] nArr=new long[n];
            for(int i=0;i<m;i++){
                mArr[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++){
                nArr[i]=sc.nextLong();
            }
            Arrays.sort(mArr);
            Arrays.sort(nArr);
            boolean[] visited=new boolean[nArr.length];
            boolean[] visited2=new boolean[mArr.length];
            int traverse = traverse(0, 0, mArr, nArr, x, y, visited,visited2);
            if(traverse==0){
                long tempX=x;
                int mIndex=0;
                int count=0;
                for(int i=nArr.length-1;i>=0;i--){
                    if(tempX>0){
                        if(nArr[i]+y>=mArr[mIndex]){
                            count++;
                            mIndex++;
                            tempX--;
                        }
                    }
                }
                System.out.println(count);
            }else{
                System.out.println(traverse);
            }
        }
    }
    public static int traverse(int iStart,int jStart,long[] mArr,long[] nArr,long x,long y,boolean[] visited,boolean[] visited2){
        int max=0;
        for(int i=iStart;i<nArr.length;i++){
            for(int j=jStart;j<mArr.length;j++){
                if(nArr[i]>=mArr[j]){
                    visited[i]=true;
                    visited2[j]=true;
                    int result = traverse(i + 1, j + 1, mArr, nArr,x,y,visited,visited2);
                    int count= result+1;
                    if(result==0){
                        boolean[] copy=Arrays.copyOf(visited,visited.length);
                        boolean[] copy1=Arrays.copyOf(visited2,visited2.length);

                        int tempJ=mArr.length-1;
                        long tempX=x;
                        for(int k=visited.length-1;k>0;k--){
                            if(!visited[k]&&!visited2[tempJ]&&tempX>0&&tempJ<mArr.length&&nArr[k]+y>=mArr[tempJ]){
                                count++;
                                tempJ++;
                                tempX--;
                                visited[k]=true;
                                visited2[tempJ]=true;
                            }else if(!visited[k]&&tempX>0&&tempJ<mArr.length&&!(nArr[k]+y>=mArr[tempJ])){
                                tempJ--;
                            }
                        }
                        visited=Arrays.copyOf(copy,copy.length);
                        visited2=Arrays.copyOf(copy1,copy1.length);
                    }
                    visited[i]=false;
                    visited2[j]=false;
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }
}
