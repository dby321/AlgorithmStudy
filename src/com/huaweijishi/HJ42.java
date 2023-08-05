package com.huaweijishi;

import java.util.*;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/2 20:08:38
 */
public class HJ42 {
    static Map<String, String> map1 = new HashMap<>();
    static Map<String, String> map2 = new HashMap<>();
    static Map<Character, String> map3 = new HashMap<>();

    static {
        map1.put("0", "");
        map1.put("1", "one");
        map1.put("2", "two");
        map1.put("3", "three");
        map1.put("4", "four");
        map1.put("5", "five");
        map1.put("6", "six");
        map1.put("7", "seven");
        map1.put("8", "eight");
        map1.put("9", "nine");
        map1.put("10", "ten");
        map1.put("11", "eleven");
        map1.put("12", "twelve");
        map1.put("13", "thirteen");
        map1.put("14", "fourteen");
        map1.put("15", "fifteen");
        map1.put("16", "sixteen");
        map1.put("17", "seventeen");
        map1.put("18", "eighteen");
        map1.put("19", "nineteen");
        map1.put("00", "");
        map1.put("01", "one");
        map1.put("02", "two");
        map1.put("03", "three");
        map1.put("04", "four");
        map1.put("05", "five");
        map1.put("06", "six");
        map1.put("07", "seven");
        map1.put("08", "eight");
        map1.put("09", "nine");
        map2.put("2", "twenty");
        map2.put("3", "thirty");
        map2.put("4", "forty");
        map2.put("5", "fifty");
        map2.put("6", "sixty");
        map2.put("7", "seventy");
        map2.put("8", "eighty");
        map2.put("9", "ninety");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            String reverse = sb.reverse().toString();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < reverse.length(); i = i + 3) {
                if (i + 3 < reverse.length()) {
                    list.add(new StringBuilder(reverse.substring(i, i + 3)).reverse().toString());
                } else {
                    list.add(new StringBuilder(reverse.substring(i)).reverse().toString());
                }
            }
//            System.out.println(list);
            List<String> list1 = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                String s1 = stringToNumberString(list.get(i));
//                System.out.println(s1);
                list1.add(s1);

            }
            Collections.reverse(list1);
            if (list1.size() == 1) {
                System.out.println(list1.get(0));
            } else if (list1.size() == 2) {
                String s1 = (list1.get(0) + " thousand").equals(" thousand") ? "" : list1.get(0) + " thousand";
                String s2 = list1.get(1);
                String result = s1 + " " + s2;
                String[] split = result.split("\\s+");
                System.out.println(String.join(" ", split));

            } else if (list1.size() == 3) {
                String s1 = (list1.get(0) + " million").equals(" million") ? "" : list1.get(0) + " million";
                String s2 = (list1.get(1) + " thousand").equals(" thousand") ? "" : list1.get(1) + " thousand";
                String s3 = list1.get(2);
                String result = s1 + " " + s2 + " " + s3;
                String[] split = result.split("\\s+");
                System.out.println(String.join(" ", split));
            } else if (list1.size() == 4) {
                String s1 = (list1.get(0) + " billion").equals(" billion") ? "" : list1.get(0) + " billion";
                String s2 = (list1.get(1) + " million").equals(" million") ? "" : list1.get(1) + " million";
                String s3 = (list1.get(2) + " thousand").equals(" thousand") ? "" : list1.get(2) + " thousand";
                String s4 = list1.get(3);
                String result = s1 + " " + s2 + " " + s3 + " " + s4;
                String[] split = result.split("\\s+");
                System.out.println(String.join(" ", split));
            }
        }
    }

    public static String stringToNumberString(String s) {
        if (s.length() == 1) {
            return map1.get(s);
        } else if (s.length() == 2) {
            String substring = s.substring(0, 1);
            String substring1 = s.substring(1, 2);
            String substring2 = s.substring(0, 2);
            if (substring2.equals("00")) {
                return "";
            } else if (Integer.parseInt(s) <= 19) {
                return map1.get(s);
            } else {
                return map2.get(substring) + " " + map1.get(substring1);
            }
        } else {
            String substring = s.substring(0, 1);
            String substring1 = s.substring(1, 2);
            String substring2 = s.substring(2, 3);
            String substring3 = s.substring(1, 3);
            if (s.equals("000")) {
                return "";
            } else if (substring3.equals("00")) {
                return map1.get(substring) + " hundred";
            } else if (Integer.parseInt(substring3) <= 19 && Integer.parseInt(substring) == 0) {
                return map1.get(substring3);
            } else if (Integer.parseInt(substring3) <= 19 && Integer.parseInt(substring) > 0) {
                return map1.get(substring) + " hundred and " + map1.get(substring3);
            } else if (Integer.parseInt(substring) == 0) {
                return map2.get(substring1) + " " + map1.get(substring2);
            } else  {
                return map1.get(substring) + " hundred and " + map2.get(substring1) + " " + map1.get(substring2);
            }
        }
    }
}
