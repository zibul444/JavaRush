package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>(10);
        String buf;
        boolean qwe = false;
        int result = 0;

        list.add(reader.readLine());
        for (int i = 1; i < 10; i++) {
            if ((((buf = reader.readLine()).length()) < list.get(i-1).length()) && !qwe){
                qwe = true;
                result = i;
            }
            list.add(buf);
        }
        if (result != 0)System.out.println(result);
    }
}

