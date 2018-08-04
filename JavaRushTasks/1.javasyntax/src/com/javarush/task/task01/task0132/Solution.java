package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int [] n = new int[3];
        n[0] = number / 100;
        n[1] = (number - (n[0] * 100)) / 10;
        n[2] = (number - (n[0] * 100 + n[1] * 10));


        int result = n[0] + n[1] + n [2];
        //напишите тут ваш код
        return result;
    }
}