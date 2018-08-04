package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/
// Отсортировал массив, точно также можно заменить массив на переменные, в цикле пременена "Пузырьковая сортировка"
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner skan = new Scanner(System.in);

        int[] a = new int[3];
        a[0] = skan.nextInt();
        a[1] = skan.nextInt();
        a[2] = skan.nextInt();

        //Сама сортировка
        int i = 1;
        while(i < a.length) {
            if(i==0 || a[i - 1] <= a[i])
                i++;
            else {
                int buf = a[i];
                a[i] = a[i - 1];
                a[i - 1] = buf;
                i--;
            }
        }
        for (i = 0; i < a.length ; i++)
        {
            System.out.println(a[i]);
        }
    }
}
//        Arrays.sort(a); - если нужно сортировать по порядку, от большего к меньшему.


/*
----------Гномик Сорт.-----------------
        int i = 1;
        while(i < a.length) {
            if(i==0 || a[i - 1] <= a[i])
                i++;
            else {
                int buf = a[i];
                a[i] = a[i - 1];
                a[i - 1] = buf;
                i--;
            }
        }
 ---------------------------------------
 -----------------Пузырьковая сорт---------------------
         for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j] < a[j + 1]){
                    int buf = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = buf;
                }
            }
        }
--------------------------------------------------------
*/