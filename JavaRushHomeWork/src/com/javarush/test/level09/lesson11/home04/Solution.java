package com.javarush.test.level09.lesson11.home04;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat formatInput =  new SimpleDateFormat("MM/dd/yyyy");//указали формат ввода
        SimpleDateFormat formatOutput = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);// указали формат вывода

        String input = reader.readLine();//ввели дату
        Date d = formatInput.parse(input); // инициализировали дату введенными значениями

        System.out.println(formatOutput.format(d).toUpperCase()); //выводим уже отформатированную и заглавными месяц, т.к. в итоге получаем просто строку

        //напишите тут ваш код
    }
}
