package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {

                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
        /*int i;
        int r[i] = new int{};
        for (int i1; i1 < 10; i1++)*/

 /*       int[] ar1;
        ar1 = new int[10];

        for(int i = 0; i <  ar1.length; i++)
        {
            ar1[i] = (int) Math.floor(Math.random() * 10);
            System.out.print(ar1[i] + "  ");
            ar1[0] = (int)Math.random();
        }

        {

        }
    }
}

  */