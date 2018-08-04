package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(reader.readLine());
        if (i < 1000 && i > 0){
            if (i%2 == 0){
                if (i < 10 && i > 0){
                    System.out.println("четное однозначное число");
                }else if (i < 100 && i > 9){
                    System.out.println("четное двузначное число");
                }if (i > 99 && i < 1000){
                    System.out.println("четное трехзначное число");
                }
            }else {
                if (i < 10 && i > 0){
                    System.out.println("нечетное однозначное число");
                }else if (i < 100 && i > 9){
                    System.out.println("нечетное двузначное число");
                }if (i > 99 && i < 1000){
                    System.out.println("нечетное трехзначное число");
                }
            }
        }

    }
}
