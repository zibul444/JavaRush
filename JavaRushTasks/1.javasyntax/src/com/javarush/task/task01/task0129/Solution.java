package com.javarush.task.task01.task0129;

/* 
Считаем длину окружности
*/

//import java.math.*;

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {

        Double L = 2 * 3.14 * radius;
//        Double L = 2 * Math.PI * radius;

        System.out.println(L);
        //напишите тут ваш код
    }
}