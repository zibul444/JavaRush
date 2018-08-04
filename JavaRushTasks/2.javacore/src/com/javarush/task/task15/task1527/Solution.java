package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        reader.close();
        int index = url.indexOf('?');
        String param = url.substring(index+1);
        String[] params = param.split("&");
        List<String> s = new ArrayList<>();
        for (int i = 0; i < params.length; i++) {
            if (params[i].contains("obj")){
                if (params[i].contains("=")){
                    index = params[i].indexOf("=");
                    s.add(params[i].substring(index+1));
                }
            }
            if (params[i].contains("=")){
                index = params[i].indexOf("=");
                params[i] = params[i].substring(0, index);
            }
        }

        for (int i = 0; i < params.length; i++) {
            System.out.print(params[i] + " ");
        }
        if (s.size() > 0){
            System.out.println();
            for (String si:s) {
                try{
                    alert(Double.parseDouble(si));
                }catch (Exception e){
                    alert(si);
                }
            }

//            s.forEach(Solution::alert);
            }
        }
//        System.out.println(Arrays.toString(params)); на экран массив
//                    System.out.println(params[i].substring(index+1));
//        System.out.println(param);
//        String[] strings = url.split("'?'+");
//        url = strings[strings.length-1];
//        javarush.ru/alpha/index.html?lvl=15&view&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&oobj=3.0&obj=1&obj=2.3&obj=aaa


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
