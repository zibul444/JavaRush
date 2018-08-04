package com.javarush.test.level12.lesson02.task05;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o)
    {
        if (o instanceof Cow)
        {
            return "Корова";
        } else if (o instanceof Whale)
        {
            return "Кит";
        } else if (o instanceof Dog)
        {
            return "Собака";
        } else if (o instanceof Pig)
        {
            return "Свинья";
        } else
            return "Неизвестное животное";

//
//        try {
//            Cow cow = (Cow) o;
//            return "Корова";
//        }
//        catch (Exception e){}
//
//        try{
//            Whale whale = (Whale) o;
//            return "Кит";
//        }
//        catch (Exception e){}
//
//        try{
//            Dog dog = (Dog) o;
//            return "Собака";
//        }
//        catch (Exception e){}
//        //Напишите тут ваше решение
//        return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
