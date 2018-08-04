package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k, j, max, min, divider = 1;


        k = Integer.parseInt(reader.readLine());
        j = Integer.parseInt(reader.readLine());

        if (j <= 0 || k <= 0){
            Exception e = new Exception();
            throw e;
        }

        if (k > j){
            max = k;
            min = j;
        }else {
            max = j;
            min = k;
        }


        for (int i = 1 ; i < max; i++){
            if (max % i == 0){
                if (min % i == 0){
                    divider = i;
                }
            }
        }
        System.out.println(divider);

    }
}
