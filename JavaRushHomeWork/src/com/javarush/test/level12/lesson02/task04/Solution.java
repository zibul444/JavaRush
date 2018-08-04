package com.javarush.test.level12.lesson02.task04;

/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
            try{
                Cat cat = (Cat) o;
                System.out.println(cat.getNameClass());
            }
            catch (Exception e) {}
            try{
                Dog dog = (Dog) o;
                System.out.println(dog.getNameClass());
            }
            catch (Exception e) {}
            try{
                Bird bird = (Bird) o;
                System.out.println(bird.getNameClass());
            }
            catch (Exception e) {}
            try{
                Lamp lamp = (Lamp) o;
                System.out.println(lamp.getNameClass());
            }
            catch (Exception e) {}

        //Напишите тут ваше решение
    }

    public static class Cat {
        public String getNameClass(){
            return "Кошка";
        }
    }

    public static class Dog {
        public String getNameClass(){
            return "Собака";
        }
    }

    public static class Bird {
        public String getNameClass(){
            return "Птица";
        }
    }

    public static class Lamp {
        public String getNameClass(){
            return "Лампа";
        }
    }
}
