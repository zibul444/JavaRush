package com.javarush.test.level07.lesson04.task03;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран,каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] strings = new String[10];
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++)
        {
            strings[i] = reader.readLine();
            ints[i] = strings[i].length();
        }

        int i = 0;
        while (i<10)
        {
            System.out.println(ints[i]);
            i++;
        }
        //напишите тут ваш код

    }
}

