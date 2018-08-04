package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        for(int i = 0; i < ints.length; i++)
        {
            try{
            ints[i] = Integer.parseInt(reader.readLine());}
            catch (NumberFormatException error){
                System.out.println("Введите число");
            }
        }

        int[] ints1 = new int[10];
        int[] ints2 = new int[10];
        for (int i = 0; i < 10; i++)
        {
            ints1[i] = ints[i];
        }
        for (int i = 0; i < 10; i++)
        {
            ints2[i] = ints[i+10];
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(ints2[i]);
        }
        //напишите тут ваш код

    }
}
