package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>(5);

        list.add(0, "qwe");
        list.add(1, "asd");
        list.add(2, "zxc");
        list.add(3, "wer");
        list.add(4, "sdf");
        list.add(5, "xcv");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код

    }
}
