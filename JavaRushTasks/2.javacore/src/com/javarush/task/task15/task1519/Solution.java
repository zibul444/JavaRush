package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово «exit«.
2. Для каждого значения, кроме «exit«, вызвать метод print. Если значение:
2.1. содержит точку ‘.‘, то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше нуля или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();

        String s = reader.readLine();
        while (! (s.compareTo("exit")==0)){
            if (s.toLowerCase().equals("exit")) {
                return;
            }
            strings.add(s);
            s = reader.readLine();
        }

        for (String st : strings) {
        try {
            if (st.toString().contains(".")) {
                double d = Double.parseDouble(st);
                print(d);
            } else if (Integer.parseInt(st) > 0 && Integer.parseInt(st) < 128) {
                short sh = Short.parseShort(st);
                print(sh);
            } else if (Integer.parseInt(st) <= 0 || Integer.parseInt(st) >= 128) {
                int i = Integer.parseInt(st);
                print(i);

            } else print(st);
        }catch (NumberFormatException e){
            print(st);
        }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
