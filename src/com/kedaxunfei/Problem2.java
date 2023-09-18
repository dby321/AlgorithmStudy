package com.kedaxunfei;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/26 14:32:15
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[][] arr=new String[n][2];
            int[] similar=new int[n];
            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextLine();
                arr[i][1]=sc.nextLine();
                if(arr[i][0].length()==arr[i][1].length()){
                    similar[i]++;
                }
                if(arr[i][0].matches("[0-9]*")&&arr[i][1].matches("[0-9]*")){
                    similar[i]++;
                }
                if(arr[i][0].matches("[a-zA-Z]*")&&arr[i][1].matches("[a-zA-Z]*")){
                    similar[i]++;
                }
                boolean isLetter1=false;
                boolean isDigit1=false;
                boolean isOther1=false;
                boolean isLetter2=false;
                boolean isDigit2=false;
                boolean isOther2=false;
                for(int j=0;j<arr[i][0].length();j++){
                    if(Character.isLetter(arr[i][0].charAt(j))){
                        isLetter1=true;
                    }
                    if(Character.isDigit(arr[i][0].charAt(j))){
                        isDigit1=true;
                    }
                    if(!Character.isLetter(arr[i][0].charAt(j))&&!Character.isLetter(arr[i][0].charAt(j))){
                        isOther1=true;
                    }
                }
                for(int j=0;j<arr[i][1].length();j++){
                    if(Character.isLetter(arr[i][1].charAt(j))){
                        isLetter2=true;
                    }
                    if(Character.isDigit(arr[i][1].charAt(j))){
                        isDigit2=true;
                    }
                    if(!Character.isLetter(arr[i][1].charAt(j))&&!Character.isLetter(arr[i][1].charAt(j))){
                        isOther2=true;
                    }
                }
                if(isDigit1==isDigit2&&isLetter1==isLetter2&&isOther1==isOther2){
                    similar[i]++;
                }
                System.out.println(similar[i]);
            }
        }
    }
}
