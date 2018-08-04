package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> mapCat = new HashMap<String, Cat>();
        String[] nameCatArray = new String[] {"qwe", "asd", "zcx", "wer", "sdf", "xcv", "ert", "dfg", "cvb", "rty"};
        for (int i = 0; i < 10; i++) {
            mapCat.put(nameCatArray[i], new Cat(nameCatArray[i]));
        }
            //напишите тут ваш код
            return mapCat;
        }

        public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> catsName = new HashSet<Cat>(map.values());

        //напишите тут ваш код
        return catsName;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
