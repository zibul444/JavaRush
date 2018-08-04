package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        TreeSet<Integer> setByte = new TreeSet<>();

        int b;
        while (inputStream.available() != 0){
            b = inputStream.read();
            if (!setByte.contains(b)){
                setByte.add(b);
            }
        }
        reader.close();
        inputStream.close();

        for (Integer i : setByte) {
            System.out.print(i + " ");
        }
    }
}
