package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/22 16:52:51
 */
public class HJ25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int numI= sc.nextInt();
            String[] I=new String[numI];
            for(int i=0;i<numI;i++){
                I[i]=String.valueOf(sc.nextInt());
            }
            int numR=sc.nextInt();
            List<Integer> R=new ArrayList<>(numR);
            for(int i=0;i<numR;i++){
                R.add(sc.nextInt());
            }
            ArrayList<Integer> set = new ArrayList<>(new HashSet<>(R));
            Collections.sort(set);
            ArrayList<Object[]> list=new ArrayList<>();
            int count=0;
            for(int i=0;i<set.size();i++){
                ArrayList<String[]> nestList=new ArrayList<>();
                for(int j=0;j<I.length;j++){
                    if(I[j].contains(set.get(i)+"")){
                        nestList.add(new String[]{j+"",I[j]});
                        count+=2;
                    }
                }
                if(!nestList.isEmpty()){
                    list.add(new Object[]{set.get(i),nestList});
                    count+=2;
                }
            }
            System.out.print(count+" ");
            for(int i=0;i<list.size();i++){
                System.out.print((int)list.get(i)[0]+" ");
                List<String[]> nestList= (List<String[]>) list.get(i)[1];
                System.out.print(nestList.size()+" ");
                for(int j=0;j<nestList.size();j++){
                    System.out.print(nestList.get(j)[0]+" "+nestList.get(j)[1]+" ");
                }
            }
        }
    }
}
