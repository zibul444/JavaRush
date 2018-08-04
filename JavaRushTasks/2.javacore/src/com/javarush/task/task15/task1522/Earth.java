package com.javarush.task.task15.task1522;

/**
 * Created by ab.cherkashin on 15.03.2017.
 */
public class Earth implements Planet {
    private static volatile Earth instance;

    private Earth(){
//        System.out.println("EARTH");
    }

    public static Earth getInstance(){
        if (instance == null){
            synchronized (Earth.class){
                if (instance == null){
                    instance = new Earth();
                }
            }
        }
        return instance;
    }
}
