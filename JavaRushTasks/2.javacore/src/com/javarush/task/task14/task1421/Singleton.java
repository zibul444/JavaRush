package com.javarush.task.task14.task1421;

/**
 * Created by ab.cherkashin on 07.03.2017.
 */
public final class Singleton {
    private static volatile Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
