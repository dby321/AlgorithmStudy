package com.xiaohongshu;

import java.util.*;

public class Problem2 {
    static HashMap<Character, List<String>> operation=new HashMap<>();



    static {
        operation.put('w',Arrays.asList("vv"));
        operation.put('m',Arrays.asList("nn"));
        operation.put('b',Arrays.asList("d","q"));
        operation.put('d',Arrays.asList("b","p"));
        operation.put('p',Arrays.asList("q","d"));
        operation.put('q',Arrays.asList("p","b"));
        operation.put('n',Arrays.asList("u"));
        operation.put('u',Arrays.asList("n"));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] arr=new String[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextLine();
                HashSet<String> memo=new HashSet<>();
                if(huiwen(arr[i])){
                    System.out.println("YES");
                }else{
                    boolean flag = transfer(arr[i], memo);
                    if(flag){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }

            }
        }

    }
    public static boolean transfer(String str,HashSet<String> memo){
        if(huiwen(str)){
            return true;
        }
        boolean flag=false;
       for(int i=0;i<str.length();i++){
           if(operation.containsKey(str.charAt(i))){
               List<String> transferList=transfer(str,i,memo);
               for(int j=0;j<transferList.size();j++){
                   String transferString = transferList.get(j);
                   if(memo.contains(transferString)){
                       continue;
                   }else{
                       flag = flag||transfer(transferString, memo);
                       memo.add(transferString);
                   }
               }
           }
       }
       return flag;
    }
    public static List<String> transfer(String str,int index,HashSet<String> memo){
        List<String> strings = operation.get(str.charAt(index));
        List<String> transferList=new ArrayList<>();
        for(int i=0;i<strings.size();i++){
            String transferString="";
            if(index==0){
                transferString=strings.get(i)+str.substring(index+1);
            }else{
                transferString=str.substring(0,index-1)+strings.get(i)+str.substring(index+1);
            }
            transferList.add(transferString);
        }

        return transferList;
    }
    public static boolean huiwen(String str1){
        int left=0;
        int right=str1.length()-1;
        while(left<right){
            if(str1.charAt(left)!=str1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
