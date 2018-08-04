package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Cat> cats1 = new HashSet<Cat>(cats);
        int count = 0;
        for (Cat catSet : cats1) {
            count++;
            if (count==cats1.size()-1) cats.remove(catSet);
        }

        //напишите тут ваш код. пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {

        Set<Cat> cats = new HashSet<Cat>();
        Cat qwe = new Cat();
        cats.add(qwe);
        Cat asd = new Cat();
        cats.add(asd);
        Cat zxc = new Cat();
        cats.add(zxc);
        //напишите тут ваш код. пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat cat: cats) {
            System.out.println(cat.toString());
        }
        // пункт 4
    }
    public static class Cat{
    }
    // пункт 1
}
