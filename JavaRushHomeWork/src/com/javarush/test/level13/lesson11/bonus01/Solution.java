package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine())); // C:\qe\File2.txt
        reader.close();

        List<Integer> tmp = new ArrayList<>();
        String s;

        while ((s = fileReader.readLine()) != null) {
            if (Integer.parseInt(s) % 2 == 0) {
                tmp.add(Integer.parseInt(s));
            }
        }

        Collections.sort(tmp/*, new Comparator<Integer>*/);

        // сортировку!!!!!

        for (Integer i: tmp) {
            System.out.println(i);
        }

        // напишите тут ваш код
    }
}