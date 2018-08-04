package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int i, int y){
        if (i < y) {return y;}
        else return i;
    }

    public static long max(long l, long g){
        if (l < g) {return g;}
        else return l;
    }

    public static  double max(double d, double b){
        if (d < b) {return b;}
        else return d;
    }
    //Напишите тут ваши методы
}
