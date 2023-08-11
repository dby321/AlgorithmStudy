package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/9 16:40:47
 */
public class HJ70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            Map<String,Integer[]> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put((char)('A'+i)+"",new Integer[]{sc.nextInt(), sc.nextInt()});
            }
            String expression = sc.next();
            //栈
            Stack<String> stack=new Stack<>();
            int count=0;
            for(int i=0;i<expression.length();i++){
                if(expression.charAt(i)==')'){
                    String end = stack.pop();
                    String front=stack.pop();
                    String zuokuohao=stack.pop();
                    Result result = calCountAndTempAddToMap(map, front, end);
                    count+= result.count;
                    stack.add(result.uuid);
                }else{
                    stack.add(expression.charAt(i)+"");
                }
            }
            System.out.println(count);
        }

    }
    public static Result calCountAndTempAddToMap(Map<String,Integer[]> map,String front ,String end){
        Integer[] integers = map.get(front);
        Integer[] integers1 = map.get(end);
        Result result=new Result();
        result.count=integers[0]*integers[1]*integers1[1];
        result.arr=new Integer[]{integers[0],integers1[1]};
        result.uuid=UUID.randomUUID().toString();
        map.put(result.uuid,result.arr);
        return result;
    }
    static class Result{
        int count;
        Integer[] arr;
        String uuid;
    }
}
