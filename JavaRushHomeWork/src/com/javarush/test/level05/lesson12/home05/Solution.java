package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chislo = "0";
        int buf, sum = 0;
        while (!(chislo.equals("сумма"))) {
            chislo = reader.readLine();

            if (chislo.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            else try {
                buf = Integer.parseInt(chislo);
                sum = sum + buf;
            }
            catch (NumberFormatException a){}

        }
    }
}
//\test\JavaRushHomeWork
//\production\JavaRushHomeWork