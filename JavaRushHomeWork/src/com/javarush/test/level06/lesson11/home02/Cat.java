package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
        cats.add(this);// этот кот добавляем в лист котов
    }
    static ArrayList<Cat> cats;

    public static void main(String[] args) {
        int i = 0;
        cats = new ArrayList<Cat>(); // инициализируем позе, для экономии ресурсов
        while (i < 10){ // просто создаем котов
            i++;
            new Cat();
        }
        printCats();
    }

    public static void printCats() {
        System.out.println(cats);
    }
}
