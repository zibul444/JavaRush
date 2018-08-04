package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] masivS = s.toCharArray();
        int i = 0;
        if (i == 0 && masivS[i] != (' ')){
            masivS[i] = Character.toUpperCase(masivS[i]);
        }

        for (; i < masivS.length-1; i++) {
            if (masivS[i] == (' ') && masivS[i+1] != (' ') ){
                masivS[i+1] = Character.toUpperCase(masivS[i+1]);
            }
        }

        for (i = 0; i < masivS.length ; i++)
        {
            System.out.print(masivS[i]);
        }
        //напишите тут ваш код
    }
}
