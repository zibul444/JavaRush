package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            sequence.add(scanner.nextInt());
//            sequence.add(Integer.parseInt(reader.readLine()));
        }

        int max = 0;
        int currMax = 1;
        Integer buf = sequence.get(0);

        for (int i = 1; i < sequence.size(); i++) {
            if (sequence.get(i) == buf){
                currMax++;
            }else {
                buf = sequence.get(i);
                if (currMax > max){
                    max = currMax;
                }
                currMax = 1;
            }
        }
        if (currMax > max){
            max = currMax;
        }
        System.out.println(max);
    }
}