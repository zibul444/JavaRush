package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую
переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();

    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)try
        {
            return Integer.parseInt(reader.readLine());
        }
        catch (NumberFormatException a){
//            System.out.println("Введите число");
        }
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) try
        {
            return Double.parseDouble(reader.readLine());
        }
        catch (NumberFormatException a){
//            System.out.println("Введите дробное число в формате Double");
        }
    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            return Boolean.parseBoolean(reader.readLine());
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(readBoolean());

    }
}
