package com.javarush.test.level13.lesson11.bonus02;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Person implements RepkaItem{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }

    public void pull(Person second) {
        System.out.println(name + " за " + second.getNamePadezh());
    }
}
