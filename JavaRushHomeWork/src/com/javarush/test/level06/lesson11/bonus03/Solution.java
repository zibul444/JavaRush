package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        int i = 0, q, buf;
        while (i<5){
            buf =(Integer.parseInt(reader.readLine()));
            list.add(i, buf);
            i++;
        }

        int o = 0;
        for(; o < 5; o++) {

            for (q = o + 1; q < 5; q++) {
                if (list.get(o) < list.get(q)) {
                } else {
                    buf = list.get(o);
                    list.set(o, list.get(q));
                    list.set(q, buf);
                }
            }
        }
        i = 0;
        while (i < 5) {
            System.out.println(list.get(i));
            i++;
        }
        //напишите тут ваш код
    }
}
