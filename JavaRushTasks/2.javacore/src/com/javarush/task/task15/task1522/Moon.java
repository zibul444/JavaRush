package com.javarush.task.task15.task1522;

/**
 * Created by ab.cherkashin on 15.03.2017.
 */
public class Moon implements Planet {
    private static volatile Moon instance;

    private Moon(){
//        System.out.println("Moon");
    }

    public static Moon getInstance(){
        if (instance == null){
            synchronized (Moon.class){
                if (instance == null){
                    instance = new Moon();
                }
            }
        }
        return instance;
    }
}
