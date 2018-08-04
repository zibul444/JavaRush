package com.javarush.test.level06.lesson05.task04;

/**
 * Created by Михаил Алексеевич on 17.12.2015.
 */
public class abcPoint {
    abcPoint(int a, int b) {
        x = a;
        y = b;
    }

    int x, y;

    public static void main(String[] args) {

        abcPoint p = new abcPoint(5,3), p1;
        p1 = p;
        p = null;
        System.out.println(p.x);
    }
}