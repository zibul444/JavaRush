package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine(); // C:\qe\File2.txt

        File file = new File(s);
        PrintWriter fr = new PrintWriter(file);

        while (!("exit".equals(s))) {
            s = bufferedReader.readLine();
            fr.append(s + System.getProperty( "line.separator" )); //перевод строки
        }

        bufferedReader.close();
        fr.close();
    }
}