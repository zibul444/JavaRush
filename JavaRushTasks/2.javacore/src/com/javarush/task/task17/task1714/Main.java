package com.javarush.task.task17.task1714;

/**
 * Created by ab.cherkashin on 31.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Beach beach1 = new Beach("beach1", 8, 6);
        Beach beach2 = new Beach("beach2", 10, 1);
        Beach beach3 = new Beach("beach3", 10, 5);

        System.out.println(beach1.compareTo(beach2));
    }
}
