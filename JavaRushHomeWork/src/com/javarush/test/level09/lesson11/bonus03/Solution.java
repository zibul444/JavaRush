package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз

Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);
//
//        for (String x : array) {
//            System.out.println(x);
//        }
    }

    public static void sort(String[] array) {

        ArrayList<Integer> integers = new ArrayList<Integer>();
        ArrayList<String> strings = new ArrayList<String>();
        int buf;

        int i = 0, n = 0, s = 0;
        for(String m : array){
            if (isNumber(m)){
                integers.add(Integer.parseInt(array[i]));
                n++;
            }
            else {
                strings.add(array[i]);
                s++;
            }
            i++;
        }
        System.out.println(n + s);
        for (i = 0; i< integers.size()-1; i++) {
            for (n = 0; n< integers.size()-1; n++){
                if (integers.get(n) < integers.get(n+1)){
                    buf = integers.get(n+1);
                    integers.set(n+1, integers.get(n));
                    integers.set(n, buf);
                }
            }
        }
        String tmp;
        for (i = 0; i< strings.size()-1; i++) {
            for (n = 0; n< strings.size()-1; n++){
                if (isGreaterThan(strings.get(n), strings.get(n+1))){
                    tmp = strings.get(n+1);
                    strings.set(n+1, strings.get(n));
                    strings.set(n, tmp);
                }
            }
        }

        n = 0; s = 0;
        for (i = 0; i < array.length; i++){
            if (isNumber(array[i])){
                array[i] = String.valueOf(integers.get(n));
                n++;
            }
            else {
                array[i] = strings.get(s);
                s++;
            }
        }

//        for (Integer ints: integers) {
//            System.out.println(ints);
//        }
//        for (String str: strings) {
//            System.out.println(str);
//        }

        //напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
