package com.javarush.test.level08.lesson11.home09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
//        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(date));
        int dayOfYear = calendar.get(calendar.DAY_OF_YEAR);
        return (dayOfYear % 2 != 0);
    }
}

//    public static void main(String[] args)
//    {
//        System.out.println(isDateOdd("JANUARY 1 2000"));
//        System.out.println(isDateOdd("JANUARY 2 2020"));
//    }
//
//    public static boolean isDateOdd(String date)
//    {
//        Date startTime = new Date(date);
//        startTime.setMonth(0);
//        startTime.setDate(0);
//        Date currentTime = new Date(date);
//        long totalDate = currentTime.getTime() - startTime.getTime();
//        long msDay = 24 * 60 * 60 * 1000;
//        int countDay = (int) (totalDate / msDay);
//        if (countDay == 0 || countDay % 2 != 0) {return true;}
//        else {return false;}
//    }