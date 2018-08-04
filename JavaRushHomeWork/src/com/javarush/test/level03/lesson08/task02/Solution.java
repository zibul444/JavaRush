package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //запихиваем поток в буфе.
        System.out.println("Введите свое имя");
        String name = reader.readLine(); // поток
        /*String nZP = reader.readLine();
        String nAge = reader.readLine();*/


        String sAge, sZP; // объявили преременные для потока
        int nAge = 0, nZP = 0;

        int x = 0;
        System.out.println("Введите желаемый оклад");
        while (x == 0)
        {
            try
            {
                sZP = reader.readLine();
                nZP = Integer.parseInt(sZP);
                x = 1;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Был введен текст, введите число. Введите желаемый оклад");
                x = 0;
            }
        }

        x=0;
        System.out.println("Введите количество лет");
        while (x == 0)
        {
            try
            {

                sAge = reader.readLine();
                nAge = Integer.parseInt(sAge);
                x = 1;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Был введен текст, введите число. Введите количество лет");
                x = 0;
            }
        }
        System.out.println(name + " получает " + nZP + " через " + nAge + " лет.");

    }
}