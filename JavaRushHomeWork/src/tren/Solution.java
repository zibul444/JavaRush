package tren;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Михаил Алексеевич on 07.08.2016.
 */
public class Solution
{
    static class Человек {
        static int кол_во_населения_планеты_земля =0;



        String name;
        int age;

        public Человек(String name){
            кол_во_населения_планеты_земля ++;

            this.name = name;
        }

    }

    public static void main(String[] args) throws InterruptedException {
//        Человек адам = new Человек("Адам");
//        Человек адам1 = new Человек("Адам1");
//        Человек адам2 = new Человек("1");
//
//        System.out.println(адам.age);
//        System.out.println(Человек.кол_во_населения_планеты_земля);

        Pencil lalala = new Pencil(" ", " ", 2, " ");
        lalala.setMaterial("qweqwrqer");
        System.out.println(lalala.getMaterial());


    }

}
