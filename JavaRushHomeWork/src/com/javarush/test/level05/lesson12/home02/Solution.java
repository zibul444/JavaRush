package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man Vasya = new Man("Вася", 25, "Адрес где живет Вася");
        Man Fedya = new Man("Федя", 30, "Адрес где живет Федя");

        Woman Olya = new Woman("Оля", 15, "Адрес где живет Оля");
        Woman Lena = new Woman("Лена", 20, "Адрес где живет Лена");

        System.out.println(Vasya.name + " " + Vasya.age + " " + Vasya.address);
        System.out.println(Fedya.name + " " + Fedya.age + " " + Fedya.address);
        System.out.println(Olya.name + " " + Olya.age + " " + Olya.address);
        System.out.println(Lena.name + " " + Lena.age + " " + Lena.address);
    }
    public static class Man {
        String name;
        int age;
        String  address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }


    public static class Woman {
        String name;
        int age;
        String  address;
       /* public Woman(){}
        public Woman(String name)
        {
            this.name = name;
        }
        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Woman(String name, String addres)
        {
            this.name = name;
            this.addres = addres;
        }
        public Woman(int age)
        {
            this.age = age;
        }
        public Woman(int age, String addres)
        {
            this.age = age;
            this.addres = addres;
        }*/
        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
