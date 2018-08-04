package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
//        try {
//            float i = 1 / 0;
//
//        } catch (Exception e) {
//            exceptions.add(e);
//        }


        try{
            ArithmeticException exception = new ArithmeticException();
            throw exception;
        } catch (ArithmeticException e){
            exceptions.add(e);
        }
        try{
            ArrayIndexOutOfBoundsException exception = new ArrayIndexOutOfBoundsException();
            throw exception;
        } catch (ArrayIndexOutOfBoundsException e){
            exceptions.add(e);
        }
        try{
            ArrayStoreException  exception = new ArrayStoreException ();
            throw exception;
        } catch (ArrayStoreException e){
            exceptions.add(e);
        }
        try{
            ClassCastException  exception = new ClassCastException ();
            throw exception;
        } catch (ClassCastException e){
            exceptions.add(e);
        }
        try{
            NullPointerException   exception = new NullPointerException  ();
            throw exception;
        } catch (NullPointerException e){
            exceptions.add(e);
        }
        try{
            IllegalArgumentException  exception = new IllegalArgumentException ();
            throw exception;
        } catch (IllegalArgumentException e){
            exceptions.add(e);
        }
        try{
            IllegalMonitorStateException  exception = new IllegalMonitorStateException ();
            throw exception;
        } catch (IllegalMonitorStateException e){
            exceptions.add(e);
        }
        try{
            IllegalStateException  exception = new IllegalStateException ();
            throw exception;
        } catch (IllegalStateException e){
            exceptions.add(e);
        }
        try{
            IllegalThreadStateException  exception = new IllegalThreadStateException ();
            throw exception;
        } catch (IllegalThreadStateException e){
            exceptions.add(e);
        }
        try{
            NegativeArraySizeException   exception = new NegativeArraySizeException  ();
            throw exception;
        } catch (NegativeArraySizeException e){
            exceptions.add(e);
        }
        //напишите тут ваш код

    }

}
