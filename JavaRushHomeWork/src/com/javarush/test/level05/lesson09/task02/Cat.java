package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat
{
    protected String name, color, address;
    protected int age, wight = 1;

    public/**/ Cat(String name)
    {
        this.name = name;
    } //- Имя,
    public Cat(String name, int wight, int age) //- Имя, вес, возраст
    {
        this.name = name;
        this.wight = wight;
        this.age = age;
    }
    public Cat(String name, int age) //- Имя, возраст (вес стандартный)
    {
        this.name = name;
        this.age = age;
        this.wight = 1;
    }
    public Cat(int wight, String color) //- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
    {
        this.wight = wight;
        this.color = color;
    }
    public Cat(int wight, String color, String address) //- вес, цвет, адрес ( чужой домашний кот)
    {
        this.wight = wight;
        this.color = color;
        this.address = address;
    }
}
