package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human sun = new Human("Вася4", true, 50);
        Human daughter1 = new Human("Дуся5", false, 45);
        Human daughter2 = new Human("Дуся4", false, 40);

        Human father = new Human("Вася3", true, 75, sun, daughter1, daughter2);
        Human mother = new Human("Дуся3", false, 70, sun, daughter1, daughter2);

        Human grandfather1 = new Human("Вася2", true, 110, father);
        Human grandfather2 = new Human("Вася1", true, 90, mother);

        Human grandmother1 = new Human("Дуся2", false, 91, father);
        Human grandmother2 = new Human("Дуся1", false, 89, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sun);
        System.out.println(daughter1);
        System.out.println(daughter2);

        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }
        Human(String name, boolean sex, int age, Human child){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
            this.children.add(child);
        }
        Human(String name, boolean sex, int age, Human child, Human child2, Human child3){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
            this.children.add(child);
            this.children.add(child2);
            this.children.add(child3);
        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
