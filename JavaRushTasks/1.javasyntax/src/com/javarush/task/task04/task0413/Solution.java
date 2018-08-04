package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(dayWeek(Integer.parseInt(reader.readLine())));
        //напишите тут ваш код
    }
    public static String dayWeek(int number){
        if (number <= 7 && number >= 1){
            switch (number){
                case 1:
                    return "понедельник";
                case 2:
                    return "вторник";
                case 3:
                    return "среда";
                case 4:
                    return "четверг";
                case 5:
                    return "пятница";
                case 6:
                    return "суббота";
                case 7:
                    return "воскресенье";
            }
        }
        return "такого дня недели не существует";
    }
}