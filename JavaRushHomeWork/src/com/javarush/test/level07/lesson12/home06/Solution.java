package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {
        Human Fedy = new Human("Федя", true, 56, null, null);
        Human Anna = new Human("Анна", false, 55, null, null);

        Human Vasy = new Human("Вася", true, 62, null, null);
        Human Alla = new Human("Алла", false, 60, null, null);

        Human Bory = new Human("Боря", true, 40, Vasy, Alla);
        Human Vasylisa = new Human("Василиса", false, 39, Fedy, Anna);

        Human Shoorik = new Human("Шурик", true, 15, Bory, Vasylisa);
        Human Koly = new Human("Коля", true, 17, Bory, Vasylisa);
        Human Toly = new Human("Толя", true, 10, Bory, Vasylisa);

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother, father;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
            System.out.println(this);
        }
        //напишите тут ваш код
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}