package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int i, int y){
        if (i < y) {return i;}
        else return y;
    }

    public static long min(long l, long g){
        if (l < g) {return l;}
        else return g;
    }

    public static  double min(double d, double b){
        if (d < b) {return d;}
        else return b;
    }

    //Напишите тут ваши методы
}
