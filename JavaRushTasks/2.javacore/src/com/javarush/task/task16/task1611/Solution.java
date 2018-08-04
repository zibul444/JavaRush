package com.javarush.task.task16.task1611;

/* 
Часы
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Solution {
    public static volatile boolean isStopped = false;
    static String print = new String("Tik");


    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("Clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }
//        DateFormat format = new SimpleDateFormat("ss сек") ;
////            format.setTimeZone(TimeZone.getTimeZone("UTC"));
//            System.out.println(format.format(new Date()));
        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();

                }
            } catch (InterruptedException e) {}
        }

        private void printTikTak() throws InterruptedException {
//            print = "Tik";
            System.out.println(print );
            Thread.sleep(500);
            print = "Tak";
            System.out.println(print );
            print = "Tik";
            Thread.sleep(500);

            //add your code here - добавь код тут
        }
    }
}
