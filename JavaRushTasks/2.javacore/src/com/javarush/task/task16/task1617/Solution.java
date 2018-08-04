package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }
        String s= "Марш!";

        public void run() {
            if (countSeconds > 3.5){
                s = "Прервано!";
            }

            while (countSeconds > 0){

                System.out.print(countSeconds + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.print(s);
                    break;
                }
                countSeconds--;
            }
            if (!(s == "Прервано!")){
                System.out.println(s);
            }
            //add your code here - добавь код тут
        }
    }
}
