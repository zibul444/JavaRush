package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        String[] lastName = new String[] {"Пупкин", "Гупкин", "Манина", "Орлов", "Заяц", "Костин", "Лоно", "Дуся", "Колосов", "Горн"};
        String[] name = new String[] {"Вася", "Федя", "Аня", "Света", "Петя", "Вася", "Аня", "Дуся", "Коля", "Вася"};
        for (int i = 0; i < 10; i++)
        {
            map.put(lastName[i], name[i]);
        }
        return map;
        //напишите тут ваш код
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)){i++;}
        }
        return i;
        //напишите тут ваш код
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(lastName)){i++;}
        }
        return i;
        //напишите тут ваш код
    }
}
