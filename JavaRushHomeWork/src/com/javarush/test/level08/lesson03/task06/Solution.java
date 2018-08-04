package com.javarush.test.level08.lesson03.task06;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Коллекция HashMap из Object
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double)123);

        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Object> pair = iterator.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

//
//        Date currentTime = new Date();
//        int hours = currentTime.getHours();
//        int mins = currentTime.getMinutes();
//        int secs = currentTime.getSeconds();
//
//        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);

        //напишите тут ваш код
    }
}
