package com.javarush.test.level11.lesson08.task01;

/* Все скрыто
Скрыть все внутренние переменные класса Cat.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            setName(name);
            setAge (age);
            setWeight(weight);
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge (int age) {
            this.age = age;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }

    }
}
