package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Первый", "Алексей");
        map.put("Второй", "Вася");
        map.put("Третий", "Алексей");
        map.put("Четвертый", "Федя");
        map.put("Пятый", "Алексей");
        map.put("Шестой", "Петя");
        map.put("Седьмой", "Алексей");
        map.put("Восьмой", "Дуся");
        map.put("Девятый", "Алексей");
        map.put("Десятый", "Костя");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        int counts = 0;
        String duplicate;
        Iterator<Map.Entry<String, String>> it = map2.entrySet().iterator();
        Map.Entry<String, String> pair;

        while (it.hasNext()) {
            pair = it.next();

            for (Map.Entry<String, String> pair2 : map2.entrySet()) {
                if (pair.getValue().equals(pair2.getValue()))
                    counts++;
                if (counts > 1)
                    map.remove(pair.getKey());
            }
            counts = 0;
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
