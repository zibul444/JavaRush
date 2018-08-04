package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int []> arrayInt = new ArrayList<int[]>();
        int[] intArr1 = new int[] {5,2,4,7,0};

        for (int i = 0; i < intArr1.length; i++) {
            int[] buf = new int[intArr1[i]];
            for (int b = 0; b < intArr1[i]; b++) {
                buf[b] = (int) (Math.random() * ((9 - 1) + 1));
            }
            arrayInt.add(buf);
        }

        //напишите тут ваш код
        return arrayInt;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
