package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(reader.readLine());

        if (i > 0) {
            System.out.println(i = i + i);
        }else if (i < 0) {
            System.out.println(i = i+1);
        }else if (i == 0) {
            System.out.println(i);
        }

    }

}