package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{
        List<String> s = new ArrayList<>(3);
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    s.add(reader.readLine());
                    /*if (!reader.ready()){
                    }*/
                } catch (IOException e) {
                }
            }

        }

        public void printResult() {
            try {
                System.out.println(s.get(0) + " " + s.get(1) + " " + s.get(2));
            }catch (IndexOutOfBoundsException e){
                this.printResult();
            }
        }
    }

}
