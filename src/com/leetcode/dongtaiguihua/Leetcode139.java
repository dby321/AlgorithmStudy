package com.leetcode.dongtaiguihua;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/6/7 19:24:01
 */
public class Leetcode139 {
    public static void main(String[] args) {
        String s="catsandog";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        System.out.println(wordBreak(s,wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        boolean[] valid=new boolean[s.length()+1];
        valid[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i&&!valid[i];j++){
                if(set.contains(s.substring(j,i))&&valid[j]){
                    valid[i]=true;
                }
            }
        }
        return valid[s.length()];
    }
}
