package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш ко
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> mapInput = new HashMap<>();
        Integer buf = null;

        for (int i = 0; i < 3; i++) {
            try{
                buf = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e){
                System.out.println("говно какое-то ввел");
            }


            if (mapInput.get(buf) == null) {
                mapInput.put(buf, 1);
            }else {
                mapInput.put(buf, mapInput.get(buf) + 1);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = mapInput.entrySet().iterator();

        Map.Entry<Integer, Integer> pair;
        while (iterator.hasNext()){
            pair = iterator.next();
            if (pair.getValue() > 1){
                for (int i = 0; i < pair.getValue(); i++) {
                    System.out.print(pair.getKey() + " ");
                }
            }
        }

    }
}
