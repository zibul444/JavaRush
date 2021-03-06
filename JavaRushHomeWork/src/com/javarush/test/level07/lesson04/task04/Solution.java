package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = ints.length - 1; i > -1; i--)
        {
            try
            {
            ints[i] = Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException error)
            {
            System.out.println("Введите число: " + error);
            }
        }

        for (int i = 0, i1 = ints.length - 1; i < ints.length; i++, i1--)

        {
            int buf  = ints[i];
            ints[i]  = ints[i1];
            ints[i1] = buf;
        }
        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(ints[i]);
        }
        // /напишите тут ваш код

    }
}
