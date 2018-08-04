package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            set.add(i);
        }
        return set;
        //напишите тут ваш код
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> removeSet = new HashSet<Integer>();
        for (Integer i : set)
        {
            if (i < 10)
            removeSet.add(i);
        }
        return removeSet;
        //напишите тут ваш код
    }
}
