package com.huaweijishi;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/7/22 16:36:47
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        String str="abc123";
        String substring = str.substring(0, 1);
        if(substring.matches("[0-9a-fA-F]")){
            StringBuilder sb = new StringBuilder(Integer.toBinaryString(Integer.parseInt(substring, 16)));
            for(int i=0;i<4-sb.length();i++){
                sb.insert(0,"0");
            }
            StringBuilder reverse = sb.reverse();
            int i = Integer.parseInt(reverse.toString(), 2);
            String s = Integer.toHexString(i).toUpperCase();

        }
    }
}
