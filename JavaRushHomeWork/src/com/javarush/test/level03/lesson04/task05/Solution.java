package com.javarush.test.level03.lesson04.task05;

/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
15
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        for(int a = 1, i = 1; i < 11; i++, a+=i)
        {
            System.out.println(a);
        }
    }
}