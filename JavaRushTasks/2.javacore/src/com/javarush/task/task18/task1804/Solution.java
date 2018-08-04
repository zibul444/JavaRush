package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> countByte = new HashMap<>();

        int b, min = Integer.MAX_VALUE;
        while (inputStream.available() != 0){
            b = inputStream.read();
            if (countByte.get(b) == null){
                countByte.put(b, 1);
            } else {
                countByte.put(b, countByte.get(b) + 1);
            }
        }
        reader.close();
        inputStream.close();

        for (HashMap.Entry<Integer, Integer> pair : countByte.entrySet()){
            if (min > pair.getValue()){
                min = pair.getValue();
            }
        }
        for (HashMap.Entry<Integer, Integer> pair : countByte.entrySet()){
            if (pair.getValue() == min){
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
