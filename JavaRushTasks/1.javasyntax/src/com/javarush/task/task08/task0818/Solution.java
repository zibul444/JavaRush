package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Qwe", 123);
        map.put("Wer", 234);
        map.put("Ert", 345);
        map.put("Rty", 456);
        map.put("Tyu", 567);
        map.put("Yui", 678);
        map.put("Uio", 789);
        map.put("Iop", 890);
        map.put("Opa", 901);
        map.put("Pas", 1230);

        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (entry.getValue() < 500)  map.remove(entry.getKey());
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//        }
    }


}