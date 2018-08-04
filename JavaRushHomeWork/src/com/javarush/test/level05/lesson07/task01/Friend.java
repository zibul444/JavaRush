package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    public static void main(String[] args)
    {
        Friend lalala = new Friend("fedia", 22, true);
        Friend lalala2 = new Friend();
        lalala2.initialize("masha", 21, false);
        lalala2.age = 25;
        lalala2.name = "pasha";
        lalala2.sex = false;
        lalala.initialize("pasha", 25, true);
    }
    public static String name;
    public static int age;
    public static boolean sex;

    public Friend()
    {}
    public Friend(final String name)
    {
        this.name = name;
    }
    public Friend(final String name, final int age)
    {
        this.name = name;
        this.age = age;
    }


    public Friend(final String name, final int age, final boolean sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void initialize(final String name)
    {
        this.name = name;
    }

    public void initialize(final String name, final int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(final String name, final int age, final boolean sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
