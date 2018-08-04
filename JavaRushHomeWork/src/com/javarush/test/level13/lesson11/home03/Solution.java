package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine(); // C:\File2.txt
        reader.close();

        BufferedReader inStream = new BufferedReader(new FileReader(nameFile));
        String data;

        while ((data = inStream.readLine()) != null) {
            System.out.println(data); //читаем одну строку из потока для чтения
        }

        inStream.close(); //закрываем потоки

        //add your code here
    }
}