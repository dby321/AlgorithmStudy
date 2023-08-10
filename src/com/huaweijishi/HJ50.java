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
 * @date 2023/8/3 19:24:50
 */
public class HJ50 {
    public static void main(String[] args) throws ScriptException {
        Scanner scan = new  Scanner(System.in);
        String input = scan.nextLine();
        input = input.replace("[","(");
        input = input.replace("{","(");
        input = input.replace("}",")");
        input = input.replace("]",")");
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        System.out.println(scriptEngine.eval(input));
    }
}
