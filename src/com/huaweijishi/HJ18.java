package com.huaweijishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/21 19:13:17
 */
public class HJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s.contains("~")){
                list.add(s);
            }else{
                break;
            }
        }
        int aCount=0;
        int bCount=0;
        int cCount=0;
        int dCount=0;
        int eCount=0;
        int invalidCount=0;
        int privateIp=0;
        for(int i=0;i<list.size();i++){
            String ipAddress=list.get(i).split("~")[0];
            String yanma=list.get(i).split("~")[1];
            String[] ipSplit = ipAddress.split("\\.");
            String[] yanmaSplit = yanma.split("\\.");
            if(ipSplit.length==4&&yanmaSplit.length==4){
                boolean flag=true;
                for(String s:ipSplit){
                    if(Integer.parseInt(s)<0&&Integer.parseInt(s)>255){
                        flag=false;
                    }
                }
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<yanmaSplit.length;j++){
                    String s = Integer.toBinaryString(Integer.parseInt(yanmaSplit[j]));
                    if(s.length()!=8){
                        String prefix="";
                        for(int k=1;k<=8-s.length();k++){
                            prefix+="0";
                        }
                        s=prefix+s;
                    }
                    sb.append(s);
                }
                String yanmaStr = sb.toString();
//                System.out.println(yanmaStr);
                int oneCount=0;
                for(int j=0;j<yanmaStr.length();j++){
                    if(yanmaStr.charAt(j)=='1'){
                        oneCount++;
                    }
                }
                if(oneCount==0||oneCount==yanmaStr.length()){
                    flag=false;
                }
                for(int j=0;j<oneCount;j++){
                    if(yanmaStr.charAt(j)!='1'){
                        flag=false;
                        break;
                    }
                }
                for(String s:yanmaSplit){
                    if(Integer.parseInt(s)<0&&Integer.parseInt(s)>255){
                        flag=false;
                    }
                }
                if(flag){
                    if(Integer.parseInt(ipSplit[0])>=1&&Integer.parseInt(ipSplit[0])<=126){
                        aCount++;
                    }else if(Integer.parseInt(ipSplit[0])>=128&&Integer.parseInt(ipSplit[0])<=191){
                        bCount++;
                    }else if(Integer.parseInt(ipSplit[0])>=129&&Integer.parseInt(ipSplit[0])<=223){
                        cCount++;
                    }else if(Integer.parseInt(ipSplit[0])>=224&&Integer.parseInt(ipSplit[0])<=239){
                        dCount++;
                    }else if(Integer.parseInt(ipSplit[0])>=240&&Integer.parseInt(ipSplit[0])<=255){
                        eCount++;
                    }
                    if(Integer.parseInt(ipSplit[0])==10||Integer.parseInt(ipSplit[0])==172&&(Integer.parseInt(ipSplit[1])>=16&&Integer.parseInt(ipSplit[1])<=31)||(Integer.parseInt(ipSplit[0])==192&&Integer.parseInt(ipSplit[1])==168)){
                        privateIp++;
                    }
                }
                else{
                    if(Integer.parseInt(ipSplit[0])!=0&&Integer.parseInt(ipSplit[0])!=127){
                        invalidCount++;
                    }
                }
            }
            else{
                invalidCount++;
            }

        }
        System.out.println(aCount+" "+bCount+" "+cCount+" "+dCount+" "+eCount+" "+invalidCount+" "+privateIp);
    }
}
