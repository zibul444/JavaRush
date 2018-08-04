package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        String[] str = new String[] {"Ла", "Ло", "Лу", "Ли", "Ля", "Ле", "Лp", "Лы", "Лэ", "Лю",
                "Лол", "Лама", "Лава", "Лувр", "Лед", "Лом", "Лук","Лик","Лак","Луна"};
        for (int i = 0; i < str.length; i++)
        {
            set.add(str[i]);
        }
        return set;
        //напишите тут ваш код
    }

    public static void main(String[] args)
    {
//        HashSet<String> set = new HashSet<String>();
//        createSet(set);
//        System.out.print(set.toString());
    }
}
