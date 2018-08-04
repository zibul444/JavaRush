package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        int i = 0;
        while (true){
            strings.add(reader.readLine());
            if (strings.get(i).equals("end")){
                strings.remove(i);
                break;
            }
            i++;
        }
        i = 0;
        for (String s: strings) {
            System.out.println(strings.get(i));
            i++;
        }
        //напишите тут ваш код
    }
}
