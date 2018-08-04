package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());


    }

    public static void main(String[] args) {
        threads.get(threads.size()-1).start();
        try {
            threads.get(threads.size()-1).join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main() - is dead");
    }
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true){
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            InterruptedException e = new InterruptedException();
            try {
                throw e;
            } catch (InterruptedException e1) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {

        }

        @Override
        public void showWarning() {
            if (Thread.currentThread().isAlive()){
                Thread.currentThread().interrupted();
            }
        }
    }
    public static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<>();
            String s;
            int result = 0;
            while (true){
                try {
                    if ((s = reader.readLine()) == "N"){
                        break;
                    } else {
                        list.add(Integer.parseInt(s));
                    }
                } catch (IOException e) {
                    break;
                }catch (NumberFormatException e) {
                    break;
                }
            }
            for (int i: list) {
                result += i;
            }
            System.out.println(result);
        }
    }
}