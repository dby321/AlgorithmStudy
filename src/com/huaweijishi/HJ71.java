package com.huaweijishi;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/9 17:16:08
 */
public class HJ71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String regx = scanner.nextLine();
            String string = scanner.nextLine();
            regx = regx.toLowerCase(Locale.ROOT);
            string = string.toLowerCase(Locale.ROOT);
            regx = regx.replaceAll("\\*{2,}","\\*");
            //做相应的替换
            regx = regx.replaceAll("\\?", "[0-9A-Za-z]{1}");
            regx = regx.replaceAll("\\*", "[0-9A-Za-z]{0,}");
            boolean result = string.matches(regx);
            System.out.println(result);
        }
    }
}
