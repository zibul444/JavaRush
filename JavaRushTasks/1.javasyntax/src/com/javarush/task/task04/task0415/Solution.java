package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> triangle = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            triangle.add(Integer.parseInt(reader.readLine()));
        }

        if (triangle.get(0) + triangle.get(1) > triangle.get(2) && triangle.get(1) + triangle.get(2) > triangle.get(0) && triangle.get(2) + triangle.get(0) > triangle.get(1) ){
            System.out.println("Треугольник существует.");
        }else System.out.println("Треугольник не существует.");
    }
}