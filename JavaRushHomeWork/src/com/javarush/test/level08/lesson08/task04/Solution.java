package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.*/



public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JANUARY 1 1980"));
        map.put("Qwerty", new Date("MARCH 2 1980"));
        map.put("Asdf", new Date("APRIL 3 1980"));
        map.put("Zxcvb", new Date("MAY 4 1980"));
        map.put("Uiop", new Date("OCTOBER 5 1980"));
        map.put("Qwe", new Date("JULY 6 1980"));
        map.put("Asd", new Date("SEPTEMBER 7 1980"));
        map.put("Zxc", new Date("AUGUST 8 1980"));
        map.put("Fghj", new Date("NOVEMBER 9 1980"));
        map.put("Ghj", new Date("DECEMBER 10 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashMap<String, Date> map2 = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair : map2.entrySet()) {//сдесь нельзя использовать HashMap, ибо Entry не является Static... на сервере avaRash
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {    //(4 < month && month < 8)
                map.remove(pair.getKey());
            }
        }
    }
}
