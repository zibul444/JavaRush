package com.javarush.task.task15.task1522;

/**
 * Created by ab.cherkashin on 15.03.2017.
 */
public class Sun implements Planet {
    private static volatile Sun instance;

    private Sun(){
//        System.out.println("Sun");
    }

    public static Sun getInstance(){
        if (instance == null){
            synchronized (Sun.class){
                if (instance == null){
                    instance = new Sun();
                }
            }
        }
        return instance;
    }
}
