package com.huaweijishi;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/8/3 19:40:04
 */
public class HJ54 {
    public static void main(String[] args) throws ScriptException {
        ScriptEngine scriptEngine=new ScriptEngineManager().getEngineByName("nashorn");
        Scanner sc=new Scanner(System.in);
        System.out.println(scriptEngine.eval(sc.next()));
    }
}
