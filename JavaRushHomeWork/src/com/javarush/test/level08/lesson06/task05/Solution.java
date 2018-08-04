package com.javarush.test.level08.lesson06.task05;

import java.util.*;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList<Objects> arrayList = new ArrayList<Objects>();
        return arrayList;
        //напишите тут ваш код
    }

    public static List  getListForSet()
    {
        ArrayList<Objects> arrayList = new ArrayList<Objects>();
        return arrayList;
        //напишите тут ваш код

    }

    public static List  getListForAddOrInsert()
    {
        LinkedList<Objects> linkedList = new LinkedList<Objects>();
        return linkedList;
        //напишите тут ваш код

    }

    public static List  getListForRemove()
    {
        LinkedList<Objects> linkedList = new LinkedList<Objects>();
        return linkedList;
        //напишите тут ваш код

    }

    /*public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        for (int i = 0; i < 10000; i++)
        {
            arrayList.add("rty");
        }

        Date currentGetDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            arrayList.get(i);
        }
        Date newGetDate = new Date();

        Date currentSetDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            arrayList.set(i, "fgh");
        }
        Date newSetDate = new Date();

        Date currentInsertDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            arrayList.add(0, "vbn");
        }
        Date newInsertDate = new Date();

        Date currentRemoveDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            arrayList.remove(i);
        }
        Date newRemoveDate = new Date();


        System.out.println("arrayList get " + (newGetDate.getTime() - currentGetDate.getTime()));
        System.out.println("arrayList set " + (newSetDate.getTime() - currentSetDate.getTime()));
        System.out.println("arrayList insert " + (newInsertDate.getTime() - currentInsertDate.getTime()));
        System.out.println("arrayList remove " + (newRemoveDate.getTime() - currentRemoveDate.getTime()));

        System.out.println();
        System.out.println();


        for (int i = 0; i < 10000; i++)
        {
            linkedList.add("qwe");
        }

        currentGetDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            linkedList.get(i);
        }
        newGetDate = new Date();

        currentSetDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            linkedList.set(i, "asd");
        }
        newSetDate = new Date();

        currentInsertDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            linkedList.add(0, "zxc");
        }
        newInsertDate = new Date();

        currentRemoveDate = new Date();

        for (int i = 0; i < 10000; i++)
        {
            linkedList.remove(i);
        }
        newRemoveDate = new Date();

        System.out.println("linkedList get " + (newGetDate.getTime() - currentGetDate.getTime()));
        System.out.println("linkedList set " + (newSetDate.getTime() - currentSetDate.getTime()));
        System.out.println("linkedList insert " + (newInsertDate.getTime() - currentInsertDate.getTime()));
        System.out.println("linkedList remove " + (newRemoveDate.getTime() - currentRemoveDate.getTime()));
    }*/
}
