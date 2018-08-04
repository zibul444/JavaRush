package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayLists = new ArrayList[3];
        arrayLists[0] = new ArrayList<String>();
        arrayLists[0].add("qwe");
        arrayLists[0].add("asd");
        arrayLists[0].add("zxc");
        arrayLists[1] = new ArrayList<String>();
        arrayLists[1].add("qwe");
        arrayLists[1].add("asd");
        arrayLists[1].add("zxc");
        arrayLists[2] = new ArrayList<String>();
        arrayLists[2].add("qwe");
        arrayLists[2].add("asd");
        arrayLists[2].add("zxc");

        //напишите тут ваш код
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}