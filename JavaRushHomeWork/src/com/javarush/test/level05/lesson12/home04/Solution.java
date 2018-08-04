package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
//        Рабочий вариант закаминтирован
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd M yyyy");
        System.out.println(format1.format(d)); // 03 12 2015
//            Date d = new Date();
////            SimpleDateFormat format1 = new SimpleDateFormat("yyyy MM dd");
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(format1.format(d)); // 03 12 2015

//        SimpleDateFormat format2 = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");
//        System.out.println(format1.format(d)); //25.02.2013 09:03
//        System.out.println(format2.format(d));
    }
}
