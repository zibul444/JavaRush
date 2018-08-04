package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> countByte = new HashMap<>();

        int b, min, max = 0;
        while (inputStream.available() != 0){
            b = inputStream.read();
            if (countByte.get(b) == null){
                countByte.put(b, 1);
            } else {
                countByte.put(b, countByte.get(b) + 1);
            }
        }
        reader.close();
        inputStream.close();

        for (HashMap.Entry<Integer, Integer> pair : countByte.entrySet()){
            if (max < pair.getValue()){
                max = pair.getValue();
            }
        }
        for (HashMap.Entry<Integer, Integer> pair : countByte.entrySet()){
            if (pair.getValue() == max){
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
