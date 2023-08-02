package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/1 17:18:08
 */
public class HJ28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = getSuShuSet();
        System.out.println(set);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            // 求组合

        }
    }

    public static Set<Integer> getSuShuSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i < 30000; i++) {
            boolean flag=true;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0 && j != 1) {
                    flag=false;
                }
            }
            if(flag){
                set.add(i);
            }
        }
        return set;
    }
}
